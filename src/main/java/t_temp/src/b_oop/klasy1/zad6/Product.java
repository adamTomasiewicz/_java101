package pl.adamTomasiewicz.b_akademia.b_oop.klasy1.zad6;

public class Product {
    static int counter = 1;
    private int produktID;
    private String nazwa;
    private Category category;


    public Product(String nazwa, Category category) {
        this.produktID = counter++;
        this.nazwa = nazwa;
        this.category = category;
    }

    public void setProduktID(Integer produktID) {
        this.produktID = produktID;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getProduktID() {
        return produktID;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Category getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "{"+"produktID: " + produktID +
                ", nazwa: '" + nazwa + '\'' +
                ", kategoria: " + category +"}";
    }
}