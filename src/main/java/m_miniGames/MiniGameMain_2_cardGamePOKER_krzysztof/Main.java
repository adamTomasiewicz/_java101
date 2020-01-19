package m_miniGames.MiniGameMain_2_cardGamePOKER_krzysztof;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Karta> talia = new ArrayList<>();
        for (Kolor k : Kolor.values())
            for (Figura f : Figura.values())
                talia.add(new Karta(f, k));

        int prob = 0;
        while (true) {
            List<Karta> ukladKart = new ArrayList<>();
            while (ukladKart.size() < 5) {
                Karta karta = talia.get(RandomNum());
                if (!ukladKart.contains(karta)) ;
                ukladKart.add(karta);
            }
            Karta[] ukladKartArr = ukladKart.stream().toArray(Karta[]::new);
            Uklad u = jakiUklad(ukladKartArr);
            System.out.println("Proba nr. " + prob++ + "  " + u);
            if (u.equals(Uklad.POKER_KROLEWSKI)) {
                System.out.println(Arrays.toString(ukladKartArr));
                break;
            }
        }
    }


    public static int RandomNum() {
        Random random = new Random();
        return random.nextInt(52);
    }


    public static Uklad jakiUklad(Karta[] uklad) {

        Arrays.sort(uklad);
//        for (Karta karta : uklad)
//            System.out.println(karta);

        boolean theSameColors = true;
        int diffrentsCards = 0;
        int power = uklad[4].figura.wartoscFigury;
        int NumfirstCard = uklad[0].figura.wartoscFigury;
        int NumLastCard = uklad[4].figura.wartoscFigury;
        boolean trojka = false;
        int strit = 0;

        for (int i = 0; i < uklad.length - 1; i++) {
            Figura card = uklad[i].figura;
            Kolor color = uklad[i].kolor;
            Figura nextCard = uklad[i + 1].figura;
            Kolor nextColor = uklad[i + 1].kolor;
            power = power + uklad[i].figura.wartoscFigury;

            //Checking attributes
            if (!card.equals(nextCard))
                diffrentsCards++;
            if (!color.equals(nextColor))
                theSameColors = false;
            if (card.equals(nextCard) && i != 0)
                if (card.equals(uklad[i - 1].figura))
                    trojka = true;
            if (card.wartoscFigury + 1 == nextCard.wartoscFigury)
                strit++;

        }


        //Layout Card
        if (theSameColors) {
            if (strit == 4 && uklad[0].figura.wartoscFigury == 10)
                return Uklad.POKER_KROLEWSKI;
            else if (strit == 4 && uklad[4].figura.wartoscFigury - uklad[0].figura.wartoscFigury == 4)
                return Uklad.POKER;
            else
                return Uklad.KOLOR;
        } else if (diffrentsCards == 1)
            if (NumfirstCard != uklad[1].figura.wartoscFigury || NumLastCard != uklad[3].figura.wartoscFigury)
                return Uklad.KARETA;
            else
                return Uklad.FULL;
        else if (strit == 4 && uklad[4].figura.wartoscFigury - uklad[0].figura.wartoscFigury == 4)
            return Uklad.STRIT;
        else if (diffrentsCards == 2) {
            if (trojka)
                return Uklad.TROJKA;
            else
                return Uklad.DWIE_PARY;
        } else if (diffrentsCards == 3)
            return Uklad.PARA;
        else
            return Uklad.WYSOKA_KARTA;


    }


}

class Karta implements Comparable<Karta> {
    Figura figura;
    Kolor kolor;

    public Karta(Figura figura, Kolor kolor) {
        this.figura = figura;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "\nKarta [figura=" + figura + ", kolor=" + kolor + "]";
    }

    @Override
    public int compareTo(Karta k) {
        return this.figura.wartoscFigury - k.figura.wartoscFigury;
    }
}

