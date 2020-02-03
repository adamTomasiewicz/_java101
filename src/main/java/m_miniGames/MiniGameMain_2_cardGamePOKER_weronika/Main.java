package m_miniGames.MiniGameMain_2_cardGamePOKER_weronika;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karta> talia = new ArrayList<Karta>();
        ArrayList<Karta> listaKart = new ArrayList<Karta>();
        ArrayList<Karta> listaKart1 = new ArrayList<Karta>();

        for (Kolor k : Kolor.values())
            for (Figura f : Figura.values())
                talia.add(new Karta(f, k));


        for (int i = 0; i < 5; i++)
            listaKart.add(talia.get((int) (Math.random() * 52)));

        System.out.println(listaKart);
        System.out.println(ukladyPokera(listaKart));


//inny sposob sprawdzic, ma byc Royal flush)
//	  listaKart1.add(new Karta(Figura.As, Kolor.KARO));
//        listaKart1.add(new Karta(Figura.Krol, Kolor.KARO));
//        listaKart1.add(new Karta(Figura.Dama, Kolor.KARO));
//        listaKart1.add(new Karta(Figura.Walet, Kolor.KARO));
//        listaKart1.add(new Karta(Figura.Dziesiatka, Kolor.KARO));
//
//        System.out.println(ukladyPokera(listaKart1));


    }

    public static Uklady ukladyPokera(ArrayList<Karta> listaKart) {
        Collections.sort(listaKart);

        int iloscRoznychFigur = 1;
        int iloscRoznychKolorow = 1;
        int czyJestTrojka = 0;

        for (int i = 1; i < listaKart.size(); i++) {
            if (listaKart.get(i).figura != listaKart.get(i - 1).figura)
                iloscRoznychFigur++;

            if (listaKart.get(i).kolor != listaKart.get(i - 1).kolor)
                iloscRoznychKolorow++;

            if (listaKart.get(i).figura == listaKart.get(i - 1).figura && i < 4)
                if (listaKart.get(i).figura == listaKart.get(i + 1).figura)
                    czyJestTrojka++;
        }

        if (iloscRoznychFigur == 5 && iloscRoznychKolorow == 1)
            if (listaKart.get(0).figura.value == 10)
                return Uklady.ROJAL_FLUSH;
            else if (listaKart.get(4).figura.value - listaKart.get(0).figura.value == 4)
                return Uklady.STRAIGHT_FLUSH;
            else
                return Uklady.KOLOR;

        else if (iloscRoznychFigur == 5 && iloscRoznychKolorow > 1 && listaKart.get(4).figura.value - listaKart.get(0).figura.value == 4)
            return Uklady.STRIT;

        else if (iloscRoznychFigur == 2)
            if (listaKart.get(0).figura.value != listaKart.get(1).figura.value)
                return Uklady.KARETA;
            else
                return Uklady.FULL;

        else if (iloscRoznychFigur == 4)
            return Uklady.PARA;

        else if (iloscRoznychFigur == 3)
            if (czyJestTrojka == 1)
                return Uklady.TROJKA;
            else
                return Uklady.DWIE_PARY;

        return Uklady.HIGH_CARD;

    }

}