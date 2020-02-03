package c_core.adressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private Person person;
    private ArrayList<AddressBook> addressBooks;
    private Scanner scanner;

    public AddressBook() {
        addressBooks = new ArrayList<>();
    }

    private AddressBook(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "person=" + person +
                '}';
    }

    public void addConntact(Person person) {
        addressBooks.add(new AddressBook(person));
    }

    private void findConntactByPhoneNumber(String phoneNumber) {
        int notFoundInAddressBook = 0;
        for (AddressBook addressBook : addressBooks) {
            if (addressBook.person.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Found: " + addressBook.toString());
            } else {
                notFoundInAddressBook++;
            }
        }
        if (notFoundInAddressBook == addressBooks.size()) {
            System.out.println("[INFO: findConntactByPhoneNumber] phone number not found in your address book");
        }
    }

    public void findConntactByPhoneNumberWithScanner() {
        scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        findConntactByPhoneNumber(phoneNumber);
        scanner.close();
    }

    private void findConntactByCity(String city) {
        int notFoundInAddressBook = 0;
        for (AddressBook addressBook : addressBooks) {
            if (addressBook.person.getAddress().getCity().equals(city)) {
                System.out.println(addressBook.toString());
            } else {
                notFoundInAddressBook++;
            }
        }
        if (notFoundInAddressBook == addressBooks.size()) {
            System.out.println("[INFO: findConntactByCity] city not found in your address book");
        }
    }

    public void findConntactByCityWithScanner() {
        scanner = new Scanner(System.in);
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        findConntactByCity(city);
        scanner.close();
    }


    private void findConntactBySeconName(String secondName) {
        int notFoundInAddressBook = 0;
        for (AddressBook addressBook : addressBooks) {
            if (addressBook.person.getSecondName().equals(secondName)) {
                System.out.println("Found: " + addressBook.toString());
            } else {
                notFoundInAddressBook++;
            }
        }
        if (notFoundInAddressBook == addressBooks.size()) {
            System.out.println("[INFO: findConntactBySeconName] second name not found in your address book");
        }
    }

    public void findConntactBySeconNameWithScanner() {
        scanner = new Scanner(System.in);
        System.out.print("Enter second name: ");
        String secondName = scanner.nextLine();
        findConntactBySeconName(secondName);
        scanner.close();
    }

    public void findConntactByAddress(String city, String street, String number, String postCode) {
        int notFoundInAddressBook = 0;
        for (AddressBook addressBook : addressBooks) {
            if (addressBook.person.getAddress().getCity().equals(city) &&
                    addressBook.person.getAddress().getStreet().equals(street) &&
                    addressBook.person.getAddress().getNumber().equals(number) &&
                    addressBook.person.getAddress().getPostCode().equals(postCode)
            ) {
                System.out.println(addressBook.toString());
            } else {
                notFoundInAddressBook++;
            }
        }
        if (notFoundInAddressBook == addressBooks.size()) {
            System.out.println("[INFO: findConntactByAddress] address not found in your address book");
        }
    }

    public void printMyConntacts() {
        for (AddressBook addressBook : addressBooks) {
            System.out.println(addressBook.toString());
        }
    }

    public void addContactWithScanner() {
        scanner = new Scanner(System.in);
        System.out.print("first name: ");
        String firstName = scanner.nextLine();

        System.out.print("second name: ");
        String secondName = scanner.nextLine();

        System.out.print("city: ");
        String city = scanner.nextLine();

        System.out.print("street: ");
        String street = scanner.nextLine();

        System.out.print("number: ");
        String number = scanner.nextLine();

        System.out.print("post code: ");
        String postCode = scanner.nextLine();

        System.out.print("phone number: ");
        String phoneNumber = scanner.nextLine();

        addressBooks.add(new AddressBook(new Person(firstName, secondName, new Address(city, street, number, postCode), phoneNumber)));
        System.out.println("[INFO addContactWithScanner] Add new conntact to address book");
        scanner.close();
    }

}
