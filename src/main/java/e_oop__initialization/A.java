package e_oop__initialization;

public class A {
    private B b;
    private C c = new C();

    public A () {
        System.out.println("Konstruktor A");
        b=new B();
        System.out.println("Koniec konstruktora A");
    }
}
