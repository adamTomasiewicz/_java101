package pl.adamTomasiewicz.a_temp;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        String testString = "Warszawski świt";

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type your word");
        String word = scanner1.nextLine();
        System.out.println("type your range");
        int range = scanner1.nextInt();
        System.out.println(repeatEnd(word, range));
    }

//IllegalArgumentException

    public static String repeatEnd(String string, int range) {
        if (range < 1) return "type positive argument";
        if (range > string.length()) return "type range up to " + string.length();
        String result = "";
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < string.length(); j++) {
                if (j < string.length() - range) continue;
                result = result + string.charAt(j);
            }
        }
        return result;
    }

}
