package com.hotel.signup.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class LoginDao{
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet result=null;
	boolean done=false;
	String user;
	String pass;
	String user3;
	String user4;
	
	
	public boolean register(String user,String pass) throws ClassNotFoundException, SQLException{
	

	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
	
	
	
	try
	{
	if(con!=null)
	{
		pstmt=con.prepareStatement("Select * from signup where username=? and password=?");
		
		pstmt.setString(1, user);
		pstmt.setString(2, pass);
		
		
		
		
		 result=pstmt.executeQuery();
		 
		 if(result.next())
		 {
			 return true;
		 }
			 
	}
	if(pstmt!=null)
	{
		System.out.println("You Successfully Signed In");
	}
	else
	{
		System.out.println("details are not inserted");
	}
	}
	catch(SQLException ex)
	{
		ex.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		
			if(pstmt!=null)
			{
				pstmt.close();
			}
			
			if(con!=null)
			{
				con.close();
			}
			
		
	}
	return false;
	
	
	
	
}
	
}
