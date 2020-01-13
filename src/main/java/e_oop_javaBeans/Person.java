package e_oop_javaBeans;

import java.util.Calendar;
import java.util.StringJoiner;

public class Person {
    private String name;
    private String surName;
    private int yob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yob;
    }
    public void setAge(int age) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.yob = currentYear - age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surName='" + surName + "'")
                .add("yob=" + yob)
                .add("age'" + getAge() + "'")
                .toString();
    }
}
