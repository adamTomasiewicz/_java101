package pl.adamTomasiewicz.c_programator.h_collections.queue.treeset;

import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
    public static void main(String[] args) {
        Set<Person> treeSetPerson = new TreeSet<>(new PersonComparatorByName());
        treeSetPerson.add(new Person(2, "Jan"));
        treeSetPerson.add(new Person(3, "Maria"));
        treeSetPerson.add(new Person(5, "Waclaw"));
        treeSetPerson.add(new Person(1, "Bożo"));
        treeSetPerson.add(new Person(11, "Jerzyk"));
        treeSetPerson.add(new Person(12, "Jerzyk"));
        System.out.println(treeSetPerson);
        for (Person setPerson : treeSetPerson) System.out.println(setPerson);

        Set<Person> treeSetPerson2 = new TreeSet<>();
        treeSetPerson2.add(new Person(2, "Jan"));
        treeSetPerson2.add(new Person(3, "Maria"));
        treeSetPerson2.add(new Person(5, "Waclaw"));
        treeSetPerson2.add(new Person(1, "Bożo"));
        treeSetPerson2.add(new Person(11, "Jerzyk"));
        treeSetPerson2.add(new Person(12, "Jerzyk"));
        System.out.println(treeSetPerson2);
        for (Person setPerson2 : treeSetPerson2) System.out.println(setPerson2);


    }
}
