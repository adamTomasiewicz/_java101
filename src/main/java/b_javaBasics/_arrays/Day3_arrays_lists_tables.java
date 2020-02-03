package b_javaBasics.arrays;


public class Day3_arrays_lists_tables {

//GRA W STATKI


//TEORRY
/*public static void main(String[] args) {
        int [] array = new int[3]; // 1,5,10
        int [][] array2D = new int [2][];
        array[0]=1;
        array[1]=5;
        array[2]=10;
        System.out.println(array);
        int[] array2={1,5,10};
        for (int i = 0; i <array2.length ; i++) {
            System.out.print(array2[i]);
        }
        String[] arrayString={"Pon","Wto","Sro", "Czw", "Pia"};
        System.out.println(arrayString);
        for (int i = 0; i <arrayString.length ; i++) {
            System.out.print(arrayString[i]);
        }
        }
        */


//ZAD 1 metoda zwracajaca pierwszy element
/*static int first(int[] array){

    return array[0];
}

    public static void main(String[] args) {
        int[] array1 = {1,3,5,8};
        System.out.println(first(array1));
        int var = first(array1);
        System.out.println("First element : "+ array1);
        }
        */

//ZAD 2 Napisz metodę, która dla danej tablicy liczb całkowitych zwraca ostatni element  tablicy.
/*        static int last (int[] array) {

            return array[array.length - 1];
        }

    public static void main(String[] args) {
        int[] array1 = {1,3,5,8};
        System.out.println(last(array1));
    }*/

