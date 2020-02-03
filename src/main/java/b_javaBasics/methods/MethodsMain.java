package b_javaBasics.methods;

import java.util.Random;

public class MethodsMain {
    public static void main(String[] args) {
        Random random1 = new Random();
        int[] array1 = new int[30];
        for (int i = 0; i < array1.length; i++) array1[i] = random1.nextInt(30) + 1;
        for (int i = 0; i < array1.length; i++) System.out.print(array1[i] + " ");
        System.out.println();
        System.out.println("_______________________________");
        for (int elem : array1) {
            if (elem % 3 == 0 && elem % 5 == 0) System.out.print(" fizzbuzz ");
            else if (elem % 3 == 0) System.out.print(" fizz ");
            else if (elem % 5 == 0) System.out.print(" buzz ");
            System.out.print(elem + " ");
        }

    }
}
