package c_core_collectionsLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsMain {
    public static void main(String[] args) {

        System.out.println("wprowadz dane");
        Scanner sc1 = new Scanner(System.in);
        String input = "";
        List<String> imiona = new ArrayList<>();
        List<String> nazwiska = new ArrayList<>();
        List<String> wieki = new ArrayList<>();
        String[] split;
        while (!input.equals("koniec")) {
            input = sc1.nextLine();
            System.out.println(input);
            if (input.equals("koniec")) break;
            split = input.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    imiona.add(split[0]);
                }
                if (i == 1) {
                    nazwiska.add(split[1]);
                }
                if (i == 2) {
                    wieki.add(split[2]);
                }
            }
        }
        System.out.print("imiona");
        System.out.println(imiona);
        System.out.print("nazwiska");
        System.out.println(nazwiska);
        System.out.print("wieki");
        System.out.println(wieki);
        System.out.println(input);

    }


}
