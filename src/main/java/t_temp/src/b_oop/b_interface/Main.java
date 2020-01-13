package pl.adamTomasiewicz.b_akademia.b_oop.b_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private Voiceable voiceable;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Bulldog bulldog1 = new Bulldog();

        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();


        List<Voiceable> listVoiceable = new ArrayList<>(Arrays.asList(dog1,dog2, rabbit1, rabbit2));
        listVoiceable.add(dog3);

        for (Voiceable voiceable : listVoiceable) {
            if("dog".equalsIgnoreCase(voiceable.getClass().getSimpleName()))
            voiceable.getVoice();
        }
        System.out.println(bulldog1.weightKG);
        List<Animal> listAnimal = new ArrayList<>(Arrays.asList(dog1,dog2, new Salmon(), bulldog1, new Wolf(),new Owca()));
        for (Animal animal : listAnimal) {
            System.out.println(animal.getClass().getSimpleName());
            animal.nurish();
        }
        Animal animal1 =(Animal)dog1;
    }
}
