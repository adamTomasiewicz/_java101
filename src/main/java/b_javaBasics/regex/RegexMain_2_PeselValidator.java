package b_javaBasics.regex;

import java.util.Scanner;

public class RegexMain_2_PeselValidator {


    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("type pesel");
        String input1 = "";
        do {
            input1 = scanner1.next();
        }
        while (!is11chars(input1) && !isAllCharactersDigits(input1) && is6firstNumbersRealDate(input1));
        System.out.println("you typed correct pesel");
    }

    private static boolean is11chars(String input) {
        // return input.length() == 11 ? true:false;
        return input.length() == 11;
    }

    private static boolean isAllCharactersDigits(String input) {
        return input.matches("(.*)\\D(.*)");
    }

    private static boolean is6firstNumbersRealDate(String input) {
        int[] inputArray1 = new int[11];
        int[] date1 = new int[8];
        //if (input.charAt(4)
        return false;
    }

}
