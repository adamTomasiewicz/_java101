package pl.adamTomasiewicz.a_temp;

public class exercise7_dividesSelf {
    public static void main(String[] args) {

        System.out.println(dividesSelf(128));
    }

    static boolean dividesSelf (int n) {
if (n==0) return false;
        int a = n%10;

        int b = (n%100 - a)/10;

        int c = ((n%1000 - a) - b*10)/100;

       if (a==0||b==0||c==0) return false;
        return n%a==0 && n%b==0 &&n%c==0;

    }
}
