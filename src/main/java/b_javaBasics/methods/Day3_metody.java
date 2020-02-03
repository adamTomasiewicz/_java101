package b_javaBasics.methods;

public class Day3_metody {

/*
    public static void main(String[] args) {
        sayHello();
        sayHello(5);

        Day3_metody main = new Day3_metody();
        System.out.println(main.sum(2, 3));
        System.out.println(main.multiply(2, 3));
        System.out.println(main.factorial(10));
    }

    static void sayHello() {
        System.out.println("Cześć");
    }

    static void sayHello(int n) {
        for (int i = 0; i < n; i++) {
            sayHello();

        }
    }

    int sum(int a, int b) {

        return a + b;
    }

    int multiply(int a, int b) {

        return a * b;
    }

    public static long factorial(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x = x*i;
        }
        return x;
    }

 */

/*
    public static String helloName(String name) {


            return "Hello " + name +"!";
    }

    public static void main(String[] args) {

       Day3_metody main = new Day3_metody();
        System.out.println(main.helloName("Bob"));
    }
*/
//static int sum3(int n){
//? IF : Else
//    return n%2==0 ? (n/2)*(n+1) : (n+1)/2*n;


//https://codingbat.com/prob/p184030
//public String makeOutWord(String out, String word) {
//  return out.substring(0,out.length()/2)+word+out.substring(out.length()/2,out.length());
//}
//    public String extraEnd(String str) {
//    return str.charAt(str.length()-2)+str.charAt(str.length()-1);

//}

//Warmup-2 > frontTimes https://codingbat.com/prob/p101475
/*    public static String frontTimes(String str, int n) {
        int length = str.length()<3 ? str.length() : 3;
        StringBuilder word = new StringBuilder(str.substring(0,length));
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
 */

//Warmup-2 > countXX https://codingbat.com/prob/p194667
/*
   static int countXX(String str) {
        int counter = 0;
        for (int i = 0; i<str.length()-1; i++) {
            int poczatek = i;
            String word = "" + str.charAt(poczatek) + str.charAt(poczatek+1);
            if (word.equalsIgnoreCase("xx")){
                counter++;
            }

        }
        return counter;

    }
    */
    //Warmup-2 > doubleX https://codingbat.com/prob/p186759
//OPTION 1
/*boolean doubleX(String str) {

    int firstX = str.indexOf('x');

    if ((firstX<str.length()-1)  &&(str.charAt(firstX+1))=='x' ){
        return true;
    }
    return false;
}
//OPTION 2
// returnt str.indexOf("xx")!=-1 && (str.indexOf("xx")==str.indexOf("x"));
*/
//Warmup-2 > stringBits https://codingbat.com/prob/p165666

    /*
    public String stringBits(String str) {
        StringBuilder sb1 = new StringBuilder();
        sb1 = '';
        for (int i = 0; i <=str.length()-1 ; i+=2) {
            if (i%2==1){
                continue;
            }
            sb1.append(str.charAt(i));
        }
        return sb1.toString(sb1);
    }


    static void swap(int a, int b){
        int c = a;
        b=a;
        a=c;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+ " "+b);

    }
*/
}
