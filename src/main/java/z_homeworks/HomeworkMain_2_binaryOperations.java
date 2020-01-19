package z_homeworks;

class HomeworkMain_2_binaryOperations {

    //https://eduinf.waw.pl/inf/alg/006_bin/0012.php
    //todo: 27.11.2019 Dodawanie, odejmowanie, mnożenie binarne, (dzielenie dla chętnych)


    {

    }

    public static void main(String[] args) {
        String string1 = "110101"; // 53
        String string2 = "101000"; // 40
        String string3 = "100"; // 4
        String string4 = ""; // 0
        //System.out.println(summBinaryWithLoop_1(string1, string4));
        //System.out.println(subtractBinaryWithLoop_1(string1,string3));
        System.out.println(multiplyBinaryWithLoop_1(string1, string3));
    }

    static String reverseStringWithStringbuilder(String original) {
        return new StringBuilder(original).reverse().toString();
    }

    //todo: 1->summBinaryWithLoop_1
    static String summBinaryWithLoop_1(String string1, String string2) {
        //put longer string at string1
        String tempString = "";
        if (string1.length() < string2.length()) {
            tempString = string1;
            string1 = string2;
            string2 = tempString;
        }
        int topLength = string1.length();
        int lowLength = string2.length();

        char[] string11 = reverseStringWithStringbuilder(string1).toCharArray();
        char[] string22 = reverseStringWithStringbuilder(string2).toCharArray();
///////test print
  /*      for (int i = 0; i <topLength ; i++) {
            System.out.print(string11[i]);
        }
        System.out.println();

        for (int i = 0; i <lowLength ; i++) {
            System.out.print(string22[i]);
        }*/
///////
        String stringResult = "";
        int flag = 0;
        for (int i = 0; i < lowLength; i++) {
            if (Integer.valueOf(string11[i] + "") + Integer.valueOf(string22[i] + "") + flag == 0) {
                stringResult = stringResult + '0';
                flag = 0;
            } else if (Integer.valueOf(string11[i] + "") + Integer.valueOf(string22[i] + "") + flag == 1) {
                stringResult = stringResult + '1';
                flag = 0;
            } else if (Integer.valueOf(string11[i] + "") + Integer.valueOf(string22[i] + "") + flag == 2) {
                stringResult = stringResult + '0';
                flag = 1;
            } else if (Integer.valueOf(string11[i] + "") + Integer.valueOf(string22[i] + "") + flag == 3) {
                stringResult = stringResult + '1';
                flag = 1;
            }
        }
        for (int j = lowLength; j < topLength; j++) {
            if (Integer.valueOf(string11[j] + "") + flag == 0) {
                stringResult = stringResult + '0';
            } else if (Integer.valueOf(string11[j] + "") + flag == 1) {
                stringResult = stringResult + '1';
                flag = 0;
            } else if (Integer.valueOf(string11[j] + "") + flag == 2) {
                stringResult = stringResult + '0';
                flag = 1;
            }
        }
        if (flag == 1) {
            stringResult = stringResult + '1';
        }
        return reverseStringWithStringbuilder(stringResult);
    }

    //todo: summBinaryWithInteger_2
    static void summBinaryWithInteger_2(String string1, String string2) {
        int result = Integer.parseInt(string1, 2) + Integer.parseInt(string2, 2);
        System.out.println(Integer.toBinaryString(result));
    }
    //todo: summBinaryWithStream_3
/*    static void summBinaryWithStream_3 (String string1, String string2) {
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
        }
        while (string1.chars().iterator().hasNext()|string1.chars().iterator().hasNext()){
            System.out.println(string1.chars().iterator().next());
        }
        */

