package b_javaBasics.collections.treeset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //HashSet
        Set<String> hashSetString = new HashSet<>();
        hashSetString.add("String A");
        hashSetString.add("String A");
        hashSetString.add("String b");
        hashSetString.add("String c");
        hashSetString.add("String d");
        hashSetString.add("String e");
        hashSetString.add("ala ma kota");
        System.out.println(hashSetString);
        for (String s : hashSetString) System.out.println(s + ", ");
        //LinkedHashSet
        Set<String> linkedSetString = new LinkedHashSet<>();
        linkedSetString.add("String A");
        linkedSetString.add("String A");
        linkedSetString.add("String b");
        linkedSetString.add("String c");
        linkedSetString.add("String d");
        linkedSetString.add("String e");
        linkedSetString.add("ala ma kota");
        System.out.println(linkedSetString);
        for (String s : linkedSetString) System.out.println(s + ", ");
        //TreeSet
        Set<String> treeSetString = new TreeSet<>();
        treeSetString.add("String A");
        linkedSetString.add("String A");
        linkedSetString.add("String b");
        linkedSetString.add("String c");
        linkedSetString.add("String d");
        linkedSetString.add("String e");
        linkedSetString.add("ala ma kota");
        System.out.println(linkedSetString);
        for (String s : linkedSetString) System.out.println(s + ", ");

    }
}
