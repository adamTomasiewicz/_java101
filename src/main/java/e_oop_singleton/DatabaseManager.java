package e_oop_singleton;

public class DatabaseManager {
    private DatabaseConnection connection;
    private static DatabaseManager instance;

    private DatabaseManager () {
        connection = new DatabaseConnection();
        connection.initialize();
        System.out.println("Creating new DatabaseManager object ... ");
    }
    public static DatabaseManager getInstance() {
        if(instance == null){
            instance = new DatabaseManager();

        }

        return instance;
    }
  public void doSomethingInDB () {
        connection.runQuery();
  }
}
