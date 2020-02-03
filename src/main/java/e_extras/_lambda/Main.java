package d_advanced_lambdas;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        final UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
        Supplier<String> someString = () -> "some return value";
        System.out.println(someString.get());
        System.out.println("---------------------------------------------------");
        anonymousClassVsLambda();
        System.out.println("---------------------------------------------------");
        collections();
        System.out.println("---------------------------------------------------");
        flatMap();
        System.out.println("---------------------------------------------------");
        sort();
    }

    public static void anonymousClassVsLambda() {
        IntFunction<Integer> myImplementation = new IntFunction<Integer>() {
            @Override
            public Integer apply(int value) {
                return value + 100;
            }
        };
        IntFunction<Integer> lambdaExpression = f -> f + 100;

        System.out.println(myImplementation.apply(5));
        System.out.println(lambdaExpression.apply(5));
    }

    public static void collections() {
        ArrayList<Person> list = dummyData1();
        list.stream()
                .filter(person -> person.getName()
                        .contains("Andrzej"))
                .forEach(System.out::println);
        list.stream()
                .filter(person -> person.getAddress()
                        .getCity().contains("W"))
                .forEach(System.out::println);
        list.stream()
                .map(person -> person.getAddress()
                        .getPostalCode())
                .forEach(System.out::println);
    }

    public static void flatMap() {
        List<List<Person>> listOfLists = Arrays.asList(dummyData2(), dummyData1());
        listOfLists
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void sort() {
        List<List<Person>> listOfLists = Arrays.asList(dummyData2(), dummyData1());
        List<Person> list = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        list.sort(Comparator.comparingInt(Person::getIntId));
        list.forEach(System.out::println);

    }

    private static ArrayList<Person> dummyData1() {
        Address address1 = new Address(1, "Kwaitowa", "12A", "03-253", "Poznań");
        Address address2 = new Address(2, "Kwaitowa", "56", "03-253", "Poznań");
        Address address3 = new Address(3, "Lazurowa", "23", "03-253", "Poznań");
        Address address4 = new Address(4, "Domyślna", "4B", "06-846", "Toruń");
        Address address5 = new Address(5, "Aleja Krakowska", "256", "02=234", "Warszawa");
        Person person1 = new Person(1, "Andrzej Kowalski", new BigDecimal(3425), address1);
        Person person2 = new Person(2, "Zdzislaw Lecina", new BigDecimal(4566), address2);
        Person person3 = new Person(3, "Marian Nowak", new BigDecimal(2342), address3);
        Person person4 = new Person(4, "Henryk Pajak", new BigDecimal(10456), address4);
        Person person5 = new Person(5, "Andrzej Defaultowy", new BigDecimal(20000), address5);
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;
    }

    private static ArrayList<Person> dummyData2() {
        Address address6 = new Address(6, "Weseoła", "87", "03-253", "Poznań");
        Address address7 = new Address(7, "Wojwódzka", "32C", "03-253", "Poznań");
        Person person6 = new Person(6, "Mariano Italiano", new BigDecimal(3425), address6);
        Person person7 = new Person(7, "Krzysztof Jarzyna", new BigDecimal(4566), address7);
        ArrayList<Person> list = new ArrayList<>();
        list.add(person6);
        list.add(person7);
        return list;
    }
}
