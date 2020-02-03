package b_javaBasics.collections;

import java.util.*;

public class F_Collections {

    //THEORY
    //List, Set, Queue
    //ArrayList vs LinkedList

    //EXERCISES
//exercise 1: create a program that return list with elements dividable by 3
/*static List<Integer> dividableBy3 (List<Integer> list){
    List<Integer> newList = new ArrayList<>();
    for (Integer integer:list) {
        if (integer%3==0){newList.add(integer);}
    }return newList;
}*/
//exercise 2: create a program that return sorted list
/*static List<Integer> sortedList (List<Integer> unsortedList){
    //List<Integer> newList = new ArrayList<>();
    java.util.Collections.sort(unsortedList);
    return unsortedList;}*/
//exercise 3: create a program that returns frequency of elements
/*static void frequencyMy (Integer range, List<Integer> integerList){
    for (int i = 0; i <=range; i++) {
        if(java.util.Collections.frequency(integerList,i)==1){
            System.out.println(i+" occur "+ java.util.Collections.frequency(integerList, i)+" time");}
        if(java.util.Collections.frequency(integerList,i)>1){
            System.out.println(i+" occur "+ java.util.Collections.frequency(integerList, i)+" times");}
    }}*/
//exercise 4: polish-english dictionary
/*static void printEnglishWord ( ){
        Scanner scanner = new Scanner(System.in);
    System.out.println("Type polish word:");
        String polishWord = scanner.nextLine().toLowerCase();
    System.out.println(polishWord);
        Map<String,String> slownikPolishEnglish = new HashMap<>();
        slownikPolishEnglish.put("kot", "cat");
        slownikPolishEnglish.put("matka", "mother");
        slownikPolishEnglish.put("zombie", "zombie");
        if(slownikPolishEnglish.containsKey(polishWord)){ System.out.println("English word is: "+slownikPolishEnglish.get(polishWord));}
        else {System.out.println("nie mam takiego slowa");}
}*/
//exercise 5: decimal to binary
/*static String decimalToBinary (int decimal){
//1,2,4,8,16,32,64,128,256,512,1024,2048,4096
    StringBuilder stringbuilder = new StringBuilder();
    int bigestPowOf2 = 0;
    for (int i = 0; i <= decimal ; i++) {
        if(decimal/Math.pow(2,i)>0) {bigestPowOf2=i;}}
    for (int i = bigestPowOf2; i >=0 ; i--) {
            if(decimal/Math.pow(2,i)==1){stringbuilder.append("1");}
            else {stringbuilder.append("0");}}
    return stringbuilder.toString();
}*/
//exercise 6: create a program that will create ArrayList
/*static void arrayListOfColors () {
    List<String> colors1 = new ArrayList<>();
    colors1.add("Red"); colors1.add("Green"); colors1.add("Blue");
    for (String s1 : colors1) System.out.print(s1+ " ");
}*/
//exercise 7: create program that will find index of color on a list
/*static void findIndexOfColor () {
    List<String> colors1 = new ArrayList<>();
    colors1.add("Red"); colors1.add("Green"); colors1.add("Blue");
    colors1.add("Red"); colors1.add("Green"); colors1.add("Blue");
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your color");
    String input = scanner1.next();
    for (String s1 : colors1) System.out.println(input.equalsIgnoreCase(s1)?"this color have index of "+colors1.indexOf(s1):"thers no such color");
}*/
//exercise 8: create a program that will reverse list
/*static void reversedList() {
    List<String> colors1 = new ArrayList<>();
    colors1.add("Red");
    colors1.add("Green");
    colors1.add("Blue");
    for (String s : colors1) System.out.print(s+" ");
    System.out.println();
    java.util.Collections.reverse(colors1);
    for (String s : colors1) System.out.print(s+" ");
}*/
//exercise 9: create a program that will return max element from the list
/*static void getMaxValue () {
    List<Integer> integers1 = new ArrayList<>();
    integers1.add(15);integers1.add(8);integers1.add(6);integers1.add(22);
    Set<Integer> integers2 = new TreeSet<>();
    integers2.addAll(integers1);
    Integer lastNumber =null;
    for (Integer integer : integers2) {
        lastNumber = integer;
    }    System.out.println(lastNumber + " ");
}*/
//exercise 10: create a program that adds new int element on index2 to linkedList
/*    static void addElementIndex2ToLinkedList () {
        List<Integer> integerList1 = new LinkedList<>();
        integerList1.add(3);integerList1.add(4);integerList1.add(5);integerList1.add(11);integerList1.add(31);
        for (Integer integer : integerList1) System.out.print(integer+ " ");
        integerList1.add(2,111);
        System.out.println();
        for (Integer integer : integerList1) System.out.print(integer+" ");
    }*/
//exercise 11: create a program that will swap elements on index 0 and 2
/*static void swapElementIndex0With2 () {
    List<Integer> integerList1 = new LinkedList<>();
    integerList1.add(3); integerList1.add(4);integerList1.add(5);integerList1.add(11);integerList1.add(31);
    for (Integer integer : integerList1) System.out.print(integer + " ");
    Integer tempInteger = integerList1.get(0);
    integerList1.set(0, integerList1.get(2));
    integerList1.set(2, tempInteger);
    System.out.println();
    for (Integer integer : integerList1) System.out.print(integer + " ");
}*/
//exercise 12: create a method that will convert LinkedList to ArrayList
/*    static void linkedListToArrayList () {
        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(15);linkedList1.add(9);linkedList1.add(6);
        for (Integer integer : linkedList1) System.out.print(integer+" ");
        System.out.println(linkedList1.getClass().getSimpleName());
        List<Integer> arrayList1 = new ArrayList<>(linkedList1);
        for (Integer integer : arrayList1) System.out.print(integer+" ");
        System.out.println(arrayList1.getClass().getSimpleName());
    }*/
//exercise 13: create a program that return the total number of different values in a list
/*    static void getNumberOfDifferentWords () {
        List<String> stringLinkedList1 = new LinkedList<>();
        stringLinkedList1.add("kot");stringLinkedList1.add("kot");stringLinkedList1.add("pies");
        stringLinkedList1.add("pies");stringLinkedList1.add("beton");stringLinkedList1.add("HilaryClinton");
        Set<String> stringSet1 = new HashSet<>();
        stringSet1.addAll(stringLinkedList1);
        System.out.println(stringSet1.size());
    }*/
//exercise 14: create a program that return frequency of every different values in a list
/*    static void getNumberOfDifferentWords () {
        List<String> stringLinkedList1 = new LinkedList<>();
        stringLinkedList1.add("kot");
        stringLinkedList1.add("kot");
        stringLinkedList1.add("pies");
        stringLinkedList1.add("pies");
        stringLinkedList1.add("beton");
        stringLinkedList1.add("HilaryClinton");
        for (String s1 : stringLinkedList1) System.out.println(s1 + " ");
        System.out.println();
        Map<String, Integer> stringIntegerMap1 = new HashMap<>();
        for (String s1 : stringLinkedList1) {
            if (!stringIntegerMap1.containsKey(s1)) stringIntegerMap1.put(s1,1);
            else stringIntegerMap1.replace(s1,stringIntegerMap1.get(s1),stringIntegerMap1.get(s1)+1);
        }
        stringIntegerMap1.forEach((key,value)-> System.out.println(key+" "+value));
    }*/
//exercise 15: create a method that will take argument of Sting[] and return map<firstChar,String>
/*static Map<String, String> wordsStartingWithSameLetter (String[] words) {
    List<String> stringLinkedList1 = new LinkedList(Arrays.asList(words));
    for (String s1 : stringLinkedList1) System.out.print(s1 + " ");
    System.out.println();
    Map<String, String> map1StringString = new HashMap<>();
    String temp ="";
    for (String s1 : stringLinkedList1) {
        if (!map1StringString.containsKey(String.valueOf(s1.charAt(0))))
            map1StringString.put(String.valueOf(s1.charAt(0)),s1);
        else { temp = map1StringString.get(String.valueOf(s1.charAt(0)))+s1;
            map1StringString.replace(String.valueOf(s1.charAt(0)), map1StringString.get(String.valueOf(s1.charAt(0))), temp);
        }
    }
    map1StringString.forEach((key,value)-> System.out.print(" "+key+" "+value));
    System.out.println();
    return map1StringString;
}*/
//exercise 16: create a method that takes String[] words and returns map<String,String> representing first and last charakter from every word
/*    static Map<String, String> parsOfFirstAndLastChar (String[] words) {
        for (String word : words) System.out.print(word+" ");
        Map<String, String> mapStringString1=new HashMap<>();
        for (String word:words) mapStringString1.put(String.valueOf(word.charAt(0)),String.valueOf(word.charAt(word.length()-1)));
        return mapStringString1;
    }*/

