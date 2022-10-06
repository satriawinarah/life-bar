package win.satria.lifebar.service.subtraction;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import win.satria.lifebar.constant.SubtractionType;

public class SubtractionService {

    public SubtractionService() {

    }

    public Integer subtract(ZonedDateTime lastUpdatedTime, ZonedDateTime openTime, SubtractionType subtractionType) {
        long diff = ChronoUnit.MINUTES.between(lastUpdatedTime, openTime);
        return formula(diff, subtractionType.get());
    }

    private Integer formula(long diff, int minute) {
        return (BigDecimal.valueOf(diff).intValue() * 100)/minute;
    }

    public List<SubtractionType> subtractionTypes() {
        return Arrays.asList(SubtractionType.ONE_DAY, SubtractionType.TWO_DAYS,
                SubtractionType.THREE_DAYS);
    }

}
