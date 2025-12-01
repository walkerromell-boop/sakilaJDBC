package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "yearup24";

        // open connection to database
        Connection connection = DriverManager.getConnection(url,username,password);
    }
}
