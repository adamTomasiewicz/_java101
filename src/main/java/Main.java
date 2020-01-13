/*
import java.util.Random;

public class Main {
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    static int sumElementsInArray(int[] array) {
        int sum = 0;
        for (int elem : array) sum += elem;
        return sum;
    }

    static int multiplyElementsInArray(int[] array) {
        int sum = 1;
        for (int elem : array) sum *= elem;
        return sum;
    }

    static double avarageElementsInArray(int[] array) {
        double sum = 0;
        for (int elem : array) sum += elem;
        sum = 1.0 * sum / array.length;
        return sum;
    }

    static int sumElementsInaLineInMatrix(int[][] matrix, int line) {
        int sum = 0;
        for (int elem : matrix[line]) sum += elem;
        return sum;
    }

    static int sumElementsInaColumnInMatrix(int[][] matrix, int column) {
        int sum = 0;
        for (int[] array : matrix)
            while (array.length - 1 >= column) {
                sum += array[column];
                break;
            }
        return sum;
    }

    static int multipliedElementsInALineFromMatrix(int[][] matrix, int line) {
        int sum = 1;
        for (int elem : matrix[line]) sum *= elem;
        return sum;
    }

    static int multipliedElementsInAColumnFromMatrix(int[][] matrix, int column) {
        int sum = 1;
        for (int[] array : matrix)
            while (array.length - 1 >= column) {
                sum *= array[column];
                break;
            }
        return sum;
    }

    static double avarageElementsInALineFromMatrix(int[][] matrix, int line) {
        double sum = 0;
        int counter = 0;
        for (int elem : matrix[line]) {
            sum += elem;
            counter++;
        }
        return sum / counter;
    }

    static double avarageElementsInAColumnFromMatrix(int[][] matrix, int column) {
        double sum = 0;
        int counter = 0;
        for (int[] array : matrix)
            while (array.length - 1 >= column) {
                sum += array[column];
                counter++;
                break;
            }
        return sum / counter;
    }

    public static void main(String[] args) {
        //matrix
        int[][] matrix1 = {
                {6, 7, 8, 9, 11, 15},
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8, 9}};
        for (int l = 0; l < matrix1.length; l++) {
            for (int c = 0; c < matrix1[l].length; c++) {
                System.out.print(matrix1[l][c] + "  ");
            }
            System.out.println();
        }
        System.out.println(sumElementsInaLineInMatrix(matrix1, 1));
        System.out.println(sumElementsInaColumnInMatrix(matrix1, 3));
        System.out.println(multipliedElementsInALineFromMatrix(matrix1, 3));
        System.out.println(multipliedElementsInAColumnFromMatrix(matrix1, 3));
        System.out.println(avarageElementsInALineFromMatrix(matrix1, 3));
        System.out.println(avarageElementsInAColumnFromMatrix(matrix1, 3));

        Random random1=new Random();
        int[] array1 = new int [15];
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = random1.nextInt(11)+10;
        }
        for (int elem:array1) System.out.print(elem+ " ");
        System.out.println("copied array");
        int[] copiedArray =new int[10];
        System.arraycopy(array1, 2, copiedArray,2, Math.min(array1.length, copiedArray.length)-2);
        for (int i = 0; i <copiedArray.length ; i++) System.out.print(copiedArray[i]+" ");
        int[] test1 = new int[Math.min(array1.length, copiedArray.length)];
       */
/* int x = 4;
        //if
        if (x==4) System.out.println("4");
        else if (x%2==0) System.out.println("parzysta");
        else System.out.println("inna");
        //switch
         x = 3;
        switch (x) {
            case 3:
                System.out.println("option 3: x = " + x);
            case 2:
                System.out.println("option 2: x = " + x);
                break;
            default:
                System.out.println("default option: x = " + x);
                break;}
        // while
        x = 13;
        while (x>8) {
            if (x %2==0) System.out.print(x+" ");
            x --; }


        int[] array5 = {2, 3, 4, 55, 66};
        System.out.println("sum:"+sumElementsInArray(array5));
        System.out.println("multi:"+multiplyElementsInArray(array5));
        System.out.println("avarage:"+avarageElementsInArray(array5));



        System.out.println(matrix1[2][3]);
        int counter = 0;
        boolean isMonday = false;
        System.out.println(counter);
        System.out.println(isMonday);
        byte b1 = 123;
        int result = 1234567899 + 1234567899;
        System.out.println(divide(5, 0));
        char c2 = '\u0119';
        System.out.println(c2);

        Object o1 = new Object();*//*

*/
/*        //Arrays
        int[] array1 = new int[3];
        int[] array2 = new int[] {11,22,33,44};
        char[] array3 = {'a','b','c'};
        System.out.println(array3[2]);

        for (int i=0; i<array2.length; i++) System.out.println(array2[i]);
        System.out.println("@@@@@@@");
        for (int i=array2.length -1; i>=0; i--) System.out.println(array2[i]);
        System.out.println("@@@@@@@");
        for (int i=array2.length -1; i>=0; i--) System.out.println(array2[array2.length-1-i]);
        System.out.println("@@@@@@@");
        for (char charr:array3) System.out.println(charr);*//*


    }


}


*/
