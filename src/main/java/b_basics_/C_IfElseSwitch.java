package b_basics_;

import java.util.Scanner;

public class C_IfElseSwitch {
//THEORY

//EXERCISES
//exercise 1: Check if number is bigger than 5
//    static void isBiggerThan5(int i){
//        if (i>5)System.out.println("number greater than 5");
//        else if (i==5)System.out.println("number = 5");
//        else System.out.println("number is lower than 5"); }
//exercise 2: Check if number is dividable by 3
//   static void isDevidableby3(int i){
//       if (i%3==0) System.out.println("number is dividable by 3");
//       else System.out.println("number is not dividable by 3");}
//exercise 3: Check the password
/*    static void checkPassword(){
        String password = "Akademia";
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type correct password");
        String input = scanner1.next();
        // long method
//       if (input.equalsIgnoreCase(password)) System.out.println("that is correct password");
//       else System.out.println("that is wrong password");
        // short method (if boolean true opt1, if false opt2)
        System.out.println(input.equalsIgnoreCase(password) ? "correct password" : "wrong password");}*/

//exercise 4: check if input is a female name
/*static void checkIfFemaleName(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type name");
    String input = scanner1.next();
    System.out.println(input.endsWith("a")&&!input.equalsIgnoreCase("kuba") ? "Female name":"male name");}*/
//exercise 5: get max value
/*static void getMaxValue (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a");
    int a = scanner1.nextInt();
    System.out.println("type b");
    int b = scanner1.nextInt();
    System.out.println(a>=b?a:b);}*/
//exercise 6: get min value
/*static void getMinValue (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a");
    int a = scanner1.nextInt();
    System.out.println("type b");
    int b = scanner1.nextInt();
    System.out.println("type c");
    int c = scanner1.nextInt();
    System.out.println( a<=b && a<=c ? a : b<=c?b:c); }*/
//exercise 7: Check if m or M is lastchar.
/*  static void checkIfEndsWithMorm(){
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("type word");
      String input = scanner1.next();
      System.out.println(input.toLowerCase().endsWith("m")?"last char is m":"last char isnt m");}*/
//exercise 8:  Check if the last char is same as first char
/*static void checkIfFirstCharAndLastCharSame(){
    Scanner scanner1 = new Scanner(System.in);
      System.out.println("type word");
    String input = scanner1.next();
      System.out.println(input.toLowerCase().endsWith(String.valueOf(input.charAt(0)).toLowerCase())?"first last char are the same":"first and last char are different");}*/
//exercise 9:  Check if two words are equal.
/*static void checkIfWordsTheSame(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type 1 word");
    String word1 = scanner1.next();
    System.out.println("type 2 word");
    String word2 = scanner1.next();
    System.out.println(word1.equals(word2)?"those are the same words":"those words are different");}*/

//exercise 10:  Check if string is an URL adress
/*    static void checkIfStringIsAnURL() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type url");
        String input1 = scanner1.next();
        System.out.println(input1.startsWith("www.")||input1.startsWith("http://")||input1.startsWith("https://")?"correct URL":"incorrect URL"); }*/
//exercise 11: Check if the word contains "ala"
/*static void checkIfWordContainsala() {
    String key = "ala";
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type word");
    String input1 = scanner1.next();
    System.out.println(input1.contains(key)?"word contains "+ key:"word does not contain "+key"); }*/
//exercise 12: check if postal code
/*static void checkIfPostalCode(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type postal code");
    String postalCode = scanner1.next();
    if (postalCode.length()==6 && postalCode.charAt(2)=='-'
    && Character.isDigit(postalCode.charAt(0))&& Character.isDigit(postalCode.charAt(1))&& Character.isDigit(postalCode.charAt(3))&& Character.isDigit(postalCode.charAt(4)))
        System.out.println("its a postal code");
    else System.out.println("wrong format");}*/
//exercise 13: check if dividable by 3 or 5
/*static void checkIfDividableBy3or5() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your number");
    int number1 = scanner1.nextInt();
    if (number1%3==0 && number1%5==0) System.out.println("number "+number1+ " is dividable by 3 and 5");
    else if (number1%3==0 ) System.out.println("number "+number1+ " is dividable by 3");
    else if (number1%5==0 ) System.out.println("number "+number1+ " is dividable by 5");
    else System.out.println("number "+number1+ " is not dividable 3 nor 5"); }*/
//exercise 14: check if person is an adult
/*static void checkIfPersonIsAdult() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your age");
    int age = scanner1.nextInt();
    if (age>=18) System.out.println("you are an adult");
    else System.out.println("your a minor");}*/
//exercise 15: check if both ppl are teanagers
    /*static void checkIfBothPplAreTeenagers(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("type age of a first person");
        int age1 = scanner1.nextInt();
        System.out.println("type age of a secound person");
        int age2 = scanner1.nextInt();
        if (age1>=13&&age1<=18 && age2>=13&&age2<=18) System.out.println("both are teenagers");
        else System.out.println("they are not a teenagers");} */
//exercise 16: check if from given 3 numbers if you ad 2 of them the 3 will be a sum of them
/*static void checkIfOneNumberIsaSumOfTwoOthers() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a");
    int a = scanner1.nextInt();
    System.out.println("type b");
    int b = scanner1.nextInt();
    System.out.println("type c");
    int c = scanner1.nextInt();
    System.out.println((a+b==c || b+c==a || c+a==b)?"yes":"no");}*/

    public static void main(String[] args) {

 }

}
