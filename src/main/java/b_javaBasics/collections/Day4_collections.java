package b_javaBasics.collections;

//LISTS THEORY

//Collections <E>, E stands for generic type data,
//contains classes_And_Objects like String, Character, Integer
//List<E> ArrayList<>()_LinkedList<>()_Vector<>()) ;
//Set<E>  HashSet<>()_LinkedHashSet<>()_TreeSet<>()
//Queue <E> PriorityQueue<>()_ArrayDeque<>()_Stack<>()
//Map <K, V>
//.add() ; .remove(); .get() ; .size() ; .isEmpty () ; .contains()
//PRACTISE
        /*
        List<String> train = new ArrayList<>();
        String nameOfBolek = "Bolek";
        System.out.println(train.isEmpty()); //true
        train.add("Lolek");
        train.add(nameOfBolek);
        System.out.println(train.isEmpty()); //false
        System.out.println(train.get(0)); //Lolek
        System.out.println(train.size()); //2
        train.remove(0);
        System.out.println(train.size());
        List<String> train2 = new
        */
//SET - cannot contains duplicated items
       /* Set<Integer> numbers = new TreeSet<>() ;
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers.isEmpty()); //false
        System.out.println(numbers.iterator());
        */
//QUEUE - FIFO or LIFO
/*
        Queue<Integer> numbers = new ArrayDeque<>();
        System.out.println(numbers.isEmpty()); //true
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        System.out.println(numbers.size()); //5
        System.out.println(numbers.remove());//First In First Out 1
        System.out.println(numbers.size());
        System.out.println(numbers.peek());
        System.out.println(numbers.size());
*/
//MAP
//.put() ; .get() ; .isEmpty() ; .size() ; .containsKey() ; .clear()
        /*
        Map<Integer, String> mapOne = new HashMap<>();
        Map<Integer, Integer> mapTwo = new HashMap<>();
        Map<Character, Boolean> mapThree = new HashMap<>();
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("kot", "cat");
        dictionary.put("pies", "dog");
        dictionary.put("kon", "horse");
        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.get(word));
        }
        else{
            System.out.println("Thers no such word in the dictionary");
        }
        */
/*
        Map<Integer, String> restaurantFoods = new HashMap<>();
        restaurantFoods.put(1, "pizza");
        restaurantFoods.put(2, "hotdog");
        restaurantFoods.put(3, "cake");
        for (Integer key : restaurantFoods.keySet()) {
            System.out.println(restaurantFoods.get(key));
        }
        *//*
        for (Integer key : restaurantFoods.keySet()){
            System.out.println(restaurantFoods.get(key));
        } *//*
        for (Map.Entry<Integer, String> element : restaurantFoods.entrySet()) {
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }*/
//with LAMBDA
     /* import java.util.HashMap;
        import java.util.Map;
        public class IterateHashMap{
            public static void main(String[] args) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("key1", "value1");
                map.put("key2", "value2");
                map.put("key3", "value3");
                map.forEach((key,value) -> System.out.println(key + " = "+ value));

            }
        }*/
//EXCERSISES
public class Day4_collections {

//EXERCISE 1 Write a method, witch for given list is going to return newList devidable by 3.
/*    static List<Integer> getDividedBy(List<Integer> numbers, int d) {
        List<Integer> newList = new ArrayList<>();
        for (Integer value : numbers) {
            if (value % d == 0) {
                newList.add(value);
            }
        }
        return newList;
    }


    public static void main(String[] args) {
            List<Integer> oldList = Reader.readIntListFromScanner();

        System.out.println(getDividedBy(oldList,3));
        }*/
//EXERCISE 2 Write a method that for given list returns sorted list.
 /*   public static List<Integer> getSortedList(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }*/
//EXERCISE 3 Write a method that for given n numbers writes amount of apearances of the specific number.

