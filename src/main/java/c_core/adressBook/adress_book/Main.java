package c_core.adressBook.adress_book;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Zbigniew", "Jarząbek",
                new Adress("Błotna", 12, "02-354", "Warszawa"), "123-456-789");
        Person person2 = new Person("Justyna", "Konieczna",
                new Adress("Błotna", 13, "02-354", "Warszawa"), "123-456-789");
        Person person3 = new Person("Henryk", "Kowal",
                new Adress("Dorzeczna", 13, "12-354", "Wisła"), "987-654-321");
        Person person4 = new Person("Mariola", "Niewąska",
                new Adress("Kościelna", 13, "42-354", "Częstochowa"), "987-654-321");

        Person.addPersonToTheBOOK(person1);
        Person.addPersonToTheBOOK(person2);
        Person.addPersonToTheBOOK(person3);
        Person.addPersonToTheBOOK(person4);


        //Person.searchBySurname(Person.adressBook1,"Kowa");
        //Person.searchByStreet(Person.adressBook1,"otna");
       // Person.searchByPhonenumber(Person.adressBook1, "654-321");
    }


}
