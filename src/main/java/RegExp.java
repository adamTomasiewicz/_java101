import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    //THEORY
    public static void main(String[] args) {


    String s1 = "Ala mieszka przy ul. Marszalkowskiej 50 i ma 12 kotow w 2-pokojowym mieszkaniu";
    String regex1= "(ul)?(al)?\\.\\ \\w*\\ \\d{1,5}";

    String toReplace = "al. Jerozolimskich 100";
        System.out.println(s1.replaceAll(regex1, toReplace));

        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(s1);
        //matcher1.find();
        //matcher1.group();
        System.out.println(matcher1);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        long x = Long.MAX_VALUE;
        for (long i = x-5; i <x+5 ; i++) {
            System.out.println(matcher1.group());
        }
    }
}
