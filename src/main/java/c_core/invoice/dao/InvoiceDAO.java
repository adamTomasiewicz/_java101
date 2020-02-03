package c_core.invoice.dao;


import c_core.invoice.model.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InvoiceDAO {

    Invoice invoice1 = new Invoice("Faktura 1", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2018, 12, 24), true);
    Invoice invoice2 = new Invoice("Faktura 2", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2019, 5, 2), true);
    Invoice invoice3 = new Invoice("Faktura 3", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2019, 3, 8), true);
    Invoice invoice4 = new Invoice("Faktura 4", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2019, 7, 5), true);
    Invoice invoice5 = new Invoice("Faktura 5", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2018, 9, 3), true);
    Invoice invoice6 = new Invoice("Faktura 6", "Andrzej Kowalski", new Random().nextDouble(), LocalDate.of(2018, 1, 19), true);
    Invoice invoice7 = new Invoice("Faktura 7", "Andrzej Kowalski", 235.34, LocalDate.of(2018, 3, 23), true);
    Invoice invoice8 = new Invoice("Faktura 8", "Andrzej Kowalski", 45.78, LocalDate.of(2019, 10, 11), true);
    Invoice invoice9 = new Invoice("Faktura 9", "Andrzej Kowalski", 123.88, LocalDate.of(2019, 6, 13), true);
    Invoice invoice10 = new Invoice("Faktura 10", "Andrzej Kowalski", 678.22, LocalDate.of(2018, 8, 25), true);
    Invoice invoice11 = new Invoice("Faktura 11", "Andrzej Kowalski", 459.75, LocalDate.of(2018, 3, 7), true);

    Invoice invoice12 = new Invoice("Faktura nieoplacona 12", "Andrzej Kowalski", 1000.00, LocalDate.of(2019, 12, 11), true);
    Invoice invoice13 = new Invoice("Faktura nieoplacona 13", "Andrzej Kowalski", 2000.00, LocalDate.of(2019, 12, 12), true);

    public List<Invoice> getData() {
        List<Invoice> list = new ArrayList();
        list.add(invoice1);
        list.add(invoice2);
        list.add(invoice3);
        list.add(invoice4);
        list.add(invoice5);
        list.add(invoice6);
        list.add(invoice7);
        list.add(invoice8);
        list.add(invoice9);
        list.add(invoice10);
        list.add(invoice11);
        list.add(invoice12);
        list.add(invoice13);
        return list;
    }

}
