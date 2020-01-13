import java.util.Random;

public class SortAlgoritms {

    public static void main(String[] args) {


        Random random1 = new Random();
        int[] array1 = new int[15];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt(10);
        }
        //sortowanie babelkowe
        for (int i = 0; i < array1.length; i++) System.out.print(array1[i] + " ");

        int length = array1.length;
        int range = 0;
        for (int i = 0; i < array1.length; i++) {
            range = length - 1 - i;
            for (int j = 0; j < range; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }

        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) System.out.print(array1[i] + " ");


    }
}
