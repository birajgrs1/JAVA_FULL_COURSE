import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
public class FormApp extends HttpServlet 
{ 
 public void doGet(HttpServletRequest req, HttpServletResponse res) throws 
IOException, ServletException 
 { 
  res.setContentType("text/html"); 
  PrintWriter out = res.getWriter(); 
  String name = req.getParameter("name"); 
  String salary = req.getParameter("salary"); 
  String phone = req.getParameter("phone"); 
  out.println("<html><head><title> Hello</title></head>"); 
  out.println("<body>Welcome!!!"); 
  out.println("<br>Name: " + name + "<br> Salary: " + salary + 
"<br>Phone:" + phone );  
  out.println("</body></html>"); 
   
  out.close(); 
 } 
} 