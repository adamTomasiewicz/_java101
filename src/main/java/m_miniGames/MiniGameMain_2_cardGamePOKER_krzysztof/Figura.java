package m_miniGames.MiniGameMain_2_cardGamePOKER_krzysztof;

public enum Figura {

    DWOJKA(2),TROJKA(3),CZWORKA(4),PIATKA(5),
    SZOSTKA(6),SIODEMKA(7),OSEMKA(8),DZIEWIATKA(9),
    DZIESIATKA(10),WALET(11),DAMA(12),KROL(13),AS(14);

    int wartoscFigury;

    Figura(int i) {
        this.wartoscFigury = i;
    }
}
