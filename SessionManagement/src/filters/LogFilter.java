package filters;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String un = req.getParameter("username");
		String pw = req.getParameter("password");

		String host = req.getRemoteHost();
		String uri = req.getRequestURI();
		
		long time = System.currentTimeMillis();
		Date d1= new Date(time);
		System.out.println("values are"+host+uri+time+d1);
		
		if(un.equals("sooraj")&& pw.equals("sooraj"))
		chain.doFilter(request, response);
		
		
		else
			response.getWriter().println("Access denied");
			req.getRequestDispatcher("index.jsp").forward(request, response);
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
