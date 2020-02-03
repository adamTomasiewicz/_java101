package b_javaBasics.regex;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain_1_regexLearning {

    @Test
    public void testRegex1() {
        String string1 = "Hi, my name is Adam and i want to fly ";
        //pattern ma zestaw metod do porownywania na rózne sposoby
        Pattern patter1 = Pattern.compile("Adam");
        //matcher ma zestaw metod do porownywania
        Matcher matcher1 = patter1.matcher(string1);
        Assert.assertTrue(matcher1.find()); //czy kawalek pasuje
        Assert.assertFalse(matcher1.matches()); //czy calość sie zgadza
    }

    @Test
    public void testRegex2() {
        ////////////////////////
        // special symbol "/" //
        ////////////////////////
        //1 \+3 \-5 = \-1
        int a = 1 + 2 + 5 - 1;
        String b = "1+\t3-5 \t\n";
        String c = "1+\\t3-\\n5";
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void testRegex3() {
        ////////////////////////
        // special symbol "?" //
        ////////////////////////
        String[] elements = {"Jakub", "kub", "Jaub", "uba", "ub", "Marcin"};
        String regex = "Jak?ub";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex4() {
        ////////////////////////
        // special symbol "*" //
        ////////////////////////
        String[] elements = {"kotttek", "koek", "kotek", "uba", "ub", "Marcin"};
        String regex = "kot*ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex5() {
        ////////////////////////
        // special symbol "+" //
        ////////////////////////
        String[] elements = {"kotttek", "koek", "kotek", "uba", "ub", "Marcin"};
        String regex = "kot+ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex6() {
        ////////////////////////
        // special symbol "{x}" // musi wystapic x razy
        // special symbol "{x,}" // musi wystapic x lub wiecej razy
        // special symbol "{x,y}" // musi wystapic od x do y razy
        ////////////////////////
        String[] elements = {"kotttttek", "koek", "kotek", "kotttek", "ub", "Marcin"};
        String regex = "kot{3,}ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex7() {
        ////////////////////////
        // special symbol "." // dowolny symbol, wildcard
        ////////////////////////
        String[] elements = {"kotttek", "koek", "kotek", "uba", "ub", "Marcin"};
        String regex = "ko.*ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex8() {
        ////////////////////////
        // klasy wyrazen regularnych "[]" //
        ////////////////////////
        String[] elements = {"kotttek", "kociołek", "poniedziałek", "uba", "motorek", "Tyłek"};
        String regex = ".*[tł]ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex9() {
        ////////////////////////////////////
        // klasy wyrazen regularnych z tabeli ASCII "[A-Za-z0-9]" "[!-z]'//
        ////////////////////////////////////
        String[] elements = {"tek", "4ek", "poniedziałek", "#ek", "motorek", "Tyłek"};
        String regex = "[!-z]ek";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void testRegex10() {
        ////////////////////////////////////
        // klasy wyrazen regularnych "[A-Za-z0-9]" //
        ////////////////////////////////////
        String[] elements = {"1km", "2m", "3cm", "4mm", "5kkm"};
        String regex = "[0-5].+[a-m]";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }


    @Test
    public void testRegex13() {
        ////////////////////
        // operatory ///////
        ////////////////////
        /**
         * d dowolna cyfra
         * D dowolny znak niebedocy cyfra
         * w dowolny znak słowa
         * W dowolny znak niebedocy znakiem słowa
         * s znak whitespace
         * S dowolny znak niebedocy whitespace
         **/

        String[] elements = {"kasztanowa 45", "45 kasztanowa", "dowolna 23b", "warszawska 124", "jana sobieskiego 30", "zadymiona 666"};
        String regex = "([\\w]+|[\\w]+\\s[\\w]+)\\s+\\d+['\\w]";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void exeRegex1imie() {
        // walidacja imienia:
        //imie z duzej litery
        //brak cyfr i znakow specjalnych

        ////////////////////////////////////
        // klasy wyrazen regularnych "[A-Za-z0-9]" //
        ////////////////////////////////////
        String[] elements = {"Adam", "marek", "Marzena", "halinka", "5kkm", "Ala", "To"};
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void exeRegex2surname() {
        //walidacja nazwiska:
        //z duzej litery
        //brak cyfr i znakow specjalnych
        //mozliwe dwa czlony oddzielone minusem

        String[] elements = {"kowalska milosz", "kowalska-milosz", "Kowalska-milosz", "Milosz-Kowalska", "Maria-Rokita", "Halinka", "5kkm", "Ala", "To"};
        String regex = "([a-zA-Z]{2,})(['\\s-][a-zA-Z]{2,})*";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void exeRegex3phoneNumber() {
        //walidacja nazwiska:
        //z duzej litery
        //brak cyfr i znakow specjalnych
        //mozliwe dwa czlony oddzielone minusem

        String[] elements = {"654-546-645", "+48-654-546-645", "+48654546645", "To"};
        String regex = "((\\d{3}-?){3}|\\+?[48]{2}-?(\\d{3}-?){3})";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }

    @Test
    public void exeRegex4email() {
        // https://emailregex.com/
        //walidacja nazwiska:
        //z duzej litery
        //brak cyfr i znakow specjalnych
        //mozliwe dwa czlony oddzielone minusem

        String[] elements = {"kowalska milosz", "kowalska-milosz", "Kowalska-milosz", "Milosz-Kowalska", "Maria-Rokita", "Halinka", "5kkm", "Ala", "To"};
        String regex = "([a-zA-Z]{2,})(['\\s-][a-zA-Z]{2,})*";
        Pattern pattern1 = Pattern.compile(regex);
        for (String element : elements) {
            System.out.println("Element: \"" + element + "\" fits: " + pattern1.matcher(element).matches());
        }
    }
}
