package com.example.loginsetup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDataBaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@//193.225.33.71:1521/xe";
        String username = "BWLLM0";
        String password = "EKKE_2023";

        return DriverManager.getConnection(url, username, password);
    }
}
