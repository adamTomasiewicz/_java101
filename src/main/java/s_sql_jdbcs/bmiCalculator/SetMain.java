package pl.adamTomasiewicz.jdbc_temp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ABC");
        set.add("DEF");
        Iterator i = set.iterator();

        while (i.hasNext()) {
            //String nextElement = (String) i.next();
            System.out.println((String) i.next());
        }
    }
}
