package c_core_collections.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        //add
        listString.add("Koń");
        listString.add("Krowa");
        listString.addAll(Arrays.asList("Pies","Koń","Kot"));
        Collections.addAll(listString, "Pies","Koń","Kot");

        for (String s : listString) System.out.print(s+" ");

        listString.sort(Comparator.comparing(String::toString));
        System.out.println();
        //remove //removeAll
        ArrayList<String> toRemove = new ArrayList<>();
        toRemove.add("Koń");
        listString.removeAll(toRemove);

        //.get() .set()
        // indexOf() lastIndexOf()

        for (String s : listString) System.out.print(s+" ");
        System.out.println();
       Object[] array = listString.toArray();
        for (Object o : array) System.out.print(o+" ");
        System.out.println();
        //retainAll()
        List<String> toRetain = new ArrayList<>();
        toRetain.addAll(Arrays.asList("Pies","Koń","Kot"));
        listString.retainAll(toRetain);
        for (String s : listString) System.out.print(s+" ");
        System.out.println();

    }
}
