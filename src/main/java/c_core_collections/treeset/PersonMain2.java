package c_core_collections.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain2 {
    public static void main(String[] args) {
        TreeSet<Person> treeSetPerson = new TreeSet<>(new PersonComparatorByName());
        treeSetPerson.add(new Person(2,"Jan"));
        treeSetPerson.add(new Person(3,"Maria"));
        treeSetPerson.add(new Person(5,"Waclaw"));
        treeSetPerson.add(new Person(1,"Bożo"));
        treeSetPerson.add(new Person(11,"Jerzyk"));
        treeSetPerson.add(new Person(12,"Jerzyk"));
        System.out.println(treeSetPerson);
        for (Person setPerson : treeSetPerson) System.out.println(setPerson);

        Set<Person> treeSetPerson2 = new TreeSet<>(getComparator(SortingType.ID));
        treeSetPerson2.add(new Person(2,"Jan"));
        treeSetPerson2.add(new Person(3,"Maria"));
        treeSetPerson2.add(new Person(5,"Waclaw"));
        treeSetPerson2.add(new Person(4,"Waclaw"));
        treeSetPerson2.add(new Person(5,"Waclaw"));
        treeSetPerson2.add(new Person(1,"Bożo"));
        treeSetPerson2.add(new Person(11,"Jerzyk"));
        treeSetPerson2.add(new Person(12,"Jerzyk"));
        System.out.println(treeSetPerson2);
        for (Person person2 : treeSetPerson2) System.out.println(person2);
    }
public static Comparator<Person> getComparator (SortingType sortingType) {
    switch (sortingType){
        case ID:
            return new PersonComparatorByID();
        case NAME:
            return new PersonComparatorByName();
        case UBER:
            return new PersonComparatorByUber();
        default:
            throw new IllegalArgumentException();
    }
}
    private enum SortingType {
        NAME, ID, UBER;
    }
}
