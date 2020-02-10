package e_extras._patterns.singleton;

public class DatabaseManager {
    private static DatabaseManager instance;
    private DatabaseConnection connection;

    private DatabaseManager() {
        connection = new DatabaseConnection();
        connection.initialize();
        System.out.println("Creating new DatabaseManager object ... ");
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();

        }

        return instance;
    }

    public void doSomethingInDB() {
        connection.runQuery();
    }
}
