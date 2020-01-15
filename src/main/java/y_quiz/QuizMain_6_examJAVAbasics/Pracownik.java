package y_quizes.QuizMain_6_examJAVAbasics;

import java.util.ArrayList;
import java.util.List;

public class Pracownik implements AdministracjaPracownika {
    private int id;
    private String imie;
    private String nazwisko;
    private String pesel;
    private int zarobek;
    private Dzial dzial;
    private String specjalizacja; // ??
    static List<Pracownik> listaWszystkichPracownikow = new ArrayList<>();
private static int counter = 0;
    public Pracownik(String imie, String nazwisko, String pesel, int zarobek) {

        this.id = ++counter;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.zarobek = zarobek;
        addToListaWszystkichPracownikow(this);
    }

    public static void addToListaWszystkichPracownikow (Pracownik pracownik) {
        listaWszystkichPracownikow.add(pracownik);
    }
    public static void removeFromListaWszystkichPracownikow(Pracownik pracownik) {
        getListaWszystkichPracownikow().remove(pracownik);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getZarobek() {
        return zarobek;
    }

    public void setZarobek(int zarobek) {
        this.zarobek = zarobek;
    }

    public Dzial getDzial() {
        return this.dzial;
    }

    public void setDzial(Dzial dzial) {
        this.dzial = dzial;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public static List<Pracownik> getListaWszystkichPracownikow () {
        return listaWszystkichPracownikow;
    }

//todo: metody interfejsu

    @Override
    public int getZarobkiPracownika_Miesieczne() {
        return this.getZarobek();
    }

    @Override
    public int getZarobkiPracownika_Roczne() {
        return this.getZarobek()*12;
    }


    @Override
    public String toString() {
        return "Pracownik{" +
                "id=<" + getId() + '>' +
                ", imie=<" + getImie() + '>' +
                ", nazwisko=<" + getNazwisko() + '>' +
                ", pesel=<" + getPesel() + '>' +
                ", zarobek=<" + getZarobek() +'>'+
                ", dzial=<" + ((getDzial() != null)?getDzial().getClass():"brak")+'>' +
                '}';
    }
}

class PracownikDyrektor extends Pracownik{
    private int premiaMiesieczna;
    private int premiaRoczna;


    public PracownikDyrektor(Pracownik pracownik, int premiaMiesieczna, int premiaRoczna) {
        super(pracownik.getImie(), pracownik.getNazwisko(), pracownik.getPesel(), pracownik.getZarobek());
        this.setDzial(pracownik.getDzial());
        this.premiaMiesieczna = premiaMiesieczna;
        this.premiaRoczna = premiaRoczna;
       removeFromListaWszystkichPracownikow(pracownik);
       addToListaWszystkichPracownikow(this);
    }

    @Override
    public int getZarobkiPracownika_Roczne() {
        return this.getZarobek()*12+this.premiaMiesieczna*12+this.premiaRoczna;
    }

    @Override
    public String toString() {
        return "PracownikKierownik{" +
                "id=<" + getId() + '>' +
                ", imie=<" + getImie() + '>' +
                ", nazwisko=<" + getNazwisko() + '>' +
                ", pesel=<" + getPesel() + '>' +
                ", zarobek=<" + getZarobek() +'>'+
                ", dzial=<" + ((getDzial() != null)?getDzial().getClass():"brak")+'>' +
                ", premiaMiesieczna=<" + getPremiaMiesieczna()+'>'+
                ", premiaRoczna=<" + getPremiaRoczna() +'>'+
                '}';
    }
    public int getPremiaMiesieczna() {
        return premiaMiesieczna;
    }

    public int getPremiaRoczna() {
        return premiaRoczna;
    }
}
class PracownikKierownik extends Pracownik {
    private int premiaMiesieczna;
    private int premiaRoczna;

    public PracownikKierownik(Pracownik pracownik, int premiaMiesieczna, int premiaRoczna) {
        super(pracownik.getImie(), pracownik.getNazwisko(), pracownik.getPesel(), pracownik.getZarobek());
        this.setDzial(pracownik.getDzial());
        this.premiaMiesieczna = premiaMiesieczna;
        this.premiaRoczna = premiaRoczna;
        removeFromListaWszystkichPracownikow(pracownik);
        addToListaWszystkichPracownikow(this);
    }
    @Override
    public int getZarobkiPracownika_Roczne() {
        return this.getZarobek()*12+this.premiaMiesieczna*12+this.premiaRoczna;
    }

    @Override
    public String toString() {
        return "PracownikKierownik{" +
                "id=<" + getId() + '>' +
                ", imie=<" + getImie() + '>' +
                ", nazwisko=<" + getNazwisko() + '>' +
                ", pesel=<" + getPesel() + '>' +
                ", zarobek=<" + getZarobek() +'>'+
                ", dzial=<" + ((getDzial() != null)?getDzial().getClass():"brak")+'>' +
                ", premiaMiesieczna=<" + getPremiaMiesieczna()+'>'+
                ", premiaRoczna=<" + getPremiaRoczna() +'>'+
                '}';
    }

    public int getPremiaMiesieczna() {
        return premiaMiesieczna;
    }

    public int getPremiaRoczna() {
        return premiaRoczna;
    }
}



