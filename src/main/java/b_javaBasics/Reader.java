package b_javaBasics;

import java.util.*;

public class Reader {
    public static List<String> readStringListFromScanner() {
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements to add:");
        int n = scanner.nextInt();
        // add number of Strings
        for (int i = 0; i < n; i++) {
            System.out.println("type " + (i + 1) + " element");
            list.add(scanner.next());

        }
        return list;
    }

    public static Map<String, String> readMapOfStringsFromScanner() {
        Map<String, String> map = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements to add:");
        int n = scanner.nextInt();
        // add number of records
        for (int i = 0; i < n; i++) {
            System.out.println("type " + (i + 1) + " element");
            map.put(scanner.next(), scanner.next());

        }
        return map;
    }

    public static List<Integer> readIntListFromScanner() {
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements to add:");
        int n = scanner.nextInt();
        // add number of Strings
        for (int i = 0; i < n; i++) {
            System.out.println("type " + (i + 1) + " element");
            list.add(scanner.nextInt());

        }
        return list;
    }

    static List<Integer> getDividedBy(List<Integer> numbers, int div) {
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : numbers) {
            if (integer % div == 0) {
                newList.add(integer);
            }
        }
        return newList;
    }

/*    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();

        emails.add("ss@gmail.com");
        emails.add("s1@gmail.com");
        emails.add("s2@gmail.com");
        emails.add("s3@gmail.com");
        emails.add("s4@gmail.com");

        Scanner scanner = new Scanner(System.in);
        System.out.println("type your mail");
        String email=scanner.next();

        if (emails.contains(email)){
            System.out.println("your email already registered");
        }
        else{
            System.out.println("your email have been added to the list");
            emails.add(email);
        }

        System.out.println("all mails on the list:" + emails);

        //set does not add repetitive variables
        Set<String> set = new LinkedHashSet<>();
        set.add(email);
        set.add("ss@gmail.com");
        set.add("s1@gmail.com");
        set.add("s2@gmail.com");
        set.add("s2@gmail.com");
        set.add("s3@gmail.com");
        set.add("s4@gmail.com");
        set.add("s2@gmail.com");

        System.out.println("all registered adresses"+set);

    }*/


/// OPTION 1

/*    public static void main(String[] args) {

        Reader reader = new Reader();
        List<String> myList = reader.readStringListFromScanner();
        myList.add("aostatni");
        for (String imie : myList) {
            if (imie.charAt(0) == 'a') {
                System.out.println(imie);
            }
        }
    }*/
//OPTION 2
/*public static void main(String[] args) {
    List<String> names = Reader.readStringListFromScanner();
    for (String name: names){
        if (name.startsWith("a") || name.startsWith("A")){
            System.out.println(name);
        }}}*/
//OPTION 3 for Integers
 /*   public static void main(String[] args) {
        List<Integer> names = Reader.readIntListFromScanner();
        for (int x: names){
           System.out.println(x);
            }}*/

//EXERCISE 1

    /*public static void main(String[] args) {

            System.out.println(getDividedBy(Reader.readIntListFromScanner(), 3));
        }*/
//EXERCISE 2 Napisz metodę, która dla danej listy zwraca nową posortowaną listę.   
// List<Integer> getSortedList(List<Integer> numbers);

    /*    public static void main(String[] args) {
            List<Integer> newList = readIntListFromScanner();
            Collections.sort(newList);
            System.out.println("Posortowane" + newList);
        }*/

}











