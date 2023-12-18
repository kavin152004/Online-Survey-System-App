package com.example.surveys;
import java.sql.*;
public class database {
    public Connection databaseLink;

    public Connection getConnection() {
        String dbName = "surveyapp";
        String dbUser = "root";
        String dbpassword = "kavinraj@2004";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, dbUser, dbpassword);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}