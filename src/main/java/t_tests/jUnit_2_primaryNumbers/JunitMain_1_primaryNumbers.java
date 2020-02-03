package t_tests.jUnit_2_primaryNumbers;

public class JunitMain_1_primaryNumbers {
    public static void main(String[] args) {



        /* System.out.println("Podaj liczbę ");
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        int sumDzielnik = 0;
        for (int i = 2; i<liczba; i++){
            if(liczba%i == 0) {
                sumDzielnik += 1;
            }
        }
        if (sumDzielnik>0){
            System.out.println("Liczba "+ (liczba) + " nie jest liczba pierwsza");
        } else System.out.println("to jest liczba pierwsza ");*/
    }

    public static boolean isPrimeNumber(int number) {
        int sumDzielnik = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumDzielnik += 1;
            }
        }
        return sumDzielnik <= 2;
    }
}

