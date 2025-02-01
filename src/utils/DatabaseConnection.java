package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/online_store";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty";
    private static Connection connection;

    public static void initialize() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Connection getConnection() {
        return connection;
    }
}
