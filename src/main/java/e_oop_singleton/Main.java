package e_oop_singleton;

public class Main {
    public static void main(String[] args) {

        DatabaseManager dbManager = DatabaseManager.getInstance();
        dbManager.doSomethingInDB();
        dbManager.doSomethingInDB();
        dbManager.doSomethingInDB();
DatabaseManager.getInstance();

    }
}
