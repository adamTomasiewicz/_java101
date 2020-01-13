package e_oop_firma.movable;

public class Krzeslo {
    private int id;
    private String color;

    public Krzeslo(int id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Krzeslo{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
