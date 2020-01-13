package z_homework;

import java.util.LinkedHashMap;
import java.util.Map;

class HomeworkMain_4_arrays2 {
    //TODO: exe1: Napisz metode przyjmujaca 2 tablice i zwracajaca tablice elementów wspólnych
/*    public static void main(String[] args) {
        for (Integer i:jointTwoArrays(new int[]{3,4,5,6},new int[]{4,5,6,7,8,})){
            System.out.println(i);
        }}

    static Integer[] jointTwoArrays (int[] array1, int[] array2) {
        Integer[] array3 = new Integer[array1.length];
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array2.length ; j++) {
                if(array1[i] ==array2[j]) array3[i]=array1[i];
            }}
        return array3;
    }*/

    //TODO: exe2: Napisz metode przyjmujaca tablice i wypisujaca z niej wszystkie liczby pierwsze
/*    public static void main(String[] args) {
        printPrimals(new int[]{2, 3, 4, 5, 7, 11,15});
    }
    static void printPrimals (int[] array) {
        for (int i: array) {
            if(checkIfPrimal(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean checkIfPrimal (int n) {
        boolean checkIfPrimal = true;
        if(n==1)return true;
        if(n==2)return true;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){checkIfPrimal=false;}
        }
        return checkIfPrimal;
    }*/

    //TODO: exe3: Napisz metodę przyjmującą 2 wymiarową tablice i zwracającą tablicę będącą sumą elementów w wierszu
    /*public static void main(String[] args) {
        int[][] array1 = {  {1,2,3,4,5},
                            {2,3,4,5},
                            {4,5,6}};
    }

    static int[] sumElementsInArrays (int[][] array1) {
        int highestIndex = 0;
        for (int i = 0; i <array1. ; i++) {


        }

        if()

            int array2[] = new int[];


            return array2;
        }
*/

    //TODO: exe4: Napisz metodę przyjmującą 2 wymiarową tablice i zwracającą tablicę będącą sumą elementów w kolumnie
    public static void main(String[] args) {
        int twoDimesionalArray[][] = {{1,2,3,4},
                                      {1,2,3,4,5},
                                      {1,2,3}};
        sumElementsInColumn(twoDimesionalArray);
    }
    static void sumElementsInColumn (int[][] twoDimensionalArray) {
        int numberOfColumns = 0;
        for (int i = 0; i <twoDimensionalArray.length ; i++) {
            if (twoDimensionalArray[i].length>numberOfColumns) numberOfColumns=twoDimensionalArray[i].length;
        }
        Map<Integer, Integer> sumElementsInColumn = new LinkedHashMap<>();

        for (int i = 0; i <numberOfColumns ; i++) {
            int counter = 0;
            for (int j = 0; j < twoDimensionalArray.length ; j++) {
                try {counter+= twoDimensionalArray[j][i];
                } catch (IndexOutOfBoundsException e) {
                    continue;
                }
            }
            sumElementsInColumn.put(i,counter);
        }
        for (Map.Entry entry:sumElementsInColumn.entrySet() ) {
            System.out.println(entry);
        }
    }

}

