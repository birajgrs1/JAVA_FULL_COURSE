package forMyOwnPractice.seventh_sem_lab_all.lab8;

import javax.servlet.http.HttpServlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display the submitted data
        out.println("<html><body>");
        out.println("<h1>Form Submission Details</h1>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Message:</strong> " + message + "</p>");
        out.println("</body></html>");
    }
}
