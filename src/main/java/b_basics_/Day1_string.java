package b_basics_;

import java.util.Scanner;

public class Day1_string {
    public static void main(String[] args) {

// String s1 = new String("Michał"); - jest niepodyfikowalny
// StringBuilder sb1 = new StringBuilder("Michał"); - jest modyfikowalny
// sb1.reverse() , sb1.append(), sb1.insert(2,w),
// String converted = my.toString(); /// StringBuilder myName = new StringBuilder(name);



//ZAD 1
        /*


        System.out.println("podaj pierwszy wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String a1 = String.valueOf(scanner1.next());

        System.out.println("podaj drugi wyraz");
        Scanner scanner2 = new Scanner(System.in);
        String a2 = String.valueOf(scanner2.next());

        System.out.println("podaj trzeci wyraz");
        Scanner scanner3 = new Scanner(System.in);
        String a3 = String.valueOf(scanner3.next());


        System.out.println(a3+" "+a2+" "+a1);
         */

//ZAD 2
        /*
        System.out.println("podaj imie");
        Scanner scanner1 = new Scanner(System.in);
        String a1 = scanner1.next();

        int l = a1.length();
        System.out.println(l);
*/
//ZAD 3
/*
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String haslo = scanner1.next();
        System.out.println(haslo.equalsIgnoreCase("programowanie"));
*/
//ZAD 4
        /*
        System.out.println("podaj imie");
        Scanner scanner1 = new Scanner(System.in);
        String imie = scanner1.next();

        String first = imie.substring(0,1);
        String last = imier.substring(1);
        System.out.println(first.toUpperCase()+last.toLowerCase());

*/
//ZAD 5
/*
        System.out.println("podaj imie");
        Scanner scanner1 = new Scanner(System.in);
        String imie = scanner1.next();

        System.out.println(wyraz.charAt(0)=='W');
      //  if (imie.substring(0, 1).equals("W")){
       //     System.out.println(true);
       // }
      // else{
      //      System.out.println(false);
       // }
*/
//ZAD 6
        /*
        System.out.println("podaj wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String wyraz = scanner1.next();



       if (wyraz.toLowerCase().contains("kot")){
           System.out.println(true);
       }
       else{
           System.out.println(false);
       }

*/
    }
}

