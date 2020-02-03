package pl.adamTomasiewicz.b_akademia.b_oop.klasy1.zad6;

public class Produkt2 {
    private Integer produktID;
    private String nazwa;
    private Category kategoria;

    public Produkt2(Integer produktID, String nazwa, Category kategoria) {
        this.produktID = produktID;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
    }

    public void setProduktID(Integer produktID) {
        this.produktID = produktID;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "ID=" + produktID +
                ", nazwa='" + nazwa + '\'' +
                ", " + kategoria +
                '}';
    }
}
