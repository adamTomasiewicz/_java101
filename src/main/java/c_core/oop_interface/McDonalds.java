package c_core.oop_interface;

public class McDonalds implements BurgerProvider, Restaurants {

    @Override
    public void getBurger() {
        System.out.println("McDonalds: klasyczny BigMac!");
    }


    @Override
    public void getMenu() {
        System.out.println("McDonalds menu");
    }
}
