package pl.adamTomasiewicz.c_programator.j_exceptions.zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        //pros użytkownika o wprowadznenie pewnej liczby, aż to w końcu zrobi
        //użyj metody toInt() do konwersji String do Integere - co jeśli String nie jest poprawny?

        boolean isCorrectNumber = false;
        Integer result = null;
        String input = "";
        while (!isCorrectNumber) {
            System.out.println("type your input:");
            input = readInput();
            try {
                result = toInt(input);
            } catch (NumberFormatException e) {
                System.out.println("wrong input! input is: " + input);
                continue;
            }
            isCorrectNumber = true;
        }

        System.out.println("correct input! your input is: " + input);
    }


    private static String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static Integer toInt(String integerString) {
        return Integer.parseInt(integerString);
    }

}
