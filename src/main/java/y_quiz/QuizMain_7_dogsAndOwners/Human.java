package y_quiz.QuizMain_7_dogsAndOwners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Human implements Administrable {
    static List<Human> listOfHumans = new ArrayList<>();
    static int counterHumanID = 0;

    private int humanID;
    private String name;
    private List<Dog> listOfDogs = new ArrayList<>();

    public Human(String name) {
        this.humanID = ++counterHumanID;
        this.name = name;
        getListOfHumans().add(this);
    }

    public static void main(String[] args) {

        importPracownikow_ZPliku();
        boolean didMove = false;
        Scanner scanner1 = new Scanner(System.in);
        char input = '\0';
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        String name = "";
        String size = "";
        String color = "";
        int index = 0;

        do {
            System.out.println(" ");
            System.out.println("type input: ");
            input = scanner1.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println(" ");
                    System.out.println("type name");
                    name = scanner2.next();
                    System.out.println(" ");
                    System.out.println("type size");
                    size = scanner2.next();
                    System.out.println(" ");
                    System.out.println("type color");
                    color = scanner2.next();
                    getListOfHumans().get(0).getListOfDogs().add(new Dog(name, Size.valueOf(size), Color.valueOf(color)));
                    break;
                case 's':

                    break;
                case 'd':
                    System.out.println("type index to delete");
                    index = scanner3.nextInt();
                    getListOfHumans().get(0).getListOfDogs().remove(getListOfHumans().get(0).getListOfDogs().get(index));
                    break;
                case 'f':
                    break;
                case 'q':
                    break;
            }
        }
        while (input != 'q');
// while (!didMove) {
//
//        try {
//            switch (input) {
//            anyDolarAlive=false;


//        Human human1=new Human("Jan");
//        Human human2=new Human("Maria");
//        Human human3=new Human("Rokita");
//        human1.getListOfDogs().add(new Dog("As", Size.L, Color.RED));
//        human2.getListOfDogs().add(new Dog("Burek", Size.M, Color.GREEN));
//        human3.getListOfDogs().add(new Dog("Czopek", Size.S, Color.BLUE));
        try {
            writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Human human : getListOfHumans()) {
            System.out.println(human);
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();

    }

    public static int getCounterHumanID() {
        return counterHumanID;
    }

    public static void setCounterHumanID(int counterHumanID) {
        Human.counterHumanID = counterHumanID;
    }

    public static List<Human> getListOfHumans() {
        return listOfHumans;
    }

    public static void setListOfHumans(List<Human> listOfHumans) {
        Human.listOfHumans = listOfHumans;
    }

    public static void readFromFile() {

    }

    public static void writeToFile() throws IOException {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\src\\main\\java\\y_quiz\\QuizMain_7_dogsAndOwners\\export_dogAndOwners.txt";
        File file1 = new File(path1);
        file1.createNewFile();
        PrintWriter printWriter1 = new PrintWriter(file1);

        ListIterator<Human> listOfHumanIterator = Human.getListOfHumans().listIterator();
        while (listOfHumanIterator.hasNext()) {
            printWriter1.println(listOfHumanIterator.next());
            printWriter1.flush();
        }
        printWriter1.close();
    }

    public static void removeDuplicates() {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\src\\main\\java\\y_quiz\\QuizMain_7_dogsAndOwners\\export_dogAndOwners.txt";
        File file1 = new File(path1);
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // usuwanie duplikatow
        List<Human> listHumansToRemove = new ArrayList<>();
        while (scanner1.hasNextLine()) {
            String string = scanner1.nextLine();
            String substringId = string.substring(string.indexOf('<') + 1, string.indexOf('>'));
            System.out.println(substringId);
            Integer humanId = Integer.parseInt(substringId);
            for (Human human : Human.getListOfHumans())
                if (human.getHumanID() == humanId) listHumansToRemove.add(human);
        }
        for (Human human : listHumansToRemove) {
            getListOfHumans().remove(human);
        }
        scanner1.close();
    }

    static void importPracownikow_ZPliku() {
        String path1 = "D:\\OneDrive - AT\\_dev\\_java101\\src\\main\\java\\y_quiz\\QuizMain_7_dogsAndOwners\\export_dogAndOwners.txt";
        File file1 = new File(path1);
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //removeDuplicates();
        // dodawanie z pliku

        while (scanner1.hasNextLine()) {
            String string = scanner1.nextLine();
            System.out.println(string);

            String[] stringArrayHumanOrDog = string.split("_");
            System.out.println(stringArrayHumanOrDog[0]);
            System.out.println(stringArrayHumanOrDog[1]);
            String[] stringArrayDogs = stringArrayHumanOrDog[1].split(",");
            for (String stringDog : stringArrayDogs) {
                System.out.print(stringDog);
            }

            String name = stringArrayHumanOrDog[0].substring(stringArrayHumanOrDog[0].indexOf('<') + 1, stringArrayHumanOrDog[0].indexOf('>'));
            Human human = new Human(name);
            List<Dog> newListOfDogs = new ArrayList<>();
            for (int i = 0; i < stringArrayDogs.length - 1; ) {

                String dogName = stringArrayDogs[i].substring(stringArrayDogs[i].indexOf('<') + 1, stringArrayDogs[i++].indexOf('>'));
                String dogSize = stringArrayDogs[i].substring(stringArrayDogs[i].indexOf('<') + 1, stringArrayDogs[i++].indexOf('>'));
                String dogColor = stringArrayDogs[i].substring(stringArrayDogs[i].indexOf('<') + 1, stringArrayDogs[i++].indexOf('>'));
                i++;
                newListOfDogs.add(new Dog(dogName, Size.valueOf(dogSize), Color.valueOf(dogColor)));
            }
            //newListOfDogs.add(new Dog(dog1,Size.valueOf(dog2),Color.valueOf(dog3)));
            //newListOfDogs.add(new Dog(dog1,Size.valueOf(dog2),Color.valueOf(dog3)));
            human.setListOfDogs(newListOfDogs);

        }
        scanner1.close();
    }

    public int getHumanID() {
        return humanID;
    }

    public void setHumanID(int humanID) {
        this.humanID = humanID;
    }

    public List<Dog> getListOfDogs() {
        return listOfDogs;
    }

    public void setListOfDogs(List<Dog> listOfDogs) {
        this.listOfDogs = listOfDogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addDogToOwner() {

    }

    @Override
    public void removeDogFromOwner() {

    }

    @Override
    public String toString() {
        return "Human{" +
                " name=<" + getName() + '>' +
                "_" +
                " listOfDogs=" + getListOfDogs() +
                '}';
    }
}

