package s_sql_jdbcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RepoMain {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connectDatabase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dropTables();
    }

    public static void execute() {

    }

    public static void dropTables() {
        try {
            connectDatabase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.execute("drop table Rent;");
            statement.execute("drop table Car;");
            statement.execute("drop table Client;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void resultSet() {

        try {
            connectDatabase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

 /*   statement.execute("drop ");
    ResultSet resultSet =  statement.executeQuery("select * from car;");
    while (resultSet.next()){
        System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
    }*/
    }


    public static void connectDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres1");
        statement = connection.createStatement();
    }

    public static void disconnectDatabase() throws SQLException {
        statement.close();
        connection.close();
    }


}
