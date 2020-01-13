package e_oop_interface;

public class Wendys implements BurgerProvider, Restaurants {

    @Override
    public void getBurger() {
        System.out.println("Wendys: burger ze swierzej, niemrozonej wolowiny!");
    }

    @Override
    public void getMenu() {
        System.out.println("Wendys menu");
    }
}
