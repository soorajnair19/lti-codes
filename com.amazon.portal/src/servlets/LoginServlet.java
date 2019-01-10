package servlets;
import utils.ConnectionManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private   static final long serialVersionUID = 1L;
	private static Connection con;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	private static RequestDispatcher rd;
	private String sql = "select * from users where username=? and password=? ";
	
	
	
	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException
	{
		con= ConnectionManager.getConnection();

		
		try {
			stmt=con.prepareStatement(sql);

		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		stmt.setString(1,uname);
		stmt.setString(2,pwd);
		rs=stmt.executeQuery();

		if(rs.next())
		{
			request.setAttribute("req_user", uname);
			rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request,response);
			
			}
		else
		{	
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request,response);
		}
		
		}
		
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
		
		
		
	}

	
	
}
