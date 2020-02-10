package b_javaBasics._string;

public class StringEquals {
    public static void main(java.lang.String[] args) {

        //EXERCISE
        String s1 = "Król Karol kupił królowej Karolinie korale koloru koralowego";
        System.out.println(s1.indexOf("Karol", 6));
        System.out.println(s1.startsWith("Król"));
        //komu?
        String krolowej = "królowej"; //9 znakow
        int krolowejIndex = s1.indexOf(krolowej);
        System.out.println(krolowejIndex);
        System.out.println(s1.substring(krolowejIndex + 9, s1.indexOf(" ", krolowejIndex + 9)));

        //THEORY

        //string pool
        /*java.lang.String hello = "Hello";
        java.lang.String helloWorld = hello+ "World!";

        System.out.println(hello);
        System.out.println(helloWorld);

        java.lang.String hello2="Hello";
        System.out.println(hello==hello2);
        System.out.println(hello.equals(hello2));

        String s1 = "Ala ma kota";
        String s2 = "Ala ma kota";
        String s3 =  new String("Ala ma kota").intern();
        String s4 =  new String("Ala ma kota").intern();

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        //Stringbuilder i Stringbuffer
        StringBuilder sb1 = new StringBuilder("Ala ma kota");
        sb1.append(" oraz psa").append(" oraz papuge");
        String s11 = "ala ma"+sb1+"costam"+sb1;
        System.out.println(s11);

        String login ="Lolek"; //wartość zewnetrzna ktora moze być nullem
        if (login.equals("Bolek")){}
        if ("Bolek".equals(login)){}
        //stala wartość po lewej stronie, bo to nas zabezpiecza przed NPE
        */


    }
}
