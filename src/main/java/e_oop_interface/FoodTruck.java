package e_oop_interface;

public class FoodTruck implements BurgerProvider {


    @Override
    public void getBurger() {
        System.out.println(getClassName());
        System.out.println("FoodTruck: oryginalny burger ze swiezych skladnikow!");
    }
}
