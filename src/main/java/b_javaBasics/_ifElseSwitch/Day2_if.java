package b_javaBasics.conditions_ifElseSwitch;

public class Day2_if {
    public static void main(String[] args) {

///ZAD 1
/*
        System.out.println("podaj liczbe");
        Scanner scanner1 = new Scanner(System.in);
        int liczba = scanner1.nextInt();

        if (liczba>1000){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        // skrócony IF
        // System.out.println(liczba>1000 ? "Większa od 1000" : "Mniejsza od 1000");
*/

//ZAD 2
/*
        System.out.println("podaj liczbe");
        Scanner scanner1 = new Scanner(System.in);
        int liczba = scanner1.nextInt();
        if (liczba%3==0 || liczba%5==0) {
            if (liczba % 3 == 0) {
                System.out.println("liczba podzielna przez 3");
            }
            if (liczba % 5 == 0) {
                System.out.println("liczba podzielna przez 5");
            }
        }
        else{
            System.out.println("liczba nie dzieli sie przez 3 ani 5");
        }
*/
//ZAD 3
/*
        System.out.println("podaj haslo");
        Scanner scanner1 = new Scanner(System.in);
        String haslo = scanner1.next();
        haslo.toLowerCase();
        if (haslo.toLowerCase().equals("akademia")) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
*/
//ZAD 4
/*
        System.out.println("podaj plec");
        Scanner scanner1 = new Scanner(System.in);
        String sex = scanner1.next();

        System.out.println("podaj age");
        Scanner scanner2 = new Scanner(System.in);
        int age = scanner2.nextInt();

        if (sex.equalsIgnoreCase("man") && age>75){
            System.out.println("odpocznij");
        }
        if (sex.equalsIgnoreCase("woman")&&age>70){
            System.out.println("odpocznij");
        }
        else{
            System.out.println("do roboty!");
        }
*/
//ZAD 5
 /*
        System.out.println("podaj wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.next();
        word.toLowerCase();
        int lastCharIndex = word.length()-1;
        if (word.charAt(lastCharIndex)== 'a') {
            System.out.println("ostatnia litera to a");
        }
        else{
            System.out.println("ostatnia litera nie rowna sie a");
        }

  */
//ZAD 6
/*
        System.out.println("podaj liczbe");
        Scanner scanner1 = new Scanner(System.in);
        int liczba = scanner1.nextInt();

        if (liczba%11==0){
            System.out.println("podzielna przez 11");
        }

 */
//ZAD 7
/*
        System.out.println("podaj pierwsza liczbe ");
        Scanner scanner1 = new Scanner(System.in);
        int liczba1 = scanner1.nextInt();

        System.out.println("podaj druga liczbe");
        Scanner scanner2 = new Scanner(System.in);
        int liczba2 = scanner2.nextInt();

        if (liczba1==6 || liczba2==6){
            System.out.println("liczba rowna 6");
        }
        else{
            System.out.println("nie rowna 6");
        }
*/
//ZAD 8
/*
        System.out.println("podaj imie");
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.next();
        word.toLowerCase();
        int lastCharIndex = word.length()-1;
        if (word.charAt(lastCharIndex)== 'a') {
            System.out.println("kobieta!");
        }
        else{
            System.out.println("meżczyzna");
        }

 */
//ZAD 9
/*
        System.out.println("podaj pierwsza liczbe ");
        Scanner scanner1 = new Scanner(System.in);
        int liczba1 = scanner1.nextInt();

        System.out.println("podaj druga liczbe");
        Scanner scanner2 = new Scanner(System.in);
        int liczba2 = scanner2.nextInt();

        if (liczba1-liczba2==10 || liczba1+liczba2==10 || liczba1*liczba2==10 || liczba1/liczba2==10){
            System.out.println("mozliwy wynik 10");
        }
        else{
            System.out.println("wynik 10 niemozliwy");
        }

 */
//ZAD 10
/*
        System.out.println("podaj dzien tygodnia ");
        Scanner scanner1 = new Scanner(System.in);
        String dzien = scanner1.next();

        if (dzien.equalsIgnoreCase("poniedzialek") || dzien.equalsIgnoreCase("wtorek")
                || dzien.equalsIgnoreCase("sroda") || dzien.equalsIgnoreCase("czwartek") || dzien.equalsIgnoreCase("piatek")){
            System.out.println("07.00");
        }
        else {
            System.out.println("10.00");
        }
*/
//ZAD 11
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

//ZAD 12 Napisz program, który odczytuje wyraz i sprawdza czy jest on w formacie 1/100,  2/100, .. 99/100,100/100  
/*
        System.out.println("podaj liczbę");
        Scanner scanner1 = new Scanner(System.in);
        String numberFirst = scanner1.next();


        int indexSlash = numberFirst.indexOf("/");
        String first = numberFirst.substring(0, indexSlash);
        String last = numberFirst.substring(indexSlash + 1);
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(last);
        String numberLast = "";
        numberLast = number1 + "/" + number2;


        if ( (numberFirst.indexOf("/")==1 || numberFirst.indexOf("/") ==2)  &&  number1<100 && number2==100      ) {
            System.out.println(numberLast +" ma poprawny format");
        }
*/

    }
}
