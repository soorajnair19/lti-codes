package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Application Lifecycle Listener implementation class ListenersContext
 *
 */
public class ListenersContext implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenersContext() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent contextevent)  { 
         // TODO Auto-generated method stub
    	
    	contextevent.getServletContext().setAttribute("last_username", "oracle");
    			
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	sce.getServletContext().setAttribute("username", "srj");
    }
	
}
