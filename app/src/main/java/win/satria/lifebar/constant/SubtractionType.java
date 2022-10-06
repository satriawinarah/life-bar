package win.satria.lifebar.constant;

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
}
