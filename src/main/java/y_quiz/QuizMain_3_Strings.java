package y_quizes;

public class QuizMain_3_Strings {
    public static void main(String[] args) {
        String s = "ccataaatcgcactaacgcttgtccgagtcgcatatgtgagttcaacagacattcgttgaacattg";
        System.out.println("start");
        methodName("tgaactatgataataagtttaggatacgcaaaatgttaaagctatgttccctagtga");
    }

    static void methodName (String s) {
        String t = s.toUpperCase();
        String u = "";
        for (int i = 3; i <s.length()+3 ; i++) {
            u=u+t.substring(i-3,i)+" ";
            i=i+2;
        }
        String v = "";
        for (int i = 0; i <u.length() ; i++) {
          if(u.charAt(i)=='A'){v=v+'T'; }
          if(u.charAt(i)=='T'){v=v+'A'; }
          if(u.charAt(i)=='C'){v=v+'G'; }
          if(u.charAt(i)=='G'){v=v+'C'; }
          if(u.charAt(i)==' '){v=v+' '; }
        }

        System.out.println(u);
        System.out.println(v);
    }


}