    /*    static Set<Integer> countIntInList(List<Integer> numbersU) {
            Collections.sort(numbersU);
            Set<Integer> numbersS = new HashSet<>();
             for (Integer number : numbersU) {
                if (numbersU.contains(number) && !numbersS.contains(number)) {
                    System.out.println(number + " appears " + Collections.frequency(numbersU, number) + " times");
                    numbersS.add(number);
                }
            }
            return numbersS;
        }
        public static void main(String[] args) {
            List<Integer> numbersU = Reader.readIntListFromScanner();
            Day5_collections.countIntInList(numbersU);
        }*/


//EXERCISE 4 Write down a program that simulates polish-english dictionary.
// Example:   Podaj słówko po Polsku:   mama   That word in english is mother.   
// sumArray([1, 2, 3])  = 1+2 = 3 
/*
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("pies","dog");
        dictionary.put("kot","cat");
        dictionary.put("część","part");
        dictionary.put("miłość","love");
        dictionary.put("drzewo","tree");

        System.out.println("Podaj słowo po Polsku");
        String word = scanner.next();
        if (dictionary.containsKey(word)){
            System.out.println("Po angielsku to \n"+ dictionary.get(word));
        }
        else{
            System.out.println("english word is "+word);
        }
    }
*/

//EXERCISE 5 Write a method that will convert decimal to binary

/*    static StringBuilder convertToBinaryUsingSB(int no) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (no > 0) {
            result.append(no % 2);
            i++;
            no = no / 2;
        }

        return result.reverse();
    }

    public static void main(String[] args) {
        System.out.println(convertToBinaryUsingSB(34));
    }*/

//EXERCISE 6 Write a program witch creates ArrayList including colors. Out.print created colors
/*public static void main(String[] args) {
    List<String> colors = new ArrayList<>(Reader.readStringListFromScanner());
    System.out.println(colors);

}*/

//EXERCISE 7 Implement given method
// int findIndexOfColor(String color,​List​<String> colors)
// method should return index of a color or -1 if there is no such color on the list.
/*    static int findIndexOfColor(List<String> colors, String color){

        List<String> colorsLinked = new LinkedList<>(colors);

        if (colors.contains(color)){
            return colorsLinked.indexOf(color);
        }
      return -1;
    }

    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("green");
        colors1.add("blue");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type color");
        String color1 = scanner1.next();
        System.out.println("index of this color is " +findIndexOfColor(colors1, color1));
    }*/

//EXERCISE 8 Write a method that reverse the given list.
/*
    static List<String> reverseStringList (List<String> list){

        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        List<String> colors1 = new LinkedList<>(Reader.readStringListFromScanner());
        System.out.println(reverseStringList(colors1));

    }
*/
//EXERCISE 9 Write a method that returns max value from a list
/*
    static int getMaxIntValue(List<Integer> array){
        return Collections.max(array);

    }

    public static void main(String[] args) {
        System.out.println(getMaxIntValue(Arrays.asList(4,5,3,11,12,3)));
    }
*/
//EXERCISE 10 Write a program, that will create a LinkedList of Integers, at least 5 elements.
//    Add element with an index 2 to it and print out.

/*    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Reader.readIntListFromScanner());
        System.out.println(list);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("add another number");
        Integer newInt = scanner1.nextInt();
        list.add(2, newInt);
        System.out.println(list);

    }*/
//EXERCISE 11 Write a program with a LinkedList of Integers, swap elements with index 0 and 2.
/*public static void main(String[] args) {
    List<Integer> list = new LinkedList<>(Reader.readIntListFromScanner());
    System.out.println(list);

    list.add(0, list.get(2));
    list.remove(3);
    list.add(3, list.get(1));
    list.remove(1);
    System.out.println(list);
}*/
//EXERCISE 12 Write a method that converts LinkedList to ArrayList
/*    static List<Integer> convertListLinkedToArray(List<Integer> oldLInkedList){
        List<Integer> newArrayList = new ArrayList<>(oldLInkedList);
        return newArrayList;
    }
    public static void main(String[] args) {
     List<Integer> list1 = new LinkedList<>(Reader.readIntListFromScanner());
     convertListLinkedToArray(list1);
     if (list1 instanceof ArrayList){
         System.out.println(list1);
     }

    }*/
//EXERCISE 13 Write a method that will return amount of different words on a LinkedList
/*    static int countDifferentWords (List<String> words){
        return new HashSet<String>(words).size();
    }

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>(Reader.readStringListFromScanner());

            System.out.println(countDifferentWords(list1));
    }*/
//EXERCISE 14 Write a method that will count amount of appearances of every different word on the list

/*        static Set<String> countWordOnList(List<String> wordsUns) {
        Collections.sort(wordsUns);
        Set<String> wordsSor = new HashSet<>();
         for (String word : wordsUns) {
            if (wordsUns.contains(word) && !wordsSor.contains(word)) {
                System.out.println(word + " appears " + Collections.frequency(wordsUns, word) + " times");
                wordsSor.add(word);
            }
        }
        return wordsSor;
    }
    public static void main(String[] args) {
        List<String> words1 = Reader.readStringListFromScanner();
        Day5_collections.countWordOnList(words1);
    }*/
//EXERCISE 15 Write a method that
//Map<​String​, ​String​> firstChar(​String​[] strings)
// firstChar(["sól", "mleko", "sok", "miód"]) → {"s": "sólsok", "m": "mlekomiód"} , changed a little
/*    static Map<Character, String> wordsStartingWithChar (ArrayList<String> words, Character c) {

        Map<Character, String> map1 = new LinkedHashMap<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (String word: words) {
            if (word.charAt(0)==c ){
                stringBuilder.append(word+" ");
            }
        map1.put(c, stringBuilder.toString());
        }
      return map1;
    }
    public static void main(String[] args) {
        List<String> words = Reader.readStringListFromScanner();
        System.out.println(wordsStartingWithChar((ArrayList<String>) words, 'c'));
    }*/
//EXERCISE 16 Write down a method
// Map<String, String> pairs(String[] strings)     pairs(["code", "bug"]) → {"c": "e", "b": "g"}

/*    static Map<String, String>  pairs(String[] strings){

        Map<String, String> map1 = new LinkedHashMap<>();
        for (String word:strings) {
            map1.put(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(word.length()-1)));
        }
        return map1;
    }
    public static void main(String[] args) {
        String[] strings = new String[2];
        strings[0] = "jajko";
        strings[1] = "kurwa";
        System.out.println(pairs(strings));
    }*/

}
