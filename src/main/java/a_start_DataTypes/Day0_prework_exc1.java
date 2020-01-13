package a_start_DataTypes;


public class Day0_prework_exc1 {
    public static void main(String[] args) {

    }

/*Zadanie1​.Napisz program,który odczytuje z ekranu liczbę i wypisuje na ekran 5*liczba. 
public class zadaniaPrework {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("podaj liczbę");
    double liczba = scanner.nextInt();
    System.out.println(liczba +"*5=");
    double wynik = liczba*5;
    System.out.println(wynik);
    }
}
*/

//Zadanie2​.Napisz program,który odczytuje 2 liczby i wypisuje na ekran większą z liczb. 
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        double liczba1 = scanner1.nextInt();
        System.out.println("Liczba pierwsza to: "+liczba1);

        Scanner scanner2 =new Scanner(System.in);
        System.out.println("podaj drugą liczbe");
        double liczba2 = scanner2.nextInt();
        System.out.println("Liczba druga to: "+liczba2);

        if (liczba1>liczba2) {
            System.out.println("większa z liczba to: " + liczba1);
        }
        else if (liczba2>liczba1) {
            System.out.println("większa z liczba to: " + liczba2);
        }
    }
}
*/

// Zadanie3.​Napisz program , który odczytuje liczbę całkowitą i wypisuje na ekran ostatnią  cyfrę danej liczby.  
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba1 = scanner1.nextInt();
        System.out.println("Ostatnia cyfra liczby to: " + liczba1 % 10);
    }
}
*/

// Zadanie4​.Odczytaj daną liczbę i jeśli jest dodatnia wypisz na ekran komunikat dodatnia w  przeciwnym bądź razie komunikat ujemna.  
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba1 = scanner1.nextInt();
        if (liczba1 > 0) {
            System.out.println("dodatnia");
        }
        if (liczba1 < 0) {
            System.out.println("ujemna");
        }
    }
}
*/

// Zadanie5.​Napisz program ,który prosi o podanie użytkownika o wiek. Jeśli wiek jest >18  podaje komunikat jesteś pełnoletni w przeciwnym wypadku nie możesz korzystać z tego  serwisu.  
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj wiek");
        int age = scanner1.nextInt();
        if (age >= 18) {
            System.out.println("jesteś pełnoletni");
        }
        if (age < 18) {
            System.out.println("spadaj gnoju");
        }
    }
}
*/


// Zadanie6​.Napisz program, który odczytuje 3 liczby i wypisuje na ekran największą. 
// Zadanie7.​Napisz program, który wczyta dwie liczby całkowite a i b, a następnie wykona na  nich obliczenia. Efekt działania programu powinien być następujący:    
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj liczbe a");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj liczbe b");
        int b = scanner2.nextInt();
        System.out.println("a+b="+a+b);
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+a*b);
        System.out.println("a/b="+a/b);
        System.out.println("a%b="+a%b);
    }
}
*/

// Zadanie8​.Napisz program, który sprawdza czy wprowadzona liczba przez użytkownika jest  parzysta, czy nieparzysta. 
// Zadanie9.​Napisz program,który wypisuje na ekran wszystkie liczby od 1 do 100. 
/*public class zadaniaPrework {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            System.out.println(i);

        }
    }
}
*/


// Zadanie10​.Napisz program,który wypisuje na ekran wszystkie liczby od 200 do 1 ( w tej  kolejności).  

/*public class zadaniaPrework {
    public static void main(String[] args) {
        for (int i=200;i>=1;i--){
            System.out.println(i);

        }
    }
}
*/
// Zadanie11.​Napisz program,który oblicza sumę 1+2+3+4+5+6+.............+1000. 

/*public class zadaniaPrework {
    public static void main(String[] args) {
        int a=0;
        for (int i=1;i<=1000;i++){
            a = a+i;
        }
        System.out.println(a);
    }
}
*/

// Zadanie12.​ Napisz program, który prosi użytkownika o podanie właściwego hasła. Hasło  poprawne to Akademia. 
/*public class zadaniaPrework {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input;
        do{
            System.out.println("Podaj hasło");
            input = scanner1.next();
        }
        while(!input.equals("Akademia"));
        System.out.println("Gratulacje! Możesz wejsć");

    }
}
*/

}
