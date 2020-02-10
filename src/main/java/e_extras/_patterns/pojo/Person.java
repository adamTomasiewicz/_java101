package e_extras._patterns.pojo;

public class Person {
    private final String name;
    private final String surName;
    private final int yob;

    public Person(Personid personid, int yob) {
        this.name = personid.getName();
        this.surName = personid.getSurName();
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getYob() {
        return yob;
    }
}
