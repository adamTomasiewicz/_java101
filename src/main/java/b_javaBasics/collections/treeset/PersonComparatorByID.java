package pl.adamTomasiewicz.c_programator.h_collections.queue.treeset;

import java.util.Comparator;

public class PersonComparatorByID implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getId() - (person2.getId());
    }
}
