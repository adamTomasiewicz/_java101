package m_miniGames.MiniGameMain_2_cardGamePOKER_weronika;

public enum Figura {
    Dwojka(2), Trojka(3), czworka(4), Piatka(5), Szostka(6), Siodemka(7), Osemka(8), Dziewiatka(9), Dziesiatka(10), Walet(11), Dama(12), Krol(13), As(14);

    int value;

    Figura(int value) {
        this.value = value;
    }
}
