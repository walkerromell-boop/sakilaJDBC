package com.pluralsight;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = args[0];
        String password = args[1];


        //define your query
        String query = "SELECT city FROM city ";
        // open connection to database
        Connection connection = DriverManager.getConnection(url, username, password);


        // create statement
        // the statement is tied to the open connection
        PreparedStatement statement = connection.prepareStatement(query);


        // 2. Execute your query
        ResultSet results = statement.executeQuery();
        // process the results
        while (results.next()) {
            String city = results.getString("city");
            System.out.println(city);
        }
        // 3. Close the connection
//        connection.close();
//        System.out.println(results);
        results.close();
        statement.close();
        connection.close();
    }
}
