package c_core.restaurant.posilki;

import o_objectOP.restaurant.Customizable;
import o_objectOP.restaurant.skladniki.Mieso;
import o_objectOP.restaurant.skladniki.Warzywa;

public class Sniadanie extends Posilek implements Customizable {

    private Mieso[] miesos = new Mieso[1];
    private Warzywa[] warzywas = new Warzywa[2];
    //   private Dodatki[] dodatkis = new Dodatki[2];


    public Mieso[] getMiesos() {
        return miesos;
    }

    public Warzywa[] getWarzywas() {
        return warzywas;
    }

//   public Dodatki[] getDodatkis() {
//        return dodatkis;
//    }

    @Override
    public void dodajMieso(Mieso mieso) {
        for (int i = 0; i < miesos.length; i++) {
            if (miesos[i] == null) {
                miesos[i] = mieso;
            }
        }
    }

    @Override
    public void dodajWarzywa(Warzywa warzywa) {
        for (int i = 0; i < warzywas.length; i++) {
            if (warzywas[i] == null) warzywas[i] = warzywa;
        }
    }

//    @Override
//    public void dodajDodatki(Dodatki dodatki) {
//        for (int i = 0; i <dodatkis.length ; i++) {
//            if(dodatkis[i]==null)dodatkis[i]=dodatki;
//        }
//    }

//    @Override
//    public String toString() {
//        return "Sniadanie{" +
//                "miesos=" + Arrays.toString(miesos) +
//                ", warzywas=" + Arrays.toString(warzywas) +
//                ", dodatkis=" + Arrays.toString(dodatkis) +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Sniadanie sniadanie1 = new Sniadanie();
//        sniadanie1.dodajMieso(new Kurczak(40));
//        sniadanie1.dodajWarzywa(new ZPora("biala"));
//        sniadanie1.dodajDodatki(new WarzywaFrytki());
//
//        Sniadanie sniadanie2 = new Sniadanie();
//        sniadanie2.dodajMieso(new Kurczak(40));
//        sniadanie2.dodajWarzywa(new ZPora("biala"));
//        sniadanie2.dodajDodatki(new WarzywaFrytki());
//
//        System.out.println(sniadanie1);
//        System.out.println(sniadanie2);
//    }
}
