package com.org.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection con = null ;
	public  static Connection  getConnection(){
	
		try
		{
   Class.forName("oracle.jdbc.driver.OracleDriver");
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mahendra","tiger");
	}
	catch(ClassNotFoundException xe)
		{
		xe.printStackTrace();
		}
	catch(Exception ex)
		{
		ex.printStackTrace();
		}
		return con;
	}

}
