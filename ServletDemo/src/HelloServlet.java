import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");

        // Create writer
        PrintWriter out = response.getWriter();

        // Display output
        out.println("<html>");
        out.println("<head><title>Servlet Demo</title></head>");
        out.println("<body>");
        out.println("<h1>Hello! Welcome to Java Servlet</h1>");
        out.println("<p>This is my first Servlet program.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
