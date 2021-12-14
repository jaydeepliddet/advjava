package com.hotel.signup.Dao;

import java.sql.*;

import com.hotel.signup.model.signup;

public class SignupDao {
	
	public int register(signup sign) throws ClassNotFoundException, SQLException{
	
	Connection con=null;
	PreparedStatement pstmt=null;

	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
	int result=0;
	try
	{
	if(con!=null)
	{
		pstmt=con.prepareStatement("insert into signup values(id,?,?,?,?,?,?)");
		pstmt.setString(1, sign.getUsername());
		pstmt.setString(2,sign.getPassword());
		pstmt.setString(3,sign.getEmail());
		
		pstmt.setString(4,sign.getPhoneno());
		pstmt.setString(5,sign.getLocation());
		pstmt.setString(6,sign.getPincode());
		
		 result=pstmt.executeUpdate();
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
	return result;
	
	
	
	}
}
