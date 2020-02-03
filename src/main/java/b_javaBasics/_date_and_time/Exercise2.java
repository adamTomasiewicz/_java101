package pl.adamTomasiewicz.c_programator.k_date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Exercise2 {
    //TODO: SPRAWDZ ILE JEST PONIEDZIAłKÓW w DANYM MIESIĄCU
    public static void main(String[] args) {

        System.out.println("Exercise2");
        howManyMondaysInAMonth(2019, 10, 1);

    }

    static void howManyMondaysInAMonth(int year, int month, int day) {

        LocalDate firstMonday = LocalDate.of(year, month, day).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
        int mondays = 0;
        do {
            mondays++;
            firstMonday = firstMonday.plusWeeks(1);
        } while (firstMonday.getMonth().equals(Month.of(month)));
        System.out.println("W tym miesiacu jest: " + mondays + " poniedziałków");
    }


}
