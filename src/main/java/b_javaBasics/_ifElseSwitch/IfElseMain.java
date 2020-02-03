package b_javaBasics._ifElseSwitch;

public class IfElseMain {
    public static void main(String[] args) {
        System.out.println(sumNoTeenValue(20, 14, 15));
    }

    static int sumNoTeenValue(int a, int b, int c) {
        return getTeenValue(a) + getTeenValue(b) + getTeenValue(c);
    }

    static int getTeenValue(int myInt) {
        if (myInt > 11 && myInt < 15 || myInt > 16 && myInt < 20) return 0;
        if (myInt == 15) return 15;
        return myInt;
    }
}
