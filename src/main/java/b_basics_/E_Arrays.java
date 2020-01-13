package b_basics_;

import java.util.*;

public class E_Arrays {

    //THEORY
 /*   public static void main(String[] args) {
        int[] myTable = new int[3];
        myTable[0] = 11;
        myTable[1] = 22;
        myTable[2] = 33;
        int[] myTable2 = {1, 2, 3, 4};

        for (int n : myTable) {
            System.out.print(n + ",");
        }
        for (int n : myTable2) {
            System.out.print(n + ",");
        }

        String a = "kotek1";
        String b = "alicja";
        //  print(2);
        //  print(retur());
    }

    static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "cześć");
        }
    }
    static int retur() {
        Random random = new Random();

        return random.nextInt(100) + 1;
    }*/
 //EXERCISES
//exercise 1: create a program that will return first element from the array
/*    static int firstElement (int [] ints){
        return ints[0];
    }*/
//exercise 2: create a program that will return last element from the array
/*    static int lastElement (int [] ints){
        return ints[ints.length-1];
    }*/
//exercise 3: create a program that will sum values in the array
 /* static int sumElements(int[] ints){
        int sum = 0;
        for (int n:ints)  sum+=n;
        return sum; }*/
//exercise 4: create a program that will sum first and last element from array
  /*  static int sumFirstAndLast(int [] ints){
        int firstElement = ints[0];
        int lastElement = ints[ints.length-1];
    return firstElement+lastElement; }*/
//exercise 5: create a program that will return middle element
/*   static int midElement (int [] ints){
       if (ints.length%2 == 0){
        return ints[ints.length/2-1]; }
       else{
       return ints[ints.length/2];}
   }*/
//exercise 6: create a program that will concat two arrays
/* static int[] concatTwoArrays (int[] ints,int[] ints2){
        int[] concat =new int[ints.length+ints2.length];
        int counter=0;
        for (int i = 0; i <ints.length ; i++) {
            concat[i] = ints[i];
            counter++;
        }
        for (int i = 0; i < ints2.length; i++) {
            concat[counter]=ints2[i];
            counter++;
        }  return concat; }
*/
//exercise 7: create a program that will return sum of values from array
/*static int sumElements(int[] ints){
    int sum = 0;
    for (int n:ints)  sum+=n;
    return sum; }*/
//exercise 8: create a program that returns maxValue
/*    static int maxValue(int[] ints){
        int maxValue = ints[0];
        for (int n:ints) {
             if (n>maxValue){
            maxValue=n;
        } }return maxValue;}*/
//exercise 9: create a program that reverts the array
/*    static int[] swapTable(int [] ints){
        int[] newInts = new int[ints.length];
        int counter = 0;
        for (int i = ints.length-1; i >= 0 ; i--) {
            newInts[i]=ints[counter];
            counter++;
        }return newInts; }*/
//exercise 10: what is wrong with this code
    // ostati element nei zmiesci sie w tablicy
//exercise 11: create a program that will sort array
/*   static int[] sortTable(int[] ints) {
        Arrays.sort(ints);
        return ints; }*/
//exercise 12: create a program that will return array with middle elements from array
/*    static int[] middleElements(int[] ints) {
        int[] newInts = new int[2];
        newInts[0] = ints[ints.length/2 - 1];
        newInts[1] = ints[ints.length/2];
        return newInts;
    }*/
//exercise 13: create a program that will return only 5-letter words from array
/*    static String [] wordsWith5letters(String [] words){
        int counter = 0;
        for (String word:words ) {
            if(word.length()==5) {
                counter++;}}
        int counter2 = 0;
        String[] newWords = new String[counter];
        for (int i = 0; i <words.length ; i++) {
            if(words[i].length()==5) {
                newWords[counter2] = words[i];
                counter2++;}}
        return newWords; }*/
//exercise 14: create a program that will change words to lowerCase
/*   static String [] arrayToLowerCase(String[] words){
       String[] newWords = new String [words.length];
       int counter = 0;
       for (String word:words) {
            newWords[counter++] = word.toLowerCase();}
       return newWords;}*/
//exercise 15: create a program that will return index of a longest word
/*    static int longestWordIndex(String [] words){
        int longestWordIndex = 0;
        int longestWordLength = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>longestWordLength){
                longestWordLength=words[i].length();
                longestWordIndex=i;
            }}return longestWordIndex; }*/
//exercise 16:
/*    static int[] arrayOfEvenNumbers (int [] ints){
        int counter = 0;
        for (int n : ints) {
            if (n%2==0){counter++;}}
        int [] newInts = new int[counter];
        int counter2=0;
        for (int i = 0; i <ints.length ; i++) {
            if(ints[i]%2==0){
                newInts[counter2++]=ints[i];
            }}return newInts; }*/
//exercise 17:
/*        static boolean[] onlyTrueArray(boolean[] booleans){
            int counter = 0;
            for (boolean bool:booleans) {
                if(bool==true){counter++;}
            }
            boolean[] onlyTrueArray = new boolean[counter];
            for (int i = 0; i <counter ; i++) {
                onlyTrueArray[i]=true;
            }return onlyTrueArray;}*/
//exercise 18:
/*    static int occurancesOfNumber (int [] ints, int number){
        int counter = 0;
        for (int i:ints) {
            if(i==number){counter++; }
        }
        System.out.println("number "+number+ " occur "+counter+" times" );
        return counter;
    }*/

    public static void main(String[] args) {
        int[] myTable1 = {1, 2, 3, 2, 3, 4, 3, -5};
        int[] myTable2 = {4, 5, 6};
        byte[] myTable3 = new byte[4];
        System.out.println(java.util.Arrays.toString(myTable3));
        String[] words1 = {"words", "words","Jezusek","czupakabra", "marynata","Wacek"};
        boolean[] booleans = {true, false,false,false,true,false,true};
        int [] testArray1 = new int[1];
        List<Object> myList1 = new ArrayList<>();
        myList1.add("blabla");
        myList1.add(1);
        myList1.add('c');
        myList1.add("abc");
        myList1.add(true);

        Map<Object,Object> myMap1 = new LinkedHashMap<>();
        myMap1.put(1,"jarek");
        myMap1.put(1,"jarek");
        myMap1.put(3,"wacek");
        myMap1.put(2,"wladek");
        System.out.println(myMap1);

        System.out.println(myList1);
       // System.out.println(occurancesOfNumber(myTable1,3));
        //  Collections.sort();
        System.out.println(java.util.Arrays.toString(booleans));
//        for (boolean n:onlyTrueArray(booleans)) {
//            System.out.println(n);
//        }

    }
}


