package e_oop__initialization.objects;

public class Bus {
    private String marka;
    private String model;
    private int iloscMiejsc;



    public Bus() {

    }

    public Bus(String marka, String model, int iloscMiejsc) {
        this.marka = marka;
        this.model = model;
        this.iloscMiejsc = iloscMiejsc;
    }

    public Bus(Truck truck) {
        this(truck.getMarka(), truck.getModel(), -1);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
}
