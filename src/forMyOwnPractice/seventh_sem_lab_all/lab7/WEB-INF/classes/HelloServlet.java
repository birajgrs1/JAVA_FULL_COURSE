import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Hello Biraj</title></head>");
        out.println("<body>");
        out.println("<h2>Welcome Biraj!!!</h2>");
        out.println("</body></html>");
        out.close();
    }
}
