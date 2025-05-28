package koneksi;

import java.sql.*;

public class Connector {
    private static final String URL = "jdbc:mysql://localhost:3306/penginapan_sql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Kesalahan koneksi database: " + e.getMessage());
            return null;
        }
    }
}
