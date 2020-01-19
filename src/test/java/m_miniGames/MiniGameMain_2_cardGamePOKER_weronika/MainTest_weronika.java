package m_miniGames.MiniGameMain_2_cardGamePOKER_weronika;



import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static m_miniGames.MiniGameMain_2_cardGamePOKER_weronika.Kolor.*;

public class MainTest_weronika {

//todo  ROJAL_FLUSH, STRAIGHT_FLUSH, KARETA, FULL, KOLOR, STRIT, TROJKA, DWIE_PARY, PARA, HIGH_CARD;

    //test
    @Test
public void test0() {
        Assert.assertTrue(Uklady.KARETA.equals(Uklady.KARETA));
    }
    //1 ROJAL_FLUSH,
    @Test
    public void test_1_ROJAL_FLUSH() {
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.As, KARO),
                new Karta(Figura.Krol, KARO),
                new Karta(Figura.Dama, KARO),
                new Karta(Figura.Walet, KARO),
                new Karta(Figura.Dziesiatka, KARO)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.ROJAL_FLUSH));
    }
    //2 STRAIGHT_FLUSH
    @Test
    public void test_2_STRAIGHT_FLUSH(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Dziesiatka, Kolor.KARO),
                new Karta(Figura.Dziewiatka, KARO),
                new Karta(Figura.Osemka, KARO),
                new Karta(Figura.Siodemka, KARO),
                new Karta(Figura.Szostka, KARO)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.STRAIGHT_FLUSH));
    }

    @Test
    //3 kareta
            public void test_3_kareta(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Trojka, Kolor.KARO),
                new Karta(Figura.Trojka, Kolor.TREFL),
                new Karta(Figura.Trojka, Kolor.PIK),
                new Karta(Figura.czworka, Kolor.KIER),
                new Karta(Figura.Trojka, KIER)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.KARETA));
    }

    @Test
    //4 FULL,
    public void test_4_FULL(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Dama, Kolor.KARO),
                new Karta(Figura.Dama, Kolor.TREFL),
                new Karta(Figura.Dziesiatka, Kolor.PIK),
                new Karta(Figura.Dziesiatka, Kolor.KIER),
                new Karta(Figura.Dziesiatka, KARO)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.FULL));
    }
    @Test
    //5 KOLOR
    public void test_5_KOLOR(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Dama, TREFL),
                new Karta(Figura.Krol, TREFL),
                new Karta(Figura.Dziesiatka, TREFL),
                new Karta(Figura.Piatka, TREFL),
                new Karta(Figura.Dwojka, TREFL)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.KOLOR));
    }
    @Test
    //6 STRIT,
    public void test_6_STRIT(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Dama, TREFL),
                new Karta(Figura.Walet, KARO),
                new Karta(Figura.Dziesiatka, KIER),
                new Karta(Figura.Dziewiatka, TREFL),
                new Karta(Figura.Osemka, PIK)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.STRIT));
    }
    @Test
    //7 TROJKA,
    public void test_7_TROJKA(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Dama, TREFL),
                new Karta(Figura.Walet, KARO),
                new Karta(Figura.Walet, KIER),
                new Karta(Figura.Walet, TREFL),
                new Karta(Figura.Osemka, PIK)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.TROJKA));
    }
    @Test
    //8 DWIE_PARY,
    public void test_8_DWIE_PARY(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Szostka, TREFL),
                new Karta(Figura.Szostka, KARO),
                new Karta(Figura.Walet, KIER),
                new Karta(Figura.Walet, TREFL),
                new Karta(Figura.Osemka, PIK)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.DWIE_PARY));
    }
    @Test
    //9 PARA
    public void test_9_PARA(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Szostka, TREFL),
                new Karta(Figura.Szostka, KARO),
                new Karta(Figura.Walet, KIER),
                new Karta(Figura.Dwojka, TREFL),
                new Karta(Figura.Osemka, PIK)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.PARA));
    }

    @Test
    //10 HIGH_CARD
    public void test_10_HIGH_CARD(){
        ArrayList<Karta> arrayListKart1 = new ArrayList<>(Arrays.asList(
                new Karta(Figura.Walet, TREFL),
                new Karta(Figura.Szostka, KARO),
                new Karta(Figura.Piatka, KIER),
                new Karta(Figura.Dama, TREFL),
                new Karta(Figura.Osemka, PIK)));
        Assert.assertTrue(Main.ukladyPokera(arrayListKart1).equals(Uklady.HIGH_CARD));
    }



}
