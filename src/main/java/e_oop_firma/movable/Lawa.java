package e_oop_firma.movable;

public class Lawa {
    private int id;
    private String color;

    public Lawa(int id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lawa{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
