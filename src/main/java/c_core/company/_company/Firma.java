package c_core.company._company;

import java.util.ArrayList;
import java.util.List;

class Firma {
    protected String adress;
    protected List<Employeeable> employees = new ArrayList<>();

    public Firma(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Employeeable> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employeeable> employees) {
        this.employees = employees;
    }
}
