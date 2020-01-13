package z_homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class HomeworkMain_2_binaryOperations {

    //https://eduinf.waw.pl/inf/alg/006_bin/0012.php
    //todo: 27.11.2019 Dodawanie, odejmowanie, mnożenie binarne, (dzielenie dla chętnych)


    public static void main(String[] args) {
        String string1 = "110101"; // 53
        String string2 = "101000"; // 40
        String string3 = "100"; // 4
        summBinary(string1,string2);
        subtractBinary(string1,string2);
    }

    static String reverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }
    //todo: dodawaniev1 , pierwszy raz widze takie bledy :)
/*    static void summBinary (String string1, String string2) {
        String result = "";
        char[] reversedString1 = reverse(string1).toCharArray();
        char[] reversedString2 = reverse(string2).toCharArray();

        int counter;
        boolean nextBit =false;
        do {
            counter=0;
            if (nextBit=true) {counter++; nextBit=false;}
            if(Arrays.asList(reversedString1).stream().iterator().next().equals('1')) counter++;
            if(Arrays.asList(reversedString2).stream().iterator().next().equals('1')) counter++;
            if (counter==0) result+=result+0;
            if (counter==1) result+=result+1;
            if (counter==2) {
                result+=result+0;
                nextBit =true;
            }
            if (counter==3) {
                result+=result+1;
                nextBit=true;
            }
        }
        while (Arrays.asList(reversedString1).stream().iterator().hasNext()|Arrays.asList(reversedString2).stream().iterator().hasNext()) ;
        if (nextBit=true) result+=result+1;
            System.out.println(reverse(result));
        }*/
    //todo: dodawaniev2
    static void summBinary (String string1, String string2) {
        int result = Integer.parseInt(string1, 2)+Integer.parseInt(string2, 2);
        System.out.println(Integer.toBinaryString(result));
    }
    //todo: odejmowanie
    static void subtractBinary (String string1, String string2) {
        int result = Integer.parseInt(string1, 2)+(~Integer.parseInt(string2, 2) +1);
        System.out.println(Integer.toBinaryString(result));
    }
    //todo: mnozenie
    static void multiplyBinary (String string1, String string2) {
        int result = Math.multiplyExact(Integer.parseInt(string1, 2),Integer.parseInt(string2, 2) );
        System.out.println(Integer.toBinaryString(result));
    }

    //todo: *dzielenie
    static void devideBinary (String string1, String string2) {
    int result = Integer.parseInt(string1, 2)/Integer.parseInt(string2, 2);
        System.out.println(Integer.toBinaryString(result));
    }
}

