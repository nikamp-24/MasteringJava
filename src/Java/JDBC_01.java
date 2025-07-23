package Java;

import java.sql.*;

public class JDBC_01 {
    public static void main(String[] args) {
        // Step 1: Get environment variables
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASS");

        if (url == null || user == null || password == null) {
            System.err.println("❌ One or more environment variables not set (DB_URL, DB_USER, DB_PASS)");
            return;
        }

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
        ) {
            System.out.println("✅ Connected to the database!");
            System.out.println("ID | Name  | Salary");
            System.out.println("---------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + " | " + name + " | " + salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