    //BONUS
//bonus 1: create a method that will return the amount of values dividable by 4 from a list
/*    static void amountOfNumbersDividableBy4 () {
        List<Integer> listInteger1= new ArrayList<>();
        listInteger1.add(1);listInteger1.add(2);listInteger1.add(3);listInteger1.add(4);listInteger1.add(8);listInteger1.add(9);
        int counter1 = 0;
        for (Integer integer : listInteger1) if(integer%4==0) counter1++;
        System.out.println(counter1);
    }*/
//bonus 2: create a method that will print to screen all wards from a list .toUpperCase
    /*static void printToUpperCase (String[] words){
        for (String word : words) System.out.print(word.toUpperCase()+" ");
    }*/
//bonus 3: write a method that check if first value in array is bigger than the last, return boolean
    static boolean checkIfFirstValueIsBiggerThanLastValue(List<Integer> ints) {
        return ints.get(0) > ints.get(ints.size() - 1);
    }

    public static void main(String[] args) {

        String[] words1 = {"Red", "gReen", "blUE", "Pies", "pieSOświnka", "kot", "kOTObeton"};
        List<Integer> ints1 = new ArrayList<>(Arrays.asList(15, 2, 3, 4, 5, 6, 7, 11, 121, 12));
        System.out.println(checkIfFirstValueIsBiggerThanLastValue(ints1));
        List<Integer> myArrayList1 = new ArrayList<>();
        List<String> myArrayList2 = new ArrayList<>();
        List<Object> myLinkedList1 = new LinkedList<>();
        List<Object> myVectorList1 = new Vector<>();
        List<Object> myStackList1 = new Stack<>();
        myArrayList1.addAll(Arrays.asList(1, 2, 5, 6, 121, 12, 14, 2, 3));

        myArrayList1.addAll(Arrays.asList(1, 2, 5, 6, 121, 12, 14, 2, 3));
        //System.out.println(parsOfFirstAndLastChar(words1));
 /*          myArrayList2.addAll(Arrays.asList("Jurek","Ania","Gosia","Jerzyk","Zbyszek"));
             for (String name:myArrayList2) {System.out.println(name);}*/


    }


}