    //todo: 2->subtractBinaryWithLoop_1
    static String subtractBinaryWithLoop_1(String string1, String string2) {
        //put longer string at string1
        String tempString = "";
        if (Integer.parseInt(string1, 2) < Integer.parseInt(string2, 2)) {
            tempString = string1;
            string1 = string2;
            string2 = tempString;
        }

        int topLength = string1.length();
        int lowLength = string2.length();

        char[] string11 = reverseStringWithStringbuilder(string1).toCharArray();
        char[] string22 = reverseStringWithStringbuilder(string2).toCharArray();
///////test print
  /*      for (int i = 0; i <topLength ; i++) {
            System.out.print(string11[i]);
        }
        System.out.println();

        for (int i = 0; i <lowLength ; i++) {
            System.out.print(string22[i]);
        }*/
///////
        String stringResult = "";
        int flag = 0;
        for (int i = 0; i < lowLength; i++) {
            if (Integer.valueOf(string11[i] + "") - Integer.valueOf(string22[i] + "") - flag == 1) {
                stringResult = stringResult + '1';
                flag = 0;
            } else if (Integer.valueOf(string11[i] + "") - Integer.valueOf(string22[i] + "") - flag == 0) {
                stringResult = stringResult + '0';
                flag = 0;
            } else if (Integer.valueOf(string11[i] + "") - Integer.valueOf(string22[i] + "") - flag == -1) {
                stringResult = stringResult + '0';
                flag = 1;
            } else if (Integer.valueOf(string11[i] + "") - Integer.valueOf(string22[i] + "") - flag == -2) {
                stringResult = stringResult + '1';
                flag = 2;
            } else if (Integer.valueOf(string11[i] + "") - Integer.valueOf(string22[i] + "") - flag == -3) {
                stringResult = stringResult + '0';
                flag = 3;
            }

        }
        for (int j = lowLength; j < topLength; j++) {
            if (Integer.valueOf(string11[j] + "") - flag == 1) {
                stringResult = stringResult + '1';
            } else if (Integer.valueOf(string11[j] + "") - flag == 0) {
                stringResult = stringResult + '0';
                flag = 0;
            } else if (Integer.valueOf(string11[j] + "") - flag == -1) {
                stringResult = stringResult + '1';
                flag = 1;
            } else if (Integer.valueOf(string11[j] + "") - flag == -1) {
                stringResult = stringResult + '1';
                flag = 1;
            }
        }
        return reverseStringWithStringbuilder(stringResult);
    }

    static void subtractBinaryWithInteger_2(String string1, String string2) {
        int result = Integer.parseInt(string1, 2) + (~Integer.parseInt(string2, 2) + 1);
        System.out.println(Integer.toBinaryString(result));
    }

    //todo: mnozenie
    static String multiplyBinaryWithLoop_1(String string1, String string2) {
        //put longer string at string1
        String tempString = "";
        if (Integer.parseInt(string1, 2) < Integer.parseInt(string2, 2)) {
            tempString = string1;
            string1 = string2;
            string2 = tempString;
        }
        int topLength = string1.length();
        int lowLength = string2.length();
        char[] string11 = string1.toCharArray();
        char[] string22 = string2.toCharArray();
        String stringResult;
        String stringResultFinal="";
        int counter=0;
        for (int i = topLength-1; i >= 0; i--) {
            stringResult="";
            for (int k = 1; k <=counter ; k++) {
                stringResult=stringResult+'0';
            }
            for (int j = lowLength-1; j >=0 ; j--) {
                stringResult= (string11[i]=='1'&string22[j]=='1'? "1":"0")+stringResult;
            }
            stringResultFinal=summBinaryWithLoop_1(stringResultFinal,stringResult);
            counter++;
        }
        return stringResultFinal;
    }
    
    static void multiplyBinaryWithInteger_2(String string1, String string2) {
        int result = Math.multiplyExact(Integer.parseInt(string1, 2), Integer.parseInt(string2, 2));
        System.out.println(Integer.toBinaryString(result));
    }

    //todo: *dzielenie
    static void devideBinaryWithInteger(String string1, String string2) {
        int result = Integer.parseInt(string1, 2) / Integer.parseInt(string2, 2);
        System.out.println(Integer.toBinaryString(result));
    }
}

