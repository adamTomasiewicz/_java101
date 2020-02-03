package b_javaBasics._arrays;

public class MultiArrays {

    public static void main(String[] args) {
        int[] testArray1 = new int[]{1, 1, 1, 2, 2, 3, 3, 3};
        int[] testArray2 = new int[]{1, 1, 2, 2, 3};
        int[] testArray3 = new int[]{1, 1, 2, 2, 2, 3, 3};
        System.out.println(noTriples(testArray3));
    }

    public static boolean noTriples(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                counter++;
                System.out.println(array[i] + "-" + counter);
            } else {
                counter = 0;
            }
            if (counter == 2) {
                return false;
            }
        }
        return true;
    }
}
