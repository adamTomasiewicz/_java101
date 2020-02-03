package pl.adamTomasiewicz.c_programator.b_pojo;

public class Personid {
    private final String name;
    private final String surName;


    public Personid(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
