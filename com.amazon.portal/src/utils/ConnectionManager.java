package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

	private static Connection connection = null;
	private ConnectionManager()
	{


	}

	public static Connection getConnection()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uname="hr";
		String pwd="hr";
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url,uname,pwd);
			System.out.println(connection.toString());
			return connection;
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();;
		}
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
		return connection;
		
		
	}

	
	public static void main(String args[])
	{
		connection=getConnection();
		System.out.println(connection);
	}
}
