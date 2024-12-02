package com.pluralsight;

import java.sql.*;

public class DBApp {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cardealships";
        String password = "yearup";
        String user = "root";
        Connection connection;

        try {
             connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM vehicles; ");

            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {
            String make = resultSet.getString("Make");
            String model = resultSet.getString("Model");
            double price = resultSet.getDouble("Price");
                System.out.printf("make: %s model: %s Price: $%.2f\n", make, model, price);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}
