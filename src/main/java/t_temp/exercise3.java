package pl.adamTomasiewicz.a_temp;

public class exercise3 {
    public static void main(String[] args) {
        System.out.println(sumNoTeenValue(20,14,15));
    }
    static int sumNoTeenValue (int a, int b, int c) {
        return getTeenValue(a)+getTeenValue(b)+getTeenValue(c);
    }
    static int getTeenValue (int myInt) {
        if (myInt > 11 && myInt<15||myInt > 16 && myInt<20) return 0;
        if (myInt ==15) return 15;
        if (myInt ==16) return 16;
        return myInt;
    }
}
