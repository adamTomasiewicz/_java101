package pl.adamTomasiewicz.jdbc_temp;

public class ExceptionsMain {
    public static void main(String[] args) {
        a();
        int[] tab = new int[10];
        //System.out.println(tab[10]);

        String a = null;
        try {
            a.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("test");
        String b = null;
        b.length();

    }

    public static void a() {
        System.out.println("a");
        b();
    }

    public static void b() {
        System.out.println("b");
        c();
    }

    public static void c() {
        System.out.println("c");
        d();
    }

    public static void d() {
        System.out.println("d");
    }

}
