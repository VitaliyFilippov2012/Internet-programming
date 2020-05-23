import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

public class Aaa extends HttpServlet  implements Servlet {
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        final PrintWriter writer = response.getWriter();
        writer.println("Servlet:SSS");
        writer.flush();
        System.out.println("Servlet:SSS");
    }
}
