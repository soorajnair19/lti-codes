package HeaderNames;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlets
 */
@WebServlet("/servlets")
public class servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<String, String> map = new HashMap<>(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> headernames=request.getHeaderNames();
		while(headernames.hasMoreElements())
		{
			String headername=headernames.nextElement();
			String headervalue=request.getHeader(headername);
			map.put(headername,headervalue);
			
		}
		request.setAttribute("map_of_headers", map);
		request.getRequestDispatcher("header.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
