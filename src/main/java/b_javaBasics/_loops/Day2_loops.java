package b_javaBasics._loops;

public class Day2_loops {
    public static void main(String[] args) {
//
// FOR - skrót: fori
// skrót "list.iter" create for each loop
// BREAK; - kończy pętle, CONTINUE - kontunuj od poczatku petli(wyjatki)
// DO, WHILE
// WHILE - stosuje się tam gdzie tam gdzie wykona się raz
// MY_LOOP: fori ; BREAK MY_LOOP;


//ZAD 1 Napisz program, który wypisuje wszystkie liczby od 20 do 50. 
/*
        for (int i = 20; i <=50 ; i++) {
            System.out.println(i);
        }

 */
//ZAD 2 Napisz program, który na ekran wypisuje 8 razy napis Witam.
/*
        for (int i = 0; i <8 ; i++) {
            System.out.println("witam");
        }
 */
//ZAD 3 Napisz program, który wypisuje liczby od 20 do 50, które są parzyste
/*
        for (int i = 20; i <=50  ; i+=2) {
             System.out.println(i);
        }
*/
//ZAD 4 Napisz program, który wypisuje liczby od 100 do 50 (w tej kolejności).
/*        for (int i = 100; i >= 50 ; i--) {
            System.out.println(i);
        }

 */
//ZAD 5 Napisz program, który losuje 6 liczb z Dużego Lotka. 
/*        for (int i = 1; i <=6; i++) {
            Random random = new Random();
            int r = random.nextInt((49) + 1);
            System.out.println(r);
        }

 */
//ZAD 6 Napisz program drukujący na ekranie 10 gwiazdek:  ********** 
/*        for (int i = 0; i <10 ; i++) {
            System.out.print("*");
        }
*/
//ZAD 7 Napisz program, który prosi o podanie poprawnego hasła( hasło to  Programowanie),
// tak długo jak użytkownik nie odgadnie hasła wyświetlany jest  komunikat podaj poprawne hasło. 
/*            String a = "";
            do {
                System.out.println("podaj haslo");
                Scanner scanner1 = new Scanner(System.in);
                String haslo = scanner1.next();
                a=haslo;
            }
            while (!a.equalsIgnoreCase("Programowanie"));
*/
//ZAD 8 Odczytaj wyraz i wypisz wszystkie litery występujące w wyrazie. 
// Przykładowo dla ala544mm,  Ma wypisać tylko alamm 
/*
        System.out.println("podaj wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String wyraz = scanner1.next();
        String s = "";
        StringBuilder sb1 = new StringBuilder() ;


        for (int i = 0; i <wyraz.length(); i++) {
            if (Character.isLetter(wyraz.charAt(i))){
                sb1.append(wyraz.charAt(i));
            }
        }
        System.out.println(sb1);
*/
//ZAD 9 ​ Napisz program, który przy pomocy pętli for odwróci dany wyraz,  przykładowo:  Michał  łahciM 
/*
        System.out.println("podaj wyraz");
        Scanner scanner1 = new Scanner(System.in);
        String wyraz = scanner1.next();

        for (int i = wyraz.length()-1; i >= 0 ; i--) {
            char letter = wyraz.charAt(i);
            System.out.print(letter);
        }
*/
//ZAD 10 Napisz program przy użyciu pętli while, która wypisze wszystkie liczby od 20 do 50. 
/*        int x=20;
        do {
            System.out.println(x);
            x++;

        }
        while (x<=50);

        // int i = 20;
        // while(i !=51) {
        // System.out.println(i);
        // i++; }

 */
//ZAD 11 Za pomocą pętli for napisz program, który sprawdza czy liczba jest  pierwsza czy złożona. 
/*        System.out.println("podaj liczbe, sprawdze czy jest pierwszą");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        int counter = 0;

        for (int i = 1; i <=number ; i++) {
            if (number%i==0) {
                System.out.println(number +" dzieli się przez "+i);
                counter++;
            }

        }
        if (counter>2){
            System.out.println("To nie jest liczba pierwsza");
        }
        else{
            System.out.println("To jest liczba piersza!");
        }
*/
//ZAD 12 Napisz program, który odczytuje wyraz i sprawdza czy wyraz jest palindromem. 
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

    }

}
