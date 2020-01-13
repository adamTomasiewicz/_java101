package c_core_collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,String> dictionary1=new HashMap<>();
        dictionary1.put("jeden","uno");
        dictionary1.put("dwa","duo");
        dictionary1.put("trzy","tres");

        for (String key : dictionary1.keySet()) {System.out.println(key);}
        System.out.println();
        for (String value : dictionary1.values()) {System.out.println(value);}
        System.out.println();
        for (Map.Entry<String, String> entry : dictionary1.entrySet()) {
            System.out.println(entry.getKey()+" to po hiszpansku "+ entry.getValue());
        }
    }
}
