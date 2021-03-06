package c_core.oop_initialization.objects;

public class Truck {
    private String marka;
    private String model;
    private Integer maxymalneObciazenie;

    public Truck(String marka, String model, int maxymalneObciazenie) {
        this.marka = marka;
        this.model = model;
        this.maxymalneObciazenie = maxymalneObciazenie;
    }

    public Truck(Bus bus) {
        this(bus.getMarka(), bus.getModel(), 0);
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
}
