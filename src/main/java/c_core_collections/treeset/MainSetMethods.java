package c_core_collections.treeset;

import java.util.*;

public class MainSetMethods {
    public static void main(String[] args) {
        Set<String> hashSetString = new HashSet<>();
//add
        hashSetString.add("String A");
        hashSetString.add("String c");
        hashSetString.add("ala ma kota");
        hashSetString.add("String d");
//remove
        hashSetString.remove("String c");
//removeAll
        List<String> listString = new ArrayList<>();
        listString.add("String A");
        listString.add("String b");
        hashSetString.removeAll(listString);
//addAll
        for (String s : hashSetString) System.out.print(s+ " ");
        hashSetString.addAll(listString);
        System.out.println("____");
        for (String s : hashSetString) System.out.print(s+ " ");
        //contains, containsAll
        System.out.println(hashSetString.contains("String A"));
        System.out.println(hashSetString.containsAll(listString));
//hashCode()
        System.out.println(hashSetString.hashCode());
//size() , clear() , isEmpty
        System.out.println(hashSetString.size());
        hashSetString.clear();
        System.out.println(hashSetString.isEmpty());
        System.out.println(hashSetString.size());
        hashSetString.hashCode();

    }
}
