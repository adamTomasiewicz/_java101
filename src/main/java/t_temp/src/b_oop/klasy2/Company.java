package pl.adamTomasiewicz.b_akademia.b_oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Company {
    private String name;
    private String office;

    private List<Person> employees = new ArrayList<>();

    public Company(String nameOfCompany, String mainOffice, int numberOfEmployees, LinkedList<Employee> employees) {
        setName(name);
        setOffice(office);

       // setEmployees(employees);
    }


    public Company(String akademia_kodu, String ch_promenada) {
    }

    public void addEmpoloyee (Person employee){
        employees.add(employee);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> list) {

        this.employees = list;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + getName() + '\'' +
                ", office='" + getOffice() + '\'' +
                ", numberOfEmployees=" + getEmployees().size() +
                ", employees=" + getEmployees() +
                '}';

    }

    public static void main(String[] args) {


    }
}

