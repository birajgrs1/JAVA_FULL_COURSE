 import java.io.*; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*; 
@WebServlet("/NameServlet") 
public class NameServlet extends HttpServlet { 
private static final long serialVersionUID = 1L; 
protected void doPost(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException { 
String name = request.getParameter("name"); 
// Creating a session 
HttpSession session = request.getSession(); 
session.setAttribute("name", name); 
// Creating a cookie 
Cookie cookie = new Cookie("name", name); 
cookie.setMaxAge(5); // Cookie will expire after 30 minutes 
response.addCookie(cookie); 
// Sending a success response 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<html><body>"); 
out.println("<h1>Hello, " + name + "!</h1>"); 
out.println("</body></html>"); 
} 
}