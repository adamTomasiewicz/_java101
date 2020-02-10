package b_javaBasics._string;

public class StringMain {

    public static void main(String[] args) {
        String text1 = "Test";
        String text2 = "Test";
        String text3 = "Te" + "st";

        if (text1 == text2) System.out.println("text 1 i text 2 sa sobie rowne");
        if (text2 == text3) System.out.println("text 2 i text 3 sa sobie rowne");
        if (text3 == text1) System.out.println("text 3 i text 1 sa sobie rowne");
    }
}
