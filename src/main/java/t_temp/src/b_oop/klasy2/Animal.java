package pl.akademiakodu.classes_And_Objects;
import java.util.Random;

public class Animal {
    private String nameAnimal;
    private boolean isLoud;
    private String voice;

    public Animal(String nameAnimal, boolean isLoud, String voice) {
        this.nameAnimal = nameAnimal;
        this.isLoud = isLoud;
        this.voice = voice;
    }

    void speak(int times) {

        for (int i = 0; i < times; i++) {
            if (isLoud == true) {
                System.out.print(voice.toUpperCase() + " ");
                System.out.println();
            }
            if (isLoud == false) {
                System.out.print(voice.toLowerCase() + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Animal animal1 = new Animal("Big dog", true, "WOOF");
        int randomInt1 = randomGenerator.nextInt(5);
        Animal animal2 = new Animal("Cow", true, "MOO");
        int randomInt2 = randomGenerator.nextInt(5);
        Animal animal3 = new Animal("Small", false, "woof");
        int randomInt3 = randomGenerator.nextInt(5);
        Animal animal4 = new Animal("Frog", false, "croak");
        int randomInt4 = randomGenerator.nextInt(5);

        animal1.speak(randomInt1+1);
        animal2.speak(randomInt2+1);
        animal3.speak(randomInt3+1);
        animal4.speak(randomInt4+1);

    }

}

