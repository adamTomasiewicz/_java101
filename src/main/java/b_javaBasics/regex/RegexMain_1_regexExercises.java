package b_javaBasics.regex;


import org.junit.Test;

import java.util.regex.Pattern;

public class RegexMain_1_regexExercises {

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
