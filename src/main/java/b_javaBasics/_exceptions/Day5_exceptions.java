package b_javaBasics._exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day5_exceptions {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 5;
        array[1] = 2;
        array[2] = 3;


        try {
            System.out.println(array[6]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong index" + e.getLocalizedMessage());
        } finally {
            System.out.println("das");
        }

        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("no file found");
        }

        String name = "Michał";
        try {
            name.charAt(-5);
        } catch (StringIndexOutOfBoundsException e) {

        }

        System.out.println("das");

        Scanner scanner = new Scanner(System.in);
        System.out.println("type value");
        try {
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("wrong value");

        }
        System.out.println("THE END");

    }

}
