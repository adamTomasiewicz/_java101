package c_core.adressBook.adress_book;

import java.util.*;

public class Person {
    public static Set<Person> adressBook1 = new HashSet<Person>();
    private String name;
    private String surname;
    //  private pl.adamTomasiewicz.a_temp.adress_book.Adress adress;
    private String phoneNumber;

    public Person(String name, String surname, Adress adress, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        //this.adress = adress;
        this.phoneNumber = phoneNumber;

    }

    public static void addPerson(String name, String surname, String phoneNumber) {

    }

    public static void addPersonToTheBOOK(Person person) {
        adressBook1.add(person);
    }

    public static List<Person> searchBySurname(Set<Person> adressBook1, String inputSurname) {
        List<Person> resultPerson = new LinkedList<>();
        for (Person person : adressBook1) {
            if (person.getSurname().contains(inputSurname)) {
                resultPerson.add(person);
            }
        }
        for (Person person : resultPerson) {
            System.out.println(person);
        }
        return resultPerson;
    }

    public static List<Person> searchByStreet(Set<Person> adressBook1, String inputStreet) {
        List<Person> resultPerson = new LinkedList<>();
        for (Person person : adressBook1) {
//            if (person.getAdress().getStreet().contains(inputStreet))
//            {resultPerson.add(person);}
//        }

//        for (Person person: resultPerson) {
//            System.out.println(person);
//        }
        }
        return resultPerson;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                // ", adress=" + adress +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                // Objects.equals(adress, person.adress) &&
                Objects.equals(phoneNumber, person.phoneNumber);
    }

    //public Adress getAdress() {
    //      return adress;
    // }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber);
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
//    public static List<Person> searchByPhonenumber (Set<Person> adressBook1 , String inputPhonenumber) {
//        List<Person> resultPerson = new LinkedList<>();
//        for (Person person: adressBook1 ) {
//            if (person.getPhoneNumber().contains(inputPhonenumber))
//            {resultPerson.add(person);}
//        }
//        for (Person person: resultPerson) {
//            System.out.println(person);
//        }
//        return resultPerson;
//    }


}
