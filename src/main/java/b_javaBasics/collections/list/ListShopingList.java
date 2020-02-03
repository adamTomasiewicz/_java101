package c_core_collectionsLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListShopingList {
    public static void main(String[] args) {

        String input = "";
        List<String> strings = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("wprowadz produkty");
        while (!input.equals("koniec")) {
            input = sc1.nextLine();
            System.out.println(input);
            strings.add(input);
        }
        System.out.println("wykresl produkty");
        input = "";
        while (!input.equals("koniec")) {
            input = sc1.nextLine();
            System.out.println(input);
            strings.remove(input);
        }
        System.out.println("pozostalo na liscie");
        System.out.println(strings);
    }
}
