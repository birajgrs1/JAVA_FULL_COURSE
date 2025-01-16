package forMyOwnPractice.seventh_sem_lab_all.lab6;

import java.sql.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        try {
            // Load JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection details
            String JDBC_URL = "jdbc:mysql://localhost:3306/practical?useSSL=false&serverTimezone=UTC";
            String USERNAME = "root";
            String PASSWORD = "";

            // Open a connection
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create a statement
            System.out.println("Creating statement...");
            Statement stmt = conn.createStatement();

            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "age INT," +
                    "position VARCHAR(100))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'employee' created successfully.");

            // Insert records
            String insertSQL1 = "INSERT INTO employee (name, age, position) VALUES ('Biraj Ghorasaine', 22, 'Web Developer')";
            String insertSQL2 = "INSERT INTO employee (name, age, position) VALUES ('Biplop Khadka', 22, 'Machine Learning Engineer')";
            String insertSQL3 = "INSERT INTO employee (name, age, position) VALUES ('Shandya Dahal', 21, 'Python Developer')";
            String insertSQL4 = "INSERT INTO employee (name, age, position) VALUES ('Suman Neupane', 28, 'HR Manager')";

            stmt.executeUpdate(insertSQL1);
            stmt.executeUpdate(insertSQL2);
            stmt.executeUpdate(insertSQL3);
            stmt.executeUpdate(insertSQL4);
            System.out.println("Records inserted successfully.");

            // Retrieve and display records
            String retrieveSQL = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(retrieveSQL);

            System.out.println("Retrieved employee details:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Position: " + position);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
