package pl.adamTomasiewicz.c_programator.k_date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {

    //TODO: SPRAWDZ czy 14-ego sierpnia 2017 roku był poniedziałek

    public static void main(String[] args) {
        System.out.println("Exercise1");
        chceckIfMonday(2017, 8, 15);
    }

    static void chceckIfMonday(int year, int month, int day) {

        LocalDate date1 = LocalDate.of(year, month, day);
        if (date1.getDayOfWeek().equals(DayOfWeek.MONDAY)) System.out.println("It was Monday!");
        else System.out.println("It wasnt  Monday!");
    }


}

