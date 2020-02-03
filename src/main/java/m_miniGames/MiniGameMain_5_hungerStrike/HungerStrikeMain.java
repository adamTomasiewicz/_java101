package m_miniGames.MiniGameMain_5_hungerStrike;

public class HungerStrikeMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(10);
        // HungryCrowd hungryCrowd = new HungryCrowd(((dish, timesOrdered) -> restaurant.order(dish, timesOrdered)));
        HungryCrowd hungryCrowd = new HungryCrowd((restaurant::order));
        restaurant.startCooking();
        hungryCrowd.startOrdering();
    }
}