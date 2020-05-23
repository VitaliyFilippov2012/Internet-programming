package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class L1 implements ServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        System.out.println("Listener: context init");
    }

    @Override
    public void contextDestroyed(final ServletContextEvent servletContextEvent) {
        System.out.println("Listener: context destroy");
    }
}
