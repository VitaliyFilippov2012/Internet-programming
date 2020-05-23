package filters;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import static jspClasses.Constants.*;

public class F1 implements Filter {
    @Override
    public void init(final FilterConfig filterConfig) {
        System.out.println("F1: init");
    }

    @Override
    public void doFilter(final ServletRequest req, final ServletResponse resp,
                         final FilterChain chain) throws IOException, ServletException {
        System.out.println("F1: doFilter");
        if (req.getParameter(VAL_1).equals("1")) {
            final RequestDispatcher res = req.getRequestDispatcher("/jsp/index.jsp");
            req.setAttribute("Block", "Filter F1 blocked servlet " + Ccc_URL);
            res.forward(req, resp);
        } else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {
        System.out.println("F1: destroy");
    }
}
