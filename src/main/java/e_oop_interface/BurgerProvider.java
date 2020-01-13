package e_oop_interface;

public interface BurgerProvider {
    void getBurger();

    default String getClassName() {
        return this.getClass().getSimpleName();
    }
}
