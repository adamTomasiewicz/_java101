package b_basics_;

import java.util.Scanner;

public class Day1_rekrutacyjne {


////ZAD 1 phone number formating
public static void main(String[] args) {

    System.out.println("type your number");
    Scanner scanner1 = new Scanner(System.in);
    String numberS = scanner1.nextLine();

    System.out.println(numberS);

    StringBuilder sb1 = new StringBuilder();
    int counter = 0;
    for (int i = 0; i <=numberS.length()-1; i++) {
        if (Character.isDigit(numberS.charAt(i))){
            sb1.append(numberS.charAt(i));
            counter++;
            if (counter%3==0){
                sb1.append('-');
            }
        }
    }

    System.out.println(sb1);

}

//ZAD 2 bigest temperature amplitude





//ZAD 3 Function counting squares of integers between a and b
/*
    public static void main(String[] args) {
        System.out.println("type a");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        System.out.println("type b");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        System.out.println(wholeSquare(a, b));
    }

    static int wholeSquare(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i * i >= a && i * i <= b) {
                System.out.println("square from " + i + " is in that range");
                counter++;
            }
        }
        return counter;
    }
*/

}
