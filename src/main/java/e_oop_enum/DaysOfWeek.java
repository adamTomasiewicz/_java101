package e_oop_enum;

public enum DaysOfWeek {
    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSTDAY("THU"),
    FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
    private String shortName;

    DaysOfWeek (String shortName) {
        this.shortName=shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
