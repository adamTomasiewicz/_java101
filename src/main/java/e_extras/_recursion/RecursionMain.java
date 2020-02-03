package e_extras._recursion;

public class RecursionMain {

    public static void main(String[] args) {

        System.out.println(countX("xsxxax"));

    }

    static int countX(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return countX(str.substring(1)) + 1;
        }

        return countX(str.substring(1));
    }

}
