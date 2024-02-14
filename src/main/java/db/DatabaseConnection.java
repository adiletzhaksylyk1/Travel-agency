package db;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public static Connection connect() {
        String connectionString = "jdbc:postgresql://localhost:5432/traveldb";
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(connectionString, "postgres", "010203");
            return conn;
        }
        catch (Exception e) {
            System.out.println("connection error: " + e.getMessage());
            return null;
        }
    }
}
