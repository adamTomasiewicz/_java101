package c_core_exceptions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
   //     throwsAritmeticException();
        print (new Object());
        print(null);
     //   throwMyException();
multiCatch();
    }
    private static void throwsAritmeticException (){
        int result = 1/0;
    }
    private static void print(Object o) {
        if (o==null) {
            System.out.println(o);
            return;
        }
        System.out.println(o.toString());
    }
    private  static void throwMyException() {
        throw new NullPointerException();
    }
private static void multiCatch () {
        try {
//      NullPointerException npe = new NullPointerException();
//      throw npe;
            //throw new IllegalArgumentException();
            throw new IOException();
        }
        catch (RuntimeException e){
            System.out.println("RuntimeException");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Exception");
        }


}
    private static void oneCatchMultiExceptions () {
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e);
        }

    }
    private static void finallyClause() {
        try {
            String fileName = "/Users/bartloemijs/Desktop/pantadeusz.thx";
            Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e){ throw new RuntimeException(e);}
            finally {
            if(true) throw new RuntimeException();
            System.out.println("Finally block");

        }
    }

}
