package c_core.adressBook;

public class Address {
    private final String city;
    private final String street;
    private final String number;
    private final String postCode;

    public Address(String city, String street, String number, String postCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
