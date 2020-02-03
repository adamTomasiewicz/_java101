package b_javaBasics.loops;

public class D_Loops {
//THEORY
    // WHILE (A) DO {B} -
    // DO {A} WHILE (B) -
    // for (from A; up to B; do C) and every time DO {D} -
    // for (every A : in B ) DO {C}
    //skrót "list.iter" create for each loop

//EXERCISES
//exercise 1: method that prints 5 numbers staring from
/*static void numbersInRange (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("tell me where to start iteration");
    int startNumber=scanner1.nextInt();
    for (int i = 0;  i<5 ; i++) System.out.println(startNumber++);}*/
//exercise 2: write method that will print word 5 times
/*static void word5times (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a word");
    String word=scanner1.next();
    for (int i = 0;  i<5 ; i++) System.out.println(word);}*/
//exercise 3: create a method that will print odds in range 5 to 50
/*static void numbersInRange (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("write a number");
    int startNumber=scanner1.nextInt();
    for (int i = 0;  i<50 ; i+=2) {startNumber++; if (startNumber%2==1) System.out.println(startNumber++);}}*/
//exercise 4: write a method printing numbers in range 25 descending
/*static void numbersInRange (){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("write a number");
    int startNumber=scanner1.nextInt();
    for (int i = 0;  i<50 ; i+=2) System.out.println(startNumber--);}*/
//exercise 5: write a method that reads n and sumup numbers from 1 to n
/*static void sumNumbersUpToo () {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("write a number");
    int number1= scanner1.nextInt();
    int sum=0;
    for (int i = 1; i <number1 ; i++)sum+=i;
    System.out.println(sum); }*/
//exercise 6: write a game that will require guesing a random number in range 1-500. Player can gues untill he reaches the number.
/*static void guessTheRandomNumber (){
    Random random1 = new Random();
    int number = random1.nextInt(500)+1;
    System.out.println(number);
    Scanner scanner1 = new Scanner(System.in);
    int shot=-1;
    do {if (shot==-1){
        System.out.println("guess the number");
        shot= scanner1.nextInt();}
        else if (shot<number) {System.out.println("number is bigger");
            System.out.println("guess the number");
            shot= scanner1.nextInt();}
        else if(shot>number) {System.out.println("number is lower");
            System.out.println("guess the number");
            shot= scanner1.nextInt();}}
    while (shot!=number);
        if (shot==number) System.out.println("you did it!"); }*/
//exercise 7: create a program that will generate 6 random numbers in range 1-49
/*static void lotto () {
    Random random1 = new Random();
    int[] result = new int[6];
    int number = 0;
    for (int i = 0; i<6 ; i++) {
        do{number = random1.nextInt(48)+1;System.out.println(number);}
        while (number==result[0] || number==result[1] || number==result[2] || number==result[3] ||number==result[4] ||number==result[5]);
        result[i]=number;}
    System.out.println("random numbers are:");
    for (int numberr: result) {
        System.out.print(numberr+" ");} }*/
//exercise 8: create a program that will ask for a password until given
/*    static void gimmePassword () {
        String password = "qwerty";
        Scanner scanner1=new Scanner(System.in);
        String input ="";
        do { System.out.println("type password"); input = scanner1.next();}
        while (!input.equalsIgnoreCase(password));
        System.out.println("it is correct password"); }*/
//exercise 9: create a program that reads n and return n!
/*static void nFactorial(){
    Scanner scanner1=new Scanner(System.in);
    System.out.println("type n");
    int n = scanner1.nextInt();
    int sum = 0;
    for (int i = 1; i <=n ; i++) {
        sum=+(i*sum); }
    System.out.println(sum); }*/
//exercise 10: create a program that will generate a) tower b) tree from *. height is based on given n
/*static void shapeFromStars() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a");
    int a = scanner1.nextInt();
    //a
    for (int i = 1; i <=a ; i++) {
        System.out.println(' ');
        for (int j = 1; j <=i ; j++) {
            System.out.print('*');
        }
    }
    //b
    System.out.println("type b");
    int b = scanner1.nextInt();
    if (b%2==0) b=b-1;
    //b =5
    for (int i = 0; i < b; i++) {
    }
}*/
//exercise 11: read the sentence and type all digits that were used in a String
/*static void whatDigitsHaveBeenUsed (String sentence) {
    for (int i = 0; i <sentence.length() ; i++) {
        if(Character.isDigit(sentence.charAt(i))){
            System.out.print(sentence.charAt(i)+" ");
        } }
}*/
//exercise 12: create a program that checks if word is a palindrom
/*static void isItAPalindrom (String word1) {
    String word2 ="";
    for (int i = word1.length()-1; i >=0 ; i--) word2 = word2 + word1.charAt(i);
    System.out.println(word1.equals(word2)?"it is a palindrom":"it is not a palindrom");
}*/
//exercise 13: create a program that will type number of stars
/*static void stars () {
    System.out.println("type number of stars");
    Scanner scanner1 = new Scanner(System.in);
    int number1 = scanner1.nextInt();
    for (int i = 0; i <number1 ; i++) System.out.print('*');
}*/
//exercise 14: create a program that will check if prime number or not
/*static void checkIfPrimeNumber () {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type a number");
    int number1 = scanner1.nextInt();
    int counter1=0;
    for (int i = 1; i <number1 ; i++)  if (number1%i==0) counter1++;
    System.out.println(counter1>1? "it is not a prime number":"this is a prime number" );
}*/
//exercise 15: create a program that will read the word and type it back reversed
/*static void reverseWord(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your word");
    String word1 = scanner1.next();
    String word2 = "";
    for (int i = 0; i <word1.length() ; i++) word2 = word2 + word1.charAt(word1.length()-i-1);
    System.out.println(word2);
}*/
//exercise 16: create a program that will return amount of lowerCase letters in a sentence
/*static void numberOfLowerCaseLetters () {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your word");
    String word1 = scanner1.next();
    int counter1=0;
    for (int i = 0; i <word1.length() ; i++) if(Character.isLowerCase(word1.charAt(i))) counter1++;
    System.out.println(counter1);
}*/
//exercise 17: create a program that will type only every 2nd character from a word
/*static void returnEvery2ndLetter () {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("type your word");
    String word1 = scanner1.next();
    for (int i = 0; i <word1.length() ; i+=2) System.out.print(word1.charAt(i));
}*/

    public static void main(String[] args) {

    }
}
