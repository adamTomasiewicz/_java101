package g_games.GamesMain_2_cardGamePOKER;

public enum Color {
    PIK(1), TREFL(2), KARO(3), KIER(4);
    int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
