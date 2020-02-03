package m_miniGames.MiniGameMain_2_cardGamePOKER_weronika;

public class Karta implements Comparable<Karta> {
    Figura figura;
    Kolor kolor;

    public Karta(Figura figura, Kolor kolor) {
        this.figura = figura;
        this.kolor = kolor;
    }


    @Override
    public String toString() {
        return "Karta [figura=" + figura + ", kolor=" + kolor + "]";
    }


    @Override
    public int compareTo(Karta o) {
        if (this.figura.value > o.figura.value)
            return 1;
        else if (this.figura.value < o.figura.value)
            return -1;
        return 0;
    }
}
