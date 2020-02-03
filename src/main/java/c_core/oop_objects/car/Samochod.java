package c_core.oop_objects.car;

public class Samochod {
    double pojemnoscSilnika;
    String kolor;
    int rocznik;
    String marka;
    String model;

    public Samochod() {
        pojemnoscSilnika = -1;
        kolor = "Brak koloru";
        rocznik = 2000;
        marka = "Nie podano";
        model = "Nie podano";
    }

    public Samochod(String marka, String model) {
        this.model = model;
        this.marka = marka;
    }

    public Samochod(String marka, double pojemnoscSilnika, int rocznik) {
        this(pojemnoscSilnika, "Brak koloru", rocznik, marka, "Nie podano");
    }

    public Samochod(double pojemnoscSilnika, String kolor, int rocznik, String marka, String model) {
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pojemnosc silnika: ");
        sb.append(pojemnoscSilnika + "\n");
        sb.append("Kolor: ");
        sb.append(kolor + "\n");
        sb.append("Rocznik: ");
        sb.append(rocznik + "\n");
        sb.append("Marka: ");
        sb.append(marka + "\n");
        sb.append("Nazwa: ");
        sb.append(model + "\n");

        return sb.toString();
    }
}

class Main {

    public static void main(String[] args) {

        Samochod samochod1 = new Samochod();
        samochod1.kolor = "czerwony";
        samochod1.marka = "Audi";
        samochod1.model = "A3";
        samochod1.pojemnoscSilnika = 3000.0d;
        samochod1.rocznik = 2017;

        System.out.println(samochod1);
        System.out.println("========================");

        Samochod samochod2 = new Samochod("Audi", "A3");
        System.out.println(samochod2);

    }
}
