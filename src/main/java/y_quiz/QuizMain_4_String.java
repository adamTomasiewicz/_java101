package y_quizes;

public class QuizMain_4_String {
    public static void main(String[] args) {
        System.out.println("wynik");
        System.out.println("p1");
        System.out.println("Dane: " + "AAAAAFFFRTTTD");
        System.out.println("wynik: " + "A5F3RT3D");
        System.out.println("test : " + methodTest("AAAAAFFFRTTTD"));
        System.out.println("p2");
        System.out.println("Dane: " + "ERWEEERR");
        System.out.println("wynik: " + "ERWE3R2");
        System.out.println("test : " + methodTest("ERWEEERR"));
        System.out.println("p3");
        System.out.println("Dane: " + "RRRRRRRTTTTTTTWWWWWYDYDYDYDYDYDYDYDDDDD");
        System.out.println("wynik: " + "R7T7W5YDYDYDYDYDYDYDYD5");
        System.out.println("test : " + methodTest("RRRRRRRTTTTTTTWWWWWYDYDYDYDYDYDYDYDDDDD"));

    }

    static String methodTest(String string) {
        if (string == null | string.isEmpty()) {
            return "-1";
        }
        char[] chars = string.toCharArray();
        int counter = 0;
        boolean isSameChar = false;
        String string2 = chars[0] + "";

        for (int i = 1; i <= chars.length - 1; i++) {
            if (chars[i] == chars[i - 1] && !isSameChar) {
                isSameChar = true;
                counter = 1;
            }
            if (!(chars[i] == chars[i - 1]) && isSameChar) {
                isSameChar = false;
                string2 = string2 + counter;
            }
            if (chars[i] == chars[i - 1] && isSameChar) {
                counter++;
            }
            if (!(chars[i] == chars[i - 1]) && !isSameChar) {
                string2 = string2 + chars[i];
            }
            if ((chars[i] == chars[i - 1]) && i == chars.length - 1) {

                string2 = string2 + counter;
            }
//                if(!(chars[i]==chars[i-1])&&i==chars.length-1) {
//                    string2=string2+chars[i];
//                }

        }
        return string2;
    }

}
