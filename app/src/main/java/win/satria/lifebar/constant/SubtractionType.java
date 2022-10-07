package win.satria.lifebar.constant;

import java.util.List;

public enum SubtractionType {
    ONE_DAY(1440),
    TWO_DAYS(2880),
    THREE_DAYS(4320);

    int minute;

    SubtractionType(int minute) {
        this.minute = minute;
    }

    public int get() {
        return minute;
    }

    public List<String> getNames() {
        return List.of("One Day", "Two Day", "Three Day");
    }

    public List<Integer> getValues() {
        return List.of(ONE_DAY.minute, TWO_DAYS.minute, THREE_DAYS.minute);
    }
}
