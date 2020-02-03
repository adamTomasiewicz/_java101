package b_javaBasics._dataTypes_variables;

public class A_Variables {

//THEORY
/*

typy liczbowe proste:
    byte byteMin = Byte.MIN_VALUE;
    byte byteMax = Byte.MAX_VALUE;
    short shortMin = Short.MIN_VALUE;
    short shortMax = Short.MAX_VALUE;
    int intMin = Integer.MIN_VALUE;
    int intMax = Integer.MAX_VALUE;
    long longMin = Long.MIN_VALUE;
    long longMax = Long.MAX_VALUE;
    double doubleMin = Double.MIN_VALUE;
    double doubleMax = Double.MAX_VALUE;
    // BigInteger - calkowite BigDecimal - zmiennoprzecinkowe
        System.out.println(byteMin+" : "+byteMax);
        System.out.println(shortMin+" : "+shortMax);
        System.out.println(intMin+" : "+intMax);
        System.out.println(longMin+" : "+longMax);
        System.out.println(doubleMin+" : "+doubleMax);
*/


    //EXERCISES
//exercise 1: Wyświetl na ekranie Hello World!
//System.out.println("Hello World!");
//exercise 2: Wyświetl na ekranie 1000
//System.out.println(1000);
//exercise 3: Wyświetl 100*30 000
//System.out.println(100*30000);
//exercise 4: Wyświetl ostatnią cyfrę liczby
//static void lastDigit(){
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("type your number");
//    int number = scanner.nextInt();
//    System.out.println("last digit is "+number%10);}
//exercise 5: Wyświetl sumę dwóch liczb
//    static void sumTwoNumbers() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("type first number");
//        int number1 = scanner.nextInt();
//        System.out.println("type secound number");
//        int number2 = scanner.nextInt();
//        System.out.println("suma to "+(number1 + number2));}
//exercise 6: co z tym kodem jest nie tak?
// - brakuje srednika
//exercise 7: Napisz program liczący pole koła
//    static void areaOfCircle(){
//        double pi = 3.14;
//        Scanner scanner = new Scanner(System.in);
//     System.out.println("type radius");
//  int radius = scanner.nextInt();
//  System.out.println("area of circle ="+ (Math.pow(pi*radius, 2)));}
//exercise 8: Napisz program ktory odczytuje dwie liczby i wyswietli ich iloraz zmiennoprzecinkowy
//    static void aTimesB() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("type a");
//        double a = scanner.nextDouble();
//        System.out.println("type b");
//        double b = scanner.nextDouble();
//        System.out.println((a / b)); }
//exercise 9:     co z tym kodem nie tak?
// brak deklaracji b
//exercise 10: wypisz liczbe 12 147 483 647
//    BigInteger number1 = new BigInteger("12147483647");
//    long number2=12147483647L;
//        System.out.println(number1.longValue()+number2);
//exercise 11: random z przedziału 1-100
//static void newRandom1to100(){
//    Random newrandom = new Random();
//    System.out.println(newrandom.nextInt(100)+1);}
//exercise 12:
//static void twoNumbersExchanged(){
//    Scanner scanner1 = new Scanner(System.in);
//    System.out.println("type a");
//    int a = scanner1.nextInt();
//    System.out.println("type b");
//    int b = scanner1.nextInt();
//    int c = a;
//    a=b;
//    b=c;
//    System.out.println("after exchange a="+a+" and b="+b);}
//exercise 13: napisz program ktory wyswietli srednia z trzech liczb ze scanera, wynik zaokraglij do 2 miesc po przecinku
/*static void avgFromABC(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a");
    float a = scanner1.nextInt();
    System.out.println("type b");
    float b = scanner1.nextInt();
    System.out.println("type c");
    float c = scanner1.nextInt();

    System.out.println("avg is ");
    System.out.printf("%.2f",(a+b+c)/3);}*/

    public static void main(String[] args) {
        String test = "Developer";
        System.out.println(test);
        test.toUpperCase();
        System.out.println(test);
        System.out.println(test.toLowerCase());
    }
}
