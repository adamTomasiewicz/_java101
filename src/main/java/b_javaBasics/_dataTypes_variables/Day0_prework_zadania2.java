package b_javaBasics._dataTypes_variables;


public class Day0_prework_zadania2 {
    public static void main(String[] args) {


//ZAD 1 Napisz program, który deklaruje 2 zmienne całkowite i na ekran wypisuje ich sumę.
/*
        int liczba1 = 15;
        int liczba2 = 10;
        System.out.println(liczba1+liczba2);
*/
//ZAD 2 Napisz program, który odczytuje 2 zmienne i zamienia je, bez zmiennej pomocniczej.
/*
        Scanner scanner1 = new Scanner(System.in);
        int zmienna1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int zmienna2 = scanner2.nextInt();


        zmienna2 = (zmienna1+zmienna2)-zmienna2;

        System.out.println(zmienna1);
        System.out.println(zmienna2);
        //nie wiem
*/
//ZAD 3 Napisz program, który odczytuje liczbę typu ​double ​i na ekran wypisuje całkowitą wartość tej liczby.

//        System.out.println("wprowadz liczbe");
//       Scanner scanner1 = new Scanner(System.in);
//       double zmienna1 = scanner1.nextDouble();
//
//       System.out.println((int) zmienna1);
//ZAD 4  Stwórz następujący program. Zobacz, jakie otrzymamy rezultaty
/*        int a = 1, b = 2, c = 3;
        a = b = c * 1 + 2;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a = b = c * (1 + 2);
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a = b++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        c = --b;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        a++;
        b++;
        c++;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

        a = b++*++c;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

        int DlugaNazwaZmiennej = 20;
        DlugaNazwaZmiennej = DlugaNazwaZmiennej * 10;
        DlugaNazwaZmiennej *= 10;
        System.out.println( DlugaNazwaZmiennej );
*/
// ZAD 5 Stwórz program, który odczytuje wiek danej osoby i wypisuję na ekran komunikat czy dana osoba jest pełnoletnia czy niepełnoletnia.
// Dla chętnych: stwórz obsługę sytuacji, gdy podane są niepoprawne dane.  Dla chętnych: dodaj obsługę wyjątków.
/*        System.out.println("Type your age");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        if (age>=18){
            System.out.println("Your mature!");
        }
        else {
        System.out.println("You need to grow up!");
        }
*/
//ZAD 6 Stwórz program, który odczytuję daną liczbę i sprawdza czy jest podzielna przez 4.
        /*        System.out.println("podaj liczbe, sprawdze czy ma dokladnie 4 dzielniki");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        int counter = 0;

        for (int i = 1; i <=number ; i++) {
            if (number%i==0) {
                System.out.println(number +" dzieli się przez "+i);
                counter++;
            }

        }
        if (counter==4){
            System.out.println("ta liczba ma dokladnie 4 dzielniki");
        }
        if (counter>4){
            System.out.println("ta liczba ma wiecej niz 4 dzielniki");
        if (counter<4){
            System.out.println("ta liczba ma mniej niz 4 dzielniki");
            }
        }
 */
//ZAD 7 Napisz program, który wypisuje na ekran wszystkie liczby od 1 do 100.
//        for (int i = 1; i <= 100 ; i++) {
//            System.out.println(i);
//        }
//ZAD 8 Napisz program, który oblicza silnię.

//        Day3_metody factorial1 = new Day3_metody();
//        System.out.println(factorial1(10););
//ZAD 9 Napisz program, który odczytuje dwie zmienne i na ekran wypisuje komunikat sprawdzający czy obie zmienne są równe.
/*      Scanner scanner1 = new Scanner(System.in);
        System.out.println("type first number");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("type secound number");
        int number2 = scanner2.nextInt();
        System.out.println(number1==number2);
*/
//ZAD 10 Napisz program, który odczytuję imię i wypisuję na ekran ostatnią literę imienia.
/*        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type name");
        String name1 = scanner1.next();

        System.out.println(name1.charAt(name1.length()-1));
*/
//ZAD 11 Napisz program, który odczytuje imię i sprawdza czy jest ono palindromem.
/*        System.out.println("podaj wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String word1 = scanner1.next();

        String word2 = "";

        for (int i = word1.length()-1; i >= 0 ; i--) {
            char letter = word1.charAt(i);
            word2+=letter;
        }
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("to jest palindrom");
        }
        else{
            System.out.println("To nie jest palindorm");
        }
 */

//ZAD 12 Napisz program, który odczytuje napis i wypisuje go wspak.
/*        System.out.println("type word");
        Scanner scanner1 = new Scanner(System.in);
        String word1 = scanner1.next();

        for (int i = word1.length()-1; i >= 0 ; i--) {
            System.out.print(word1.charAt(i));
        }

 */
//ZAD 13 Napisz program, który wypisuje co drugą literę imienia.
/*        System.out.println("type name");
        Scanner scanner1 = new Scanner(System.in);
        String word1 = scanner1.next();

        for (int i = 0; i <=word1.length()-1 ; i++) {
            if (i%2==0) {
                System.out.print(word1.charAt(i));
            }
            continue;
        }

 */
//ZAD 14 Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na poprawnie wprowadzone hasło
/*
        String password = "Akademia";
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type password");
        String word1 = scanner1.next();
        do {
            if (!password.equalsIgnoreCase(word1)){
                System.out.println("type password");
                word1 = scanner1.next();
            }
        }
            while (!password.equalsIgnoreCase(word1));
*/


    }
}

