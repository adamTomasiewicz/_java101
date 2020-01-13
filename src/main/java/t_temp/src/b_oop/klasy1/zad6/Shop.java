package pl.adamTomasiewicz.b_akademia.b_oop.klasy1.zad6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//kubernetes i docker - devopsowe
public class Shop {
    public static void main(String[] args) {
        System.out.println("Sklep internetowy");
        Category category1 = new Category( "RTV");
        Category category2 = new Category("Motoryzacja");

        Product product2 = new Product("Telefon", category1);
        Product product3 = new Product("Komputer", category1);
        Product product4 = new Product("Samochód", category2);
        Product product5 = new Product("Skuter", category2);

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);

        List<Category> listCategories = new ArrayList<>();
        listCategories.add(category1);
        listCategories.add(category2);
        Scanner scanner1 = new Scanner(System.in);
        int input = 0;
        do {
            wydrukujMenu_0();
            input = scanner1.nextInt();

            if (input == 1) {
                System.out.println("Dostępne produkty:");
                System.out.println(listProducts); }
            else if (input == 2) {
                System.out.println("Dostępne kategorie:");
                System.out.println(listCategories); }
            else if (input == 3) {
                pobierzProduktyDanejKategorii_3(listCategories, listProducts);
            }
            else if (input == 4) {
                dodajProdukt_4(listCategories, listProducts);
                System.out.println("dodano produkt" + scanner1); }
            else if (input == 5) { }
            else if (input == 6) { }
            else if (input == 9) {
                System.out.println("Wyjście z programu");
            }
            else {
                System.out.println("Wybrano niepoprawną opcję! \n Spróbuj jeszcze raz");
            }
        }
        while (input != 9);
    }

    public static void wydrukujMenu_0() {
        System.out.println("Menu:");
        System.out.print("_1:_ Wyświetl wszystkie produkty ");
        System.out.print("_2:_ Wyświetl wszystkie kategorie ");
        System.out.println("_3:_ Wyświetl produkty z danej kategorii ");
        System.out.print("_4:_ dodaj produkt ");
        System.out.print("_5:_ dodaj kategorie ");
        System.out.println("_6:_ Przypisz produkt do kategorii ");
        System.out.println("_9:_ Zamknij program ");
    }
    public static void  pobierzProduktyDanejKategorii_3 ( List<Category> categories,List<Product> products) {
        System.out.println(categories);
        System.out.println("Produkty której kategorii chcesz wyświetlić?");
        System.out.println();
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
        for (Category category : categories) {
            if (category.getCategoryName().equalsIgnoreCase(input2)) {
                System.out.println("Kategoria " + category.getCategoryName() + ":");
                for (Product product : products) {
                    if (product.getCategory().getCategoryID() == category.getCategoryID()) {
                        System.out.print(product.getNazwa() + ", ");
                    }
                }
            }
        }
        System.out.println();
    }
    public static void dodajProdukt_4(List<Category> categoryList, List<Product> productList){
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj nazwę kategorii:");
        String categoryName = scanner4.nextLine();

        System.out.println("Podaj nazwę produktu:");
        String productName = scanner4.nextLine();
        Product product5 = new Product(productName, znajdzKategoriePoNazwie(categoryList,categoryName));
        productList.add(product5);
    }


    public static Category znajdzKategoriePoNazwie (List<Category> categories, String name){
        for (Category category : categories) {
            if(name.equalsIgnoreCase(category.getCategoryName())) return category;
        }
        return null;
    }


}
