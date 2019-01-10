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

import model.User;



@WebServlet({ "/LoginServlet", "/login" })
public class Registration extends HttpServlet {

	
	private static Connection con;
	//private static PreparedStatement stmt;
	private static PreparedStatement ps;

	//private static ResultSet rs;
	private static RequestDispatcher rd;
	private String sql = "insert into users values (?,?)";
	
	
	
	public Registration() {
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException
	{
		con= ConnectionManager.getConnection();

		
		try {
			ps=con.prepareStatement(sql);

		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String pwd2 = request.getParameter("password2");
		
		//stmt.setString(1,uname);
		//stmt.setString(2,pwd);
		
	//	int retval=stmt.executeUpdate();

		PrintWriter out = null;
		if(pwd.equals(pwd2))
		{
			User user = new User(uname, pwd);
			
			ps.setString(1,uname);
			ps.setString(2, pwd);
			
			int retval = ps.executeUpdate();
			if(retval==1)
			{
				response.setContentType("text/html");
				out = response.getWriter();
				out.println("You have successfully registered");
				
				rd=request.getRequestDispatcher("index.jsp");
				rd.include(request,response);
			
			}
			else
			{
				System.out.println("Enter same password");
			}
			
			
	
			}
		else
		{	
			out.println("Registration Error");
			
			rd=request.getRequestDispatcher("Regform.jsp");
			rd.include(request,response);
			
		}
		
		}
		
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
		
		
		
	}

	
	
}
