package m_miniGames.MiniGameMain_2_cardGamePOKER_krzysztof;

import org.junit.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


public class MainTest_krzysztof {

//todo  POKER_KROLEWSKI(10), POKER(9), KARETA(8), FULL(7), KOLOR(6), STRIT(5), TROJKA(4), DWIE_PARY(3), PARA(2), WYSOKA_KARTA(1),
        //test testow
        @Test
        public void test0_test() {
            Assert.assertTrue(Uklad.FULL.equals(Uklad.FULL));
        }
        //test1_POKER_KROLEWSKI
        @Test
        public void test1_POKER_KROLEWSKI() {
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.AS, Kolor.KARO),
                    new Karta(Figura.KROL, Kolor.KARO),
                    new Karta(Figura.DAMA, Kolor.KARO),
                    new Karta(Figura.WALET, Kolor.KARO),
                    new Karta(Figura.DZIESIATKA, Kolor.KARO)));
               
            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);
            
            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.POKER_KROLEWSKI));
        }
        //2 POKER(9)
        @Test
        public void test2_POKER(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                    new Karta(Figura.KROL, Kolor.KARO),
                    new Karta(Figura.DAMA, Kolor.KARO),
                    new Karta(Figura.WALET, Kolor.KARO),
                    new Karta(Figura.DZIESIATKA, Kolor.KARO)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.POKER));
        }

        @Test
        //3 KARETA(8),
        public void test3_KARETA(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.CZWORKA, Kolor.KIER),
                    new Karta(Figura.CZWORKA, Kolor.KARO),
                    new Karta(Figura.CZWORKA, Kolor.TREFL),
                    new Karta(Figura.CZWORKA, Kolor.PIK),
                    new Karta(Figura.DZIESIATKA, Kolor.KARO)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.KARETA));
        }

        @Test
        //4 FULL(7),
        public void test4_FULL(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.KROL, Kolor.KIER),
                    new Karta(Figura.KROL, Kolor.KARO),
                    new Karta(Figura.KROL, Kolor.TREFL),
                    new Karta(Figura.WALET, Kolor.KARO),
                    new Karta(Figura.WALET, Kolor.KIER)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.FULL));
        }
        @Test
        //5 KOLOR(6),
        public void test5_KOLOR(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.AS, Kolor.KARO),
                    new Karta(Figura.KROL, Kolor.KARO),
                    new Karta(Figura.PIATKA, Kolor.KARO),
                    new Karta(Figura.TROJKA, Kolor.KARO),
                    new Karta(Figura.SZOSTKA, Kolor.KARO)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.KOLOR));
        }
        @Test
        //6 STRIT(5),
        public void test6_STRIT(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.DWOJKA, Kolor.KARO),
                    new Karta(Figura.TROJKA, Kolor.KIER),
                    new Karta(Figura.CZWORKA, Kolor.KARO),
                    new Karta(Figura.PIATKA, Kolor.TREFL),
                    new Karta(Figura.SZOSTKA, Kolor.PIK)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.STRIT));
        }
        @Test
        //7 TROJKA(4),
        public void test7_TROJKA(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.PIATKA, Kolor.KARO),
                    new Karta(Figura.PIATKA, Kolor.KIER),
                    new Karta(Figura.WALET, Kolor.KARO),
                    new Karta(Figura.DAMA, Kolor.KARO),
                    new Karta(Figura.PIATKA, Kolor.PIK)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.TROJKA));
        }
        @Test
        //8 DWIE_PARY(3),
        public void test8_DWIE_PARY(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.AS, Kolor.KIER),
                    new Karta(Figura.PIATKA, Kolor.KARO),
                    new Karta(Figura.AS, Kolor.KARO),
                    new Karta(Figura.PIATKA, Kolor.KIER),
                    new Karta(Figura.DZIESIATKA, Kolor.KARO)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.DWIE_PARY));
        }
        @Test
        //9 PARA(2),
        public void test9_PARA(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.AS, Kolor.KARO),
                    new Karta(Figura.DAMA, Kolor.KARO),
                    new Karta(Figura.DAMA, Kolor.PIK),
                    new Karta(Figura.SZOSTKA, Kolor.KARO),
                    new Karta(Figura.DZIESIATKA, Kolor.KARO)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.PARA));
        }

    @Before
    //10 WYSOKA_KARTA(1),
    public void test1111_Before(){
        ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                new Karta(Figura.DWOJKA, Kolor.KARO),
                new Karta(Figura.KROL, Kolor.KIER),
                new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                new Karta(Figura.WALET, Kolor.TREFL),
                new Karta(Figura.DZIESIATKA, Kolor.PIK)));

        Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

        System.out.println("Before");
    }
        @Test
        //10 WYSOKA_KARTA(1),
        public void test10_HIGH_CARD(){
            ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                    new Karta(Figura.DWOJKA, Kolor.KARO),
                    new Karta(Figura.KROL, Kolor.KIER),
                    new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                    new Karta(Figura.WALET, Kolor.TREFL),
                    new Karta(Figura.DZIESIATKA, Kolor.PIK)));

            Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

            Assert.assertTrue(Main.jakiUklad(ukladKartArr).equals(Uklad.WYSOKA_KARTA));
        }
    @After
    //10 WYSOKA_KARTA(1),
    public void test1111_After(){
        ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                new Karta(Figura.DWOJKA, Kolor.KARO),
                new Karta(Figura.KROL, Kolor.KIER),
                new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                new Karta(Figura.WALET, Kolor.TREFL),
                new Karta(Figura.DZIESIATKA, Kolor.PIK)));

        Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

        System.out.println("After");
    }

    @BeforeClass
    //10 WYSOKA_KARTA(1),
    public void test1111_BeforeClass(){
        ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                new Karta(Figura.DWOJKA, Kolor.KARO),
                new Karta(Figura.KROL, Kolor.KIER),
                new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                new Karta(Figura.WALET, Kolor.TREFL),
                new Karta(Figura.DZIESIATKA, Kolor.PIK)));

        Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

        System.out.println("BeforeClass");
    }
    @AfterClass
    //10 WYSOKA_KARTA(1),
    public void test1111_AfterClass(){
        ArrayList<Karta> ukladKart = new ArrayList<Karta>(Arrays.asList(
                new Karta(Figura.DWOJKA, Kolor.KARO),
                new Karta(Figura.KROL, Kolor.KIER),
                new Karta(Figura.DZIEWIATKA, Kolor.KARO),
                new Karta(Figura.WALET, Kolor.TREFL),
                new Karta(Figura.DZIESIATKA, Kolor.PIK)));

        Karta []ukladKartArr = ukladKart.stream().toArray(Karta[]::new);

        System.out.println("AfterClass");
    }


    }


