package z_homeworks;

//todo: 25.11.2019 kalkulacja pomiędzy dowolnymi systemami (bin, oct, dec, hex) -> implementacja 5 wybranych
class HomeworkMain_1_numeralSystems {


    //todo: exe 1 bin to oct


    //todo: exe 2 bin to dec
/*    public static void main(String[] args) {
        System.out.println("start");
      System.out.println(convertBinaryToDecimal("10001"));
    }
    static int convertBinaryToDecimal (String string) {
        int sum = 0;
        int power = 1;
        for (int i = string.length()-1; i >=0 ; i--) {
            sum= sum+ Integer.parseInt(String.valueOf(string.charAt(i))) *power;
            power*=2;
        }
        return sum;}*/

    //todo: exe 3 bin to hex
/*    public static void main(String[] args) {
            System.out.println("start");

            System.out.println(convertBinaryToHexadecimal("10001"));
    }
    static String convertBinaryToHexadecimal (String string) {
        int sum = 0;
        int power = 1;
        for (int i = string.length()-1; i >=0 ; i--) {
            sum= sum+ Integer.parseInt(String.valueOf(string.charAt(i))) *power;
            power*=2;
        }
        return sum;
    }*/

    //todo: exe 4 dec to bin
/*    public static void main(String[] args) {
        System.out.println(1/2);
        convertDecimalToBinary(67);
    }
    public static void convertDecimalToBinary(int num){
        int array[] = new int[32];
        int index = 0;
        while(num > 0){
            array[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(array[i]);
        }
    }*/
    //todo: exe 5 dec to hex
/*    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3}};
        System.out.println(convertDecToHex(1697));
    }
    public static String convertDecToHex(int decimal) {
        String string1 = "";
        int index;
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            index = decimal % 16;
            string1 = hex[index] + string1;
            decimal = decimal / 16;
        }
       return string1;
    }*/
    //todo: exe 6 hex to dec https://makeinjava.com/convert-hexadecimal-decimal-java-api-iterative-recursive/

  /*  private static int toHexUsingParseInt(String number) {
        return Integer.parseInt(number, 16);
    }*/
}
