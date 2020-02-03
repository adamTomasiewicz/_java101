package s_sql_jdbcs.bmiCalculator.repositories;

import pl.adamTomasiewicz.jdbc_temp.model.BmiRecord;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BmiRepository {

    public static Connection connection = null;

    public static void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            BmiRepository.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi?user=root&password=");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addBmiToDb(BmiRecord bmiRecord) {

        try {
            String sql = "INSERT INTO t_bmirecord (weight, height, sex, bmi) " +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement zapytanie = BmiRepository.connection.prepareCall(sql);

            zapytanie.setInt(1, bmiRecord.getWeight());
            zapytanie.setInt(2, bmiRecord.getHeight());
            zapytanie.setString(3, bmiRecord.getSex());
            zapytanie.setDouble(4, bmiRecord.getBmi());

            zapytanie.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Nie udało się zapytać SQLa");
        }

    }

    public static List<BmiRecord> getDataFromDb() {
        List<BmiRecord> listOfBmi = new LinkedList<>();
        try {
            String sql = "SELECT * FROM t_bmirecord";
            PreparedStatement zapytanie = BmiRepository.connection.prepareStatement(sql);
            ResultSet resultSet = zapytanie.executeQuery();
//        while (resultSet.next()) {
//            resultSet.getInt();
//            resultSet.getInt();
//            resultSet.getInt()
//            resultSet.getString()
//            resultSet.getDouble()
//        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfBmi;
    }

}
