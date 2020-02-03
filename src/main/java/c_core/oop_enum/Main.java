package c_core.oop_enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY);

        String mondayString = "MONDAY";

        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            System.out.println(daysOfWeek + ": " + daysOfWeek.getShortName());
        }

        switch (getDay()) {
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSTDAY:
                break;
            case FRIDAY:
                break;
        }

    }

    private static DaysOfWeek getDay() {
        return DaysOfWeek.SATURDAY;
    }
}
