package pl.akademiakodu.basics;

import java.util.*;

public class Day7_homework {
}
//  https://pl.spoj.com/problems/PP0601B/
/*public static void main(String[] args) {
    Scanner scanner1 = new Scanner((System.in));

    System.out.println("type t");
    int t = scanner1.nextInt();
    int n, x, y;
    for (int i = 0; i <t ; i++) {`
        System.out.println("type a");
        n= scanner1.nextInt();
        System.out.println("type x");
        x= scanner1.nextInt();
        System.out.println("type y");
        y= scanner1.nextInt();
        for (int j=1; j <n ; j++) {
            if (j%x==0 && j%y!=0){
                System.out.println(j+" ");
            }

        }
        System.out.println();

    }
}*/


//  https://pl.spoj.com/problems/PTEST/
/*public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);


}*/

//  https://pl.spoj.com/problems/PRZEDSZK/


//  https://pl.spoj.com/problems/KC009/

//  https://pl.spoj.com/problems/FLAMASTE/

/*    public static void main(String[] args) {
        List<Character> lista = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("type word "+n+" times");
        for (int i = 0; i <=n; i++) {
            String word = scanner.nextLine() + '!';

            char last = word.charAt(0);
            int count =1;
            for (int j = 1 ; j<word.length(); j++) {
                if (word.charAt(j) == last) {
                    count++;
                }
                else {
                    System.out.print(last);
                    if (count != 1 && count !=2){
                        System.out.print(count);

                    }
                    if (count ==2) {
                        System.out.print(last);
                    }
                    last = word.charAt(j);
                    count=1;

                }

            }
            System.out.println();
        }
    }*/

//  https://pl.spoj.com/problems/JZAPKAB/
/*    public static void main(String[] args) {
        Map<Character, Integer> weights = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
           if (i!=9) {
               char letter = (char) ('a' + i);
               weights.put(letter, i + 1);
               char secondLetter = (char) ('l' + i);
               weights.put(secondLetter, (i + 1) * 10 + 10);
           } else {
               weights.put('k',10);
           }
        }
        weights.put('v',200);
        weights.put('x' , 300);
        weights.put('y' , 400);
        weights.put('z' , 500);
        //info 105
        Scanner scanner = new Scanner(System.in);
        System.out.println("type data");
        String word = scanner.next().toLowerCase();
        int sum = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (weights.containsKey(word.charAt(i))){
                sum+=weights.get(word.charAt(i));
            }
           // System.out.println(weights.get(word.charAt(i)));
        }
        System.out.println(sum);
    }*/


//  https://pl.spoj.com/problems/JSZYCER/

//  https://pl.spoj.com/problems/PA05_POT/

// CODDING BAT - MAPS
//  https://codingbat.com/prob/p197888
/*   static Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.replace("a", " ");
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("a", "candy");
        map1.put("b", "carrot");
        map1.put("c", "sandwich");

        System.out.println(mapBully(map1));

    }*/

//  https://codingbat.com/prob/p148813
/*    static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }

    public static void main(String[] args) {

    }*/
//  https://codingbat.com/prob/p107259
/*    static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }    */
//https://codingbat.com/prob/p182712
/*
    static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")){
            map.replace("ice cream", "cherry");
        }
        return map;
    }*/
//  https://codingbat.com/prob/p196458
/*    static Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")&& !map.get("ice cream").equalsIgnoreCase(null)){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")&& !map.get("spinach").equalsIgnoreCase(null)){
            map.replace("spinach", "nuts");
        }
    return map;
    }*/
//  https://codingbat.com/prob/p128461
/*    static Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")&& !map.get("potato").equalsIgnoreCase(null)){
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")&& !map.get("salad").equalsIgnoreCase(null)){
            map.put("spinach", map.get("salad"));
        }

    }*/
//  https://codingbat.com/prob/p115011
//dokonczyc
/*    static Map<String, String> mapAB2(Map<String, String> map) {

        if (map.get("a").equalsIgnoreCase(map.get("b"))){
        map.remove("a");
        map.remove("b");
        }
        return map;*/

