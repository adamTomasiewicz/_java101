package pl.adamTomasiewicz.a_temp;

import java.util.*;

public class exercise4 {

    public static void main(String[] args) {

        int[] testArray1 = new int[]{1,1,1,2,2,3,3,3};
        int[] testArray2 = new int[]{1,1,2,2,3};
        int[] testArray3 = new int[]{1,1,2,2,2,3,3};

        System.out.println(maxValue(testArray1));
    }


    static int maxSpan (int [] nums) {
        int maxSpanFound = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(nums[i] == nums [j]) {
                    int candidate =j-i +1;
                    //maxSpanFound = Math.max(candidate)
                }
            }
        }


        return -1;
    }
static int minValue (int [] array) {
  return -1;
}
    static int maxValue (int [] array) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            listInt.add(array[i]);
        }
        return Collections.max(listInt);
    }


}
