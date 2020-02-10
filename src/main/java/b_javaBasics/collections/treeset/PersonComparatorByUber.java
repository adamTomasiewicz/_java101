package b_javaBasics.collections.treeset;

import java.util.Comparator;

public class PersonComparatorByUber implements Comparator<Person> {

    private final PersonComparatorByID byID = new PersonComparatorByID();
    private final PersonComparatorByName byName = new PersonComparatorByName();

    @Override
    public int compare(Person person1, Person person2) {
        int byNameResult = byName.compare(person1, person2);
        if (byNameResult == 0) {
            return byID.compare(person1, person2);
        }
        return byNameResult;
    }
}
