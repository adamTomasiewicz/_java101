package pl.adamTomasiewicz.b_akademia.b_oop;


public class Person {

    private String name;
    private String surname;
    private int age;
    private String pesel;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getFullName() + '\'' +
                '}';
    }

    public String getFullName(){
        return name+" "+surname;
    }

}
/*

public class Person {

    String name;
    String surname;
    String pesel;
    char test;

    public static void main(String[] args) {

        Person person1 = new Person(); //class constructor
        person1.name = "Adam";
        person1.surname = "Kowalski";
        person1.pesel = "21909321909031";
        System.out.println(person1.name);
        System.out.println(person1.surname);
        System.out.println(person1.pesel);

        Person person2 = new Person();
        person2.name = "Zofia";
        person2.surname = "Nowak";
        System.out.println(person2.pesel);
        System.out.println("! " + person2.test + " !");
        //null - if that field is not initialize, variable receives default value
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        //list.add();

        for (Person person : people) {
            System.out.println(person.name + " " + person.surname);
        }


    }
}
//EXERCISE
*/
/*public class User {
    String name;
    String email;
    String password;
    boolean admin;

    public static void main(String[] args) {

        User person1 = new User(); //class constructor
        person1.name = "Adam";
        person1.email ="Kowalski";
        person1.password = "21909321909031";
        person1.admin = true;
        System.out.println(person1.name);
        System.out.println(person1.email);
        System.out.println(person1.admin);

        User person2 = new User(); //class constructor
        person2.name = "Adam";
        person2.email ="Kowalski";
        person2.password = "21909321909031";
        person2.admin = false;

        List<User> users = new ArrayList<>();
        users.add(person1);
        users.add(person2);
        //list.add();

        for (User user : users) {
            System.out.println(user.name+" "+user.email+" is admin: "+user.admin);
        }



    }*/


