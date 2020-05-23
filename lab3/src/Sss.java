import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class Sss extends HttpServlet implements Servlet 
{
	
    protected void service(final HttpServletRequest rq, final HttpServletResponse rs) throws ServletException, IOException 
    {
        final HttpClient hc = new HttpClient(); 
        final PostMethod pm = new PostMethod("http://a8849e0c.ngrok.io"+ rq.getContextPath() + "/PostExample?press=OK"); 
        final NameValuePair[] parms = { new NameValuePair("firstname", "Vitali"),
        new NameValuePair("lastname", "Ayeee"), 
        new NameValuePair("sex", "male") }; 
        pm.addParameters(parms); 
        hc.executeMethod(pm); 
        if (pm.getStatusCode() == HttpStatus.SC_OK) { 
            final InOutServlet inout = new InOutServlet(rs.getOutputStream(), 
            pm.getResponseBodyAsStream()); 
            inout.perform(); 
        } else
            System.out.println("Sss:service:getStatusCode()=" + pm.getStatusCode()); 
        } 
}