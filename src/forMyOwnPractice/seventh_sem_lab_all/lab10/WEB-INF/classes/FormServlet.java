import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class FormServlet extends HttpServlet {
    static Connection con;

    public static Connection connect() {
        try {
            if (con != null)
                return con;
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_URL = "jdbc:mysql://localhost:3306/employeeform";
            String USERNAME = "root";
            String PASSWORD = "";
            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

           String name = request.getParameter("name");
           float salary= Float.parseFloat(request.getParameter("salary"));
           int phone= Integer.parseInt(request.getParameter("phone"));

        try {
            Connection con = connect();
            if (con != null) {
                String query = "INSERT INTO empdetails VALUES (?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, name);
                stmt.setFloat(2, salary);
                stmt.setInt(3, phone);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    out.println("<h3>Data inserted successfully!</h3>");
                } else {
                    out.println("<h3>Failed to insert data!</h3>");
                }
                stmt.close();
                con.close();
            } else {
                out.println("<h3>Connection not established!</h3>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h3>Database operation failed!</h3>");
        }
    }
}
