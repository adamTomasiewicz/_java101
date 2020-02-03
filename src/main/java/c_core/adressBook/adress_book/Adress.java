package c_core.adressBook.adress_book;

class Adress {
    private String street;
    private int number;
    private String postalCode;
    private String city;

    protected Adress(String street, int number, String postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    protected String getStreet() {
        return street;
    }


}
