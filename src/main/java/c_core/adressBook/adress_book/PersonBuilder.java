package c_core.adressBook.adress_book;

import java.util.HashMap;
import java.util.Map;

public final class PersonBuilder {
    Map<Integer, String> mapa1 = new HashMap<>();
    private String name;
    private String surname;
    private Adress adress;
    private String phoneNumber;

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withAdress(Adress adress) {
        this.adress = adress;
        return this;
    }

   /* public Person build() {

        return new Person(name, surname, adress, phoneNumber);
    }*/

    public PersonBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
