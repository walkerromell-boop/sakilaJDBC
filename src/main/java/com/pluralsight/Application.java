package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "y";

        // open connection to database
        Connection connection = DriverManager.getConnection(url,username,password);
    }
}
