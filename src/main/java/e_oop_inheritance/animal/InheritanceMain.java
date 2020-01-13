package e_oop_inheritance.animal;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
       // Animal andrzej = new Animal("andrzej");
        Dog andrzej = new Dog("andrzej", true);
    andrzej.makeNoise();
        System.out.println(andrzej.getName());
        List<Animal> listAnimal=new ArrayList<>();
        listAnimal.add(andrzej);
        listAnimal.add(new Mutt("bandzior", false));
        listAnimal.add(new Cow("byku"));
        listAnimal.add(new Cat("klakier"));
        for (Animal animal : listAnimal) {
            animal.makeNoise();
            System.out.println(animal.getName()+" ");
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("--------");
        }



    }
}
