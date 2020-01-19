package m_miniGames.MiniGameMain_2_cardGamePOKER_krzysztof;

public enum Uklad {

    WYSOKA_KARTA(1), PARA(2),
    DWIE_PARY(3), TROJKA(4),
    STRIT(5), KOLOR(6),
    FULL(7), KARETA(8),
    POKER(9), POKER_KROLEWSKI(10);

    int stopienUkladu;

    Uklad(int stopienUkladu) {

        this.stopienUkladu = stopienUkladu;
    }
}
