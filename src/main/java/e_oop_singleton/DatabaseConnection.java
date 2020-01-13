package e_oop_singleton;

public class DatabaseConnection {

    public void initialize() {
        // 5min
        System.out.println("Initializing connection ...");
    }
    public void runQuery () {
        // 1sek
        System.out.println("Running query ...");
    }
}
