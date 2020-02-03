package c_core.oop_interface;

public class Main {
    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds();
        Wendys wendys = new Wendys();

        BurgerProvider[] burgerProviders1 = new BurgerProvider[]{new FoodTruck(), new McDonalds(), new Wendys()};
        Restaurants[] restaurants = new Restaurants[]{mcDonalds, wendys};

        FoodTruck foodTruck1 = (FoodTruck) burgerProviders1[0];
        for (BurgerProvider provider : burgerProviders1) {
            provider.getBurger();
        }
        for (Restaurants restaurant : restaurants) {
            restaurant.getMenu();
        }

    }
}

