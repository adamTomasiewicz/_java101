package m_miniGames.MiniGameMain_5_hungerStrike;

public enum Dish {
    ICE_CREAM(8),
    GYROS(12),
    TORTILLA(13),
    PIZZA(18),
    STEAK(30);
    private int price;

    Dish(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
