package pl.akademiakodu.classes_And_Objects;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Employee2 {

    private int id;
    private String function;
    private Integer salary;
static int iid=0;

    public Employee2(String function, Integer salary) {

        iid++;
        this.id = iid;
        this.function = function;
        this.salary = salary;


    }

    @Override
    public String toString() {
        return "("+ id + ")" + "("+ function+ "): " + salary ;


    }
    static Integer avgSalary(Map<Integer,Employee2> list){

        int counter = 0;
        Integer sum = 0;
        for (Map.Entry<Integer, Employee2> entry: list.entrySet()){
            sum = sum + entry.getValue().salary;
            counter++;
        }
    return sum*12/counter;

    }

    static String above7k (Map<Integer,Employee2> list){

    String above7k = "";

    for (Map.Entry<Integer, Employee2> entry: list.entrySet()) {
        if (entry.getValue().salary > 7000) {
            String concat = String.valueOf(entry.getKey())+", " ;
            above7k= above7k+concat;
        }
    }

    return above7k;

    }


    public static void main(String[] args) {


        Map<Integer, Employee2> list = new LinkedHashMap<>();
        Employee2 emp1 = new Employee2("Programmer1", 12000);
        list.putIfAbsent(iid, emp1);
        Employee2 emp2 = new Employee2("Programmer2", 8000);
        list.putIfAbsent(iid, emp2);
        Employee2 emp3 = new Employee2("Programmer3", 5000);
        list.putIfAbsent(iid, emp3);
        Employee2 emp4 = new Employee2("Programmer4", 15000);
        list.putIfAbsent(iid, emp4);
        for (Map.Entry<Integer, Employee2> entry: list.entrySet()) {
            System.out.println(entry.getValue());

        }
        System.out.println("Annual avarage salary is: "+ avgSalary(list));
        System.out.println("Employees who ern more than 7k are: "+ above7k(list));

    }


}
