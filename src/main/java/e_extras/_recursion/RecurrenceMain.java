package e_extras._recursion;

public class RecurrenceMain {


    // rekurencja bez returna
    // rekurencja z returnem
    //TODO: zad1, wypisac elementy parzyste 1-100
/*public static void main(String[] args) {
seeOut(1);
    }
   static void seeOut (int n) {
        if(n%2==0) System.out.print(n + ", ");
        if(n%10==0) System.out.println(" ");
        if(n<100)seeOut(++n);
    }*/
    //TODO: zad2a, zamiana dziesietnej na binarną za pomocą pętli
/*        public static void main(String[] args) {
            ;decimalToBinary(10);
        }
    static List<Integer> decimalToBinary (int n) {
        List<Integer> listResultBinary = new ArrayList<>();
    int j = 1;
//        for (int i = 1; i <n ; i*2) {
//            if(n%i==0) {
//                listResultBinary.add(1);
//                i++;
//            }
//        }
        Collections.reverse(listResultBinary);
        for (int i: listResultBinary) {
            System.out.print(i + ", ");
        }
        return listResultBinary;
    }*/
    //TODO: zad2b, zamiana dziesietnej na binarną za pomocą rekurencji

/*    public static void main(String[] args) {

        System.out.println(decimalToBinary(10));
    }
static int decimalToBinary(int liczba) {
    return liczba == 0 ?  decimalToBinary(liczba/2) + liczba % 2 : 1;
}*/
    //TODO: zad3, silnia za pomocą rekurencji
/*
public static void main(String[] args) {
    System.out.println(factorialWithRecursion(10));
}
static int factorialWithRecursion (int n) {
        return n== 0 ? 1: (n * factorialWithRecursion(n-1)) ;
    }*/

    //TODO: zad4a, ciąg fib za pomocą petli
    // czyli chce znaleźć nty wyraz ciągu 0.1.1.2.3.5 ...
/*    public static void main(String[] args) {
  System.out.println(fibWithLoop(5));
  System.out.println(fibWithRecursion(7));

    }
    static int fibWithLoop (int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int[] array = new int[n+1];
        array[0] =0;
        array[1] =1;
        for (int i = 2; i <=n ; i++) {
              array[i] = array[i-2]+array[i-1];
        } return array[n]; }
    //TODO: zad4b, ciąg fib za pomocą rekursji
    static int fibWithRecursion ( int n) {
        return n==0?0:n==1? 1: fibWithRecursion(n-1)+fibWithRecursion(n-2);
    }*/
//TODO: zad5, sumowanie cyfr liczby
//czyli 218 = 11
/*    public static void main(String[] args) {
        int n = 2218;
        System.out.println("testy");
        System.out.println((n/1000-n/10000*10)*1000+(n/100-n/1000*10)*100+(n/10-n/100*10)*10+n%10);
        System.out.println("wyniki");
        System.out.println(n/100+(n/10-n/100*10)+n%10);
        System.out.println(sumOfDiggitsAritmetical(218));
        System.out.println(sumOfDiggitsWithRecurison(218));
    }
    static int sumOfDiggitsAritmetical (int n) {
        System.out.println(n%10);

        return (n/100)-n%10+ (n%1000)-n%100-n%10;
    }
    static int sumOfDiggitsWithRecurison (int n) {
        return n/10>0?  sumOfDiggitsWithRecurison(n/100-n/1000*10)                       : n%10 ;
    }*/
//TODO: exe6, collatz
/*public static void main(String[] args) {
        System.out.println(collatz(27));
    }
    static int collatz(int n){
        if (n==1) return 0;
        else if (n%2==0) return 1 + collatz(n/2);
        else return 1 + collatz(3*n+1);
    }*/

}
