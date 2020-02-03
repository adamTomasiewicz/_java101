package y_quizes.QuizMain_7_dogsAndOwners;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    static List<Dog> listOfAllDogs = new ArrayList<>();
    static int counterDogID = 0;

    private int dogID;
    private String name;

    private Size size;
    private Color color;


    public Dog(String name, Size size, Color color) {
        this.dogID = ++counterDogID;
        this.name = name;
        this.size = size;
        this.color = color;
        getListOfAllDogs().add(this);

    }

    public static int getCounterDogID() {
        return counterDogID;
    }

    public static void setCounterDogID(int counterDogID) {
        Dog.counterDogID = counterDogID;
    }

    public static List<Dog> getListOfAllDogs() {
        return listOfAllDogs;
    }

    public static void setListOfAllDogs(List<Dog> listOfAllDogs) {
        Dog.listOfAllDogs = listOfAllDogs;
    }

    public int getDogID() {
        return dogID;
    }

    public void setDogID(int dogID) {
        this.dogID = dogID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "  " +
                " name=<" + getName() + "> ," +
                " name=<" + getSize() + "> ," +
                " name=<" + getColor() + "> ," +
                '}';
    }

}
