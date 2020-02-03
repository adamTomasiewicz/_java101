package c_core.company._company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Firma firma1 = new Firma("ITat");

        Boss boss1 = new Boss("Adaś Mialczynski", 25000);
        Manager manager1 = new Manager("Jan Kowalski", 15000);
        Manager manager2 = new Manager("Janina Kowalska", 12000);
        Developer developer1 = new Developer("Zygmunt Zgutka", 12000);
        Developer developer2 = new Developer("Jerzyk Malutki", 9000);
        Developer developer3 = new Developer("Andrzej Wspaniały", 8000);
        Developer developer4 = new Developer("Zbyszek Zaginiony", 7000);
        Developer developer5 = new Developer("Marysia Sierotka", 6000);
        Developer developer6 = new Developer("Andzela Niewybaczalska", 5000);
        firma1.employees.addAll(Arrays.asList(boss1, manager1, manager2, developer1, developer2, developer3, developer4));
        firma1.employees.add(developer5);
        firma1.employees.add(developer6);

        nameAllEmployees(firma1);
        yearSalaryOfAllEmployees(firma1);
    }

    private static void nameAllEmployees(Firma firma) {
        for (Employeeable employee : firma.employees) {
            employee.showNameAndSurname();
        }
    }

    private static void yearSalaryOfAllEmployees(Firma firma) {
        int sum = 0;
        for (Employeeable employee : firma.employees) {
            sum += employee.returnYearSalary();
        }
        System.out.println("Roczna pensja wszystkich pracownikow: " + sum);
    }

}
