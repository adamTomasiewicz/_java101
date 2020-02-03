package c_core.adressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addConntact(
                new Person("Alan", "Wit",
                        new Address("Warsaw", "Regut", "100", "02850"),
                        "123123123"));

        addressBook.addConntact(
                new Person("Paweł", "Olczak",
                        new Address("Poznań", "Kazimierzowska", "12", "98234"),
                        "222222222"));

        addressBook.addConntact(
                new Person("Anna", "Nowak",
                        new Address("Gdańsk", "Mleczna", "23a", "90876"),
                        "333333111"));

        addressBook.addConntact(
                new Person("Elżbieta", "Kaczyńska",
                        new Address("Warszawa", "Poloneza", "91", "00123"),
                        "444111222"));

        addressBook.addConntact(
                new Person("Krzysztof", "Gadziński",
                        new Address("Łódź", "Mroczna", "321", "12789"),
                        "888999111"));

        boolean isRun = true;
        Scanner scan = new Scanner(System.in);
        int read = 0;

        do {
            System.out.println();
            System.out.println("###############   MENU  #################");
            System.out.println("#   [1] - print address book");
            System.out.println("#   [2] - add conntact");
            System.out.println("#   [3] - find conntact by phone number");
            System.out.println("#   [4] - find conntact by second name");
            System.out.println("#   [5] - find conntact by city");
            System.out.println("#   [0] - Exit");
            System.out.println("#########################################");
            System.out.print("# option: ");
            read = scan.nextInt();

            switch (read) {
                case 1:
                    addressBook.printMyConntacts();
                    break;
                case 2:
                    addressBook.addContactWithScanner();
                    break;
                case 3:
                    addressBook.findConntactByPhoneNumberWithScanner();
                    break;
                case 4:
                    addressBook.findConntactBySeconNameWithScanner();
                    break;
                case 5:
                    addressBook.findConntactByCityWithScanner();
                    break;
                case 0:
                    isRun = false;
                    break;
            }

        } while (isRun);

    }
}
