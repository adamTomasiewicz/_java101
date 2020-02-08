package pl.adamTomasiewicz.b_akademia.b_oop;

public class Employee extends Person{



    private double salaryPerMonth; //BegDecimal
    private String company;



    //constructor is a method that is named the same as class and is responsible for creating classes_And_Objects for that class


    public Employee(String name, String surname, double salaryPerMonth, String company) {
        super(name, surname);
        this.salaryPerMonth = salaryPerMonth;
        this.company = company;
    }

/*    public void setName(String name){
        if (name.length()>=3 && Character.isUpperCase(name.charAt(0))){
            this.name = name;
        } else {
            System.out.println("wrong data");
        }
    }
    public String getName(){
        if (name!=null){
            return name;
        } else {
            return "wrong data";
        }
    }*/
/*
    public void setSurname(String surname) {

        if (surname.length()>=3 && Character.isUpperCase(surname.charAt(0))){
            this.surname = surname;
        } else {
            System.out.println("wrong data");
        }
    }
    public String getSurname() {
        if (surname!=null){
            return surname;
        } else {
            return "wrong data";
        }

    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }
    public static double salaryPerYear(double salaryPerMonth){
        return salaryPerMonth*12; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }*/




}
