package pl.adamTomasiewicz.c_programator.h_collections.queue.treeset;

public class Person {//implements Comparable<Person>{
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

/*    @Override
    public int compareTo(Person person2) {
       return this.id - person2.id;
    }*/

}
