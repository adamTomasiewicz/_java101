package c_core_exceptions;

import java.util.Scanner;

public class ExceptionsMain_1 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podziel");
        int firstNumber =0;
        int secondNumber =0;
        int result=0;
        System.out.println("");
        System.out.println("type first");
        firstNumber=scanner1.nextInt();
        System.out.println("");
        System.out.println("type second");
        secondNumber=scanner1.nextInt();
        boolean isCorrect = false;
        while(!isCorrect)
            try{
            result=firstNumber%secondNumber;
                System.out.println(result);
            isCorrect=true;
        }
        catch (Exception e) {
            System.out.println("");
            System.out.println("type second");
                secondNumber=scanner1.nextInt();

        }

    }
}