    //ZAD 3 Napisz metodę, która jako argument przyjmuje zawsze tablice składającą się z  dwóch elementów liczb całkowitych.
// Metoda ma zwróci sumę elementów tablicy.    sum([1,2]) = 3    sum([4,8]) = 12 
/*    static int sumArray (int[] array) {
        int sumArray = array[0] + array[1];
        return sumArray;}

    public static void main(String[] args) {
        System.out.println(sumArray( new int[]{1,5}));
    }*/
//ZAD 4 Napisz metodę, która dla danej tablicy zwraca sumę pierwszego i ostatniego  elementu tablicy.
/*static int sumArray (int[] array) {
    return array[0] + array[array.length-1];
    }

    public static void main(String[] args) {
        System.out.println(sumArray( new int[]{1,6,7,8}));
    }*/
//ZAD 5 Napisz metodę, która zwraca element środkowy tablicy. 
/*
    static int midArray(int[] array) {
        return array[array.length/2-1];
    }

    public static void main(String[] args) {
        System.out.println(midArray(new int[]{1, 6, 7, 8}));
    }*/
//ZAD 6 Zakładamy,  że mamy 2 tablice 2 elementowe. Nasza metoda powinna zwrócić  nową tablicę, która jest połączona z dwóch tablic.
//plusTwoArrays([-4, 4], [8, 2]) → [-4, 4, 8, 2] 
//plusTwoArrays([9, 1], [3, 10]) → [9, 1, 3, 10]
/*
    static int[] plusTwoArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0; i <array1.length ; i++) {
            newArray[i]=array1[i];
        }
        for (int j = array1.length; j <newArray.length; j++) {
            newArray[j]=array2[j-array1.length];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array1={-4, 4,9,15};
        int[] array2={8, 2};
        int[] newArray2 = plusTwoArrays(array1, array2);
        for (int i = 0; i <plusTwoArrays(array1, array2).length ; i++) {
            System.out.println(plusTwoArrays(array1, array2)[i]);
        }
    }
*/
//ZAD 7 Napisz metodę, która zwraca sumę elementów tablicy całkowitej.    sum([1,2,3]) = 6 

//OPCJA 1
/*static int sumArrayElements(int[] array1, int[] array2) {

        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            j += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            j += array2[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array1={-4, 4,9,15};
        int[] array2={8, 2};
        System.out.println(sumArrayElements(array1,array2));
    }*/
//OPCJA 2 for each
/*   static int sum(int[] array1,int[] array2) {
        int sum = 0;
        for (int i : array1) {
            sum = sum + i;
        }
       for (int i : array2) {
           sum = sum + i;
       }
        return sum;
    }
        public static void main(String[] args) {
        int[] array1={-4, 4,9,15};
        int[] array2={8, 2};
        System.out.println(sum(array1,array2));
    }*/


//ZAD 8 Napisz metodę, która zwraca największy element tablicy całkowitej.   
// max([2,3,5,1,20,25]) = 25 
/*static int maxValueArray (int[] array){
    int maxValue = array[0];
    for (int i = 0; i < array.length; i++) {
        if (maxValue<array[i]){
            maxValue=array[i];
        }
    }
    return maxValue;
}

    public static void main(String[] args) {
        int[] array1 = {2,3,5,1,20,25,19,3};
        System.out.println(maxValueArray(array1));
    }*/

//ZAD 9 Napisz metodę, która odwraca daną tablicę liczb całkowitych.   
// swap([1,2,3]) = [3,2,1] 
/*    static int[] revArray (int [] array){
        int[] newArray = new int[array.length];
        for (int i=newArray.length-1 ; i >=0  ; i--) {
            newArray[i] += array[array.length-1-i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] oldArray = {1,2,3};
        int [] newArray1 = revArray(oldArray);
        for (int i = 0; i < newArray1.length ; i++) {
            System.out.println(newArray1[i]);
        }
}*/
//ZAD 10 Co z tym kodem jest nie tak? 
/*public static void main(String[] args) {

    int[] array =new int[5];
    for (int i = 0; i <5 ; i++) {
      array[i]=12;

    }
}*/
//ZAD 11 Napisz metodę, która zwraca posortowaną tablicę liczb.   
// mySort([4,1,9,15]) = [1,4,9,15] 
/*
    static int[] sortArray(int[] array){
        int[] newArray =

        return Arrays.sort(array);

    }
*/

//ZAD 12 Napisz metodę, która zwraca tablice elementów środkowych.   
// makeMiddle([1,2,3,4]) = [2, 3]   
// Zakładamy, że długość tablicy jest zawsze podzielna przez 2.
/*    static int[] middle(int[] array){
        int[] returnedArray = new int[2];
        returnedArray[0] = array[array.length/2-1];
        returnedArray[1] = array[array.length/2];

        return returnedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] returnedArray2 = middle(array1);
        for (int value: returnedArray2){
            System.out.println("blabla" + value);
        }
    }*/

//EXERCISE 13 Write a method that as an argument accepts list of Strings and returns only 5-letter words.
/*    static List<String> fiveLetterWords (List<String> listWords){

        List<String> listFiveLetterWords = new LinkedList<>();
        for (String listWord : listWords) {
            if (listWord.length()==5) {
                listFiveLetterWords.add(listWord);
            }

        }
        return listFiveLetterWords;
    }

    public static void main(String[] args) {
        List<String> words = new LinkedList<>(Reader.readStringListFromScanner());
        System.out.println(fiveLetterWords(words));

    }*/
//Exercise 14 Write a method that as an argument accepts list of Strings returns the same list with all strings toLowerCase.
/*    static List<String> listStringToLowerCase (List<String> listWords) {
        List<String> listStringwithLowerCase = new LinkedList<>();
        for (String listWord : listWords) {
            listStringwithLowerCase.add(listWord.toLowerCase());

        }
        return listStringwithLowerCase;
    }
    public static void main(String[] args) {
        List<String> words = new LinkedList<>(Reader.readStringListFromScanner());
        System.out.println(listStringToLowerCase(words));
    }*/
//Exercise 15 Write a method that as an argument accepts list of Strings returns lenght of the longest word.
/*    static int longestWord (List<String> listWords) {

        int longestWord = 0;
        for (int i = 0; i <listWords.size() ; i++) {
            if (listWords.get(i).length()>longestWord) {
                longestWord=listWords.get(i).length();
            }
        }
        return longestWord;
        }
        public static void main(String[] args) {
            List<String> words = new LinkedList<>(Reader.readStringListFromScanner());
            System.out.println(longestWord(words));
        }*/
//Exercise 16 Write a method that as an argument takes array of integers and returns array of prime numbers.


//Exercise 17 Write a method that as an arguments takes array of booleans, and returns an array with all the truths.
//newArray([true,true,true,true,false,false, true]) = [true,true,true,true,true]

//Exercise 18 Write a method that counts number of appearances of given number in a list.
// numberOfElements([1,2,3,3,3,4,3],3)  = 4 ( 3 występuje 4 razy w danym ciągu).   
// numberOfElements([1,2,3,3,3,4,3],8) = 0 ( 8 nie występuje ani razu w danym ciągu). 


}


