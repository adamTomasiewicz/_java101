package pl.adamTomasiewicz.b_akademia.others;

import java.util.Scanner;

public class Rekrutacyjne {
    public static void main(String[] args) {
       maxValue();

    }
//zadanie 1: N
    private static void sumaWielokrotności3i5 () {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("wpisz zakres");
        int input=scanner1.nextInt();
        int sum = 0;
        for (int i = 0; i <= input ; i++) {
            if(i%3==0||i%5==0) sum+=i;
        }
        System.out.println(sum);
    }
//zadanie 2: srotowanie babelkowe tablicy
   private static void maxValue() {
       int[] tablica1 = new int[]{-3,14,55,-2,1,66,-22,4};
       for (int number : tablica1) {
           for (int i = 1; i < tablica1.length; i++) {
               if(tablica1[i]>tablica1[i-1]) {
                   int temp = tablica1[i-1];
                   tablica1[i-1] = tablica1[i];
                   tablica1[i] = temp;
               }
           }
       }
       System.out.println(tablica1[0]);
   }
//zadanie 3: napisać sortowanie timsort

}
