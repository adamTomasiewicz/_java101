package c_core.company.movable;

public class Tablica {
    private int id;
    private String color;

    public Tablica(int id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablica{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
