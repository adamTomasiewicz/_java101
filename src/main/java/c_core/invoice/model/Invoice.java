package c_core.invoice.model;

import java.time.LocalDate;


public class Invoice {

    private String title;
    private String customer;
    private double value;
    private LocalDate issued;
    private boolean vat;

    public Invoice() {
    }

    public Invoice(String title, String customer, double value, LocalDate issued, boolean vat) {
        this.title = title;
        this.customer = customer;
        this.value = value;
        this.issued = issued;
        this.vat = vat;
    }
}
