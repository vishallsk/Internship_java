import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet")
public class HelloGenericServlet extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {
        
        // Setting the response content type
        response.setContentType("text/html");

        // Getting the PrintWriter to write the response
        PrintWriter pw = response.getWriter();

        // Reading the 't1' parameter from the request
        String s = request.getParameter("t1");

        // Writing the response as HTML content
        pw.println("<h1>Hello, " + (s != null ? s : "Guest") + "</h1>");
        
        // Closing the writer
        pw.close();
    }
}