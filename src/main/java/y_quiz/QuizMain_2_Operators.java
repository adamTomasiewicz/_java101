package y_quizes;

public class QuizMain_2_Operators {

    public static void main(String[] args) {
        //exe1
        System.out.println(haveMoreLowcase("przyjętego String zwróci informację true jesli ilosć małych liter"));
        System.out.println(haveMoreLowcase("ASFHJDFKHDSJKFHDJSKDFHSJDKFHSDJFKHSH ilosć małych liter"));
        //exe2
        System.out.println(howManyBits(1));
        System.out.println(howManyBits(127));
    }

    //todo: exe1 Napisz metodę która dla przyjętego String zwróci informację true jesli ilosć małych liter jest większa, false jeśli dużych liter.
    static boolean haveMoreLowcase(String string) {
        int counterLowcase = 0;
        int counterUppercase = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                counterLowcase++;
            }
            if (Character.isUpperCase(string.charAt(i))) {
                counterUppercase++;
            }
        }
        return counterLowcase > counterUppercase;
    }

    //todo: Napisz metodę przyjmującą liczbę i zwracającą ilośc bitów potrzebnych do reprezentacji tej liczby.
    static int howManyBits(int number) {
        String string = "";
        while (number > 0) {
            string = string + number % 2;
            number = number / 2;
        }
        return string.length();
    }

}
