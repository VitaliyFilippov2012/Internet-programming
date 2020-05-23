package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class L2 implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(final HttpSessionBindingEvent event) {
        System.out.println("Listener: attributeAdded: attributeID = " + event.getSession().getId());
        System.out.println("Listener: attributeAdded: attributeName = " + event.getName());
        System.out.println("Listener: attributeAdded: attributeValue = " + event.getValue());
    }

    @Override
    public void attributeRemoved(final HttpSessionBindingEvent event) {
        System.out.println("Listener: attributeRemoved: attributeID = " + event.getSession().getId());
        System.out.println("Listener: attributeRemoved: attributeName = " + event.getName());
        System.out.println("Listener: attributeRemoved: attributeValue = " + event.getValue());
    }

    @Override
    public void attributeReplaced(final HttpSessionBindingEvent event) {
        System.out.println("Listener: attributeReplaced: attributeID = " + event.getSession().getId());
        System.out.println("Listener: attributeReplaced: attributeName = " + event.getName());
        System.out.println("Listener: attributeReplaced: attributeValue = " + event.getValue());
    }
}
