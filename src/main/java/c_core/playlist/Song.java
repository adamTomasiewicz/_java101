package c_core.playlist;

public class Song extends Media {
    private String name;
    private double lenght;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", lenght=" + lenght +
                '}';
    }

    @Override
    public void play(String playtype) {
        System.out.println(this.name);
    }
}
