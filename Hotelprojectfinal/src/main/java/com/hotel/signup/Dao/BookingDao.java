package com.hotel.signup.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hotel.signup.model.booking;

public class BookingDao {

	
	public int register(booking b) throws ClassNotFoundException, SQLException{
		
		Connection con=null;
		PreparedStatement pstmt=null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
		int result=0;
		try
		{
		if(con!=null)
		{
			pstmt=con.prepareStatement("insert into booking values(BookingId,id,?,?,?,?,?,?)");
			pstmt.setString(1, b.getUsername());
			pstmt.setString(2, b.getDate());
			pstmt.setString(3,b.getLocation());
			pstmt.setString(4,b.getHotel());
			pstmt.setInt(5,b.getStay());
			pstmt.setInt(6,b.getGuest());
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
