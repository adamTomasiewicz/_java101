package y_quiz;

public class QuizMain_1_Arrays {

/*    //TODO: nie rozumiem tych:
    public static void main(String[] args) {
        int a, b = 2;
        double c = 3;
        System.out.println("wynik " + c + b);

    }*/

    /*TODO: ex1: Co się wypisze na konsoli?
        public static void main(String[] args) {
            int a, b = 2;
            double c = 3;
            System.out.println("Wynik: " + c + b);
            }*

//            a)Wynik: 5
//            b)Wynik: 5.0
//            c)Błąd kompilacji
//            d)Wynik: 3.02 <---
     */
/*//TODO: ex2: Ile z poniższych deklaracji tablic jest poprawnych?
    public static void main(String[] args) {
    int tab[] = {2, 3, 4};
    int[] tab2 = new int[5];
    int tab3[];
    int[] tab4 = new int[]{2, 3, 4};
}*/
//            3
//            1
//            0
//            2
//            4 <----
/*//TODO: ex3: Co się wypisze na konsoli?
    public static void main(String[] args) {
        int[] tab = {4,3,2,3,2,1,2,-4};
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i%3]);
        }
    }
//            43243243 <----
//            432321
//            Błąd kompilacji
//            43232324
//            12345678*/
/*//TODO: ex4: Co się wypisze na konsoli?
    public static void main(String[] args) {
        int[][] tab = { {2,3,4,5},
                        {1,2,3,4},
                        {0,1,2,3},
                        {-1,0,1,2} };
        for(int i = 1; i < tab.length; i++) {
            for(int j = i*i; j < tab.length; j++)
                System.out.print(tab[i][j]);
        }
    }
//        2222
//        2345
//        210
//        234 <----
//        Błąd kompilacji*/
/*//TODO: ex5: Co się wypisze na konsoli?
    public static void main(String[] args) {
    int[][] tab = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
    for(int i = 0, j =0; i < tab.length; i++) {
        if(i % 2 == 0)
            System.out.print(tab[i%2][j]);
        else
            System.out.print(tab[i][j++]);}
    }
//        141
//        142 <----
//        Błąd kompilacji
//        152
//        147*/
/*//TODO: ex6: Co się wypisze na konsoli?
    public static void main(String[] args) {
        int liczba1 = 3;
        int liczba2 = 2;
        System.out.print(2 > 3 ? liczba1++ : liczba2);
        System.out.print(" ");
        System.out.print(liczba1 + liczba2);
    }
//        3 6
//        2 5 <----
//        3 5
//        2 6
//        Błąd kompilacji*/
/*//TODO: ex7: Co się wypisze na konsoli?
    public static void main(String[] args) {
        char c = 'a';
        while(c++ == 'z');
        System.out.print(c);
    }

//    Program nigdy się nie skończy
//    z
//    Błąd kompilacji
//    a
//    b <----*/

    /*//TODO: ex8: Zaznacz zestaw wszystkich specyfikatorów dostępu występujących w języku Java.
    // public, private, inherited
    // public, modified, private
    // public, protected, private, package <----
    // public protected, private
    // public, private, inherited, protected
     */
/*//TODO: ex9: Co się wypisze na konsoli?
public static void main(String[] args) {
    String str = "Komputer";
    String str2 = "Komputer";
    System.out.println(str == str2);
}
//        0
//        true <----
//        1
//        Błąd kompilacji
//        false*/
//TODO: ex10: Co się wypisze na konsoli?
    public static void main(String[] args) {
        int[] tab = {4, 3, 2, 3};
        int i = tab.length - 1;
        while (i < tab.length) {
            System.out.print(tab[i]);
            if (tab[i] % 2 != 0) {
                i -= 1;
            } else i *= i;
        }
    }
//        Nic się nie wypisze
//        43
//        Błąd kompilacji
//        3
//        32 <---

}
