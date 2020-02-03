package c_core.company._company;

public class Boss implements Employeeable {
    private String name;
    private int salaryPerMonth;

    public Boss(String name, int salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public void showNameAndSurname() {
        System.out.println("My name is: " + name);
    }

    @Override
    public void showSalary() {
        System.out.println("My salary perMonth is: " + salaryPerMonth);
    }

    @Override
    public int returnYearSalary() {
        return salaryPerMonth * 12;
    }
}
