package b_javaBasics._dataTypes_variables;


//THEORY
//dataTypes:


public class VariablesMain {
    public static void main(String[] args) {
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        // BigInteger - calkowite BigDecimal - zmiennoprzecinkowe
        System.out.println(byteMin + " : " + byteMax);
        System.out.println(shortMin + " : " + shortMax);
        System.out.println(intMin + " : " + intMax);
        System.out.println(longMin + " : " + longMax);
        System.out.println(doubleMin + " : " + doubleMax);
    }
}
