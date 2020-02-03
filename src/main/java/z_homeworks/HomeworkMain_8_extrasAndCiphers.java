package z_homeworks;

public class HomeworkMain_8_extrasAndCiphers {
    public static void main(String[] args) {
        //  euklidesesAlgoritm();
        //  cezarsCipher();
        //  findSuperPrimeNumbers();
    }

    //todo: algorym euklidesa
    static void euklidesesAlgoritm() {
        int a = 243;
        int b = 111;
        int c = 0;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        if (a % b == 0) System.out.println(b);
    }
    //todo: szyfr cezara //K-1 Aa$H4 -> Zz$J4 (tu jest chyba pomyłka w przykładzie J by było K+2)

    static void cezarsCipher() {

        char a1 = 'A';
        char a2 = 'a';
        char z1 = 'Z';
        char z2 = 'z';
        System.out.println("A" + (int) a1 + ", Z" + (int) z1 + ", a" + (int) a2 + ", z" + (int) z2 + ", ");

        String string = "Aa$H4";
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (((int) string.charAt(i) > 65 & (int) string.charAt(i) <= 90) | ((int) string.charAt(i) > 97 & (int) string.charAt(i) <= 122)) {
                result = result + (char) ((int) string.charAt(i) - 1);
            } else if ((int) string.charAt(i) == 65) {
                result = result + (char) 90;
            } else if ((int) string.charAt(i) == 97) {
                result = result + (char) 122;
            } else {
                result = result + string.charAt(i);
            }
        }
        System.out.println(result);
    }

    //todo: algorytm znajdujacy liczby super (takie które są pierwsze i ich kolejna pozycja rowniez jest liczba pierwsza 3, 5, 11, 17, 31, 41, 59, 67, 83, ..)
    static boolean isPrimeNumber(int number) {
        if (number == 0 | number == 1) {
            return false;
        }
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) counter++;
        }
        return counter == 2;
    }

    static int[] find100primeNumbers() {
        int[] find100primeNumbers = new int[100];
        int a = 2;
        int counter;
        while (find100primeNumbers[99] == 0) {
            for (int i = a; i < 1000; ) {
                if (isPrimeNumber(i)) {
                    for (int k = 0; k < find100primeNumbers.length; k++) {
                        if (find100primeNumbers[k] == 0) {
                            find100primeNumbers[k] = i;
                            break;
                        }
                    }
                }
                a = ++i;
            }
        }
        return find100primeNumbers;
    }

    static void findSuperPrimeNumbers() {
        int[] find100primeNumbers = find100primeNumbers();
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 ...
        for (int i = 2; i < find100primeNumbers.length + 1; i++) {
            if (isPrimeNumber(i)) System.out.println(find100primeNumbers[i - 1]);
        }
    }
    //todo: *kodowanie huffmana - odkowdowanie i zakodowanie liscie w drzewie?


}
