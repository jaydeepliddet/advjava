package com.hotel.signup.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.signup.Dao.BookingDao;
import com.hotel.signup.model.booking;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String date=request.getParameter("date");
		String location=request.getParameter("location");
		String hotel=request.getParameter("hotel");
		int stay=Integer.parseInt(request.getParameter("stay"));
		int guest=Integer.parseInt(request.getParameter("guest"));
		
		booking b=new booking();
		b.setUsername(username);
		b.setDate(date);
		b.setLocation(location);
		b.setHotel(hotel);
		b.setStay(stay);
		b.setGuest(guest);
		
		BookingDao bd=new BookingDao();
		
		try {
			bd.register(b);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher req=request.getRequestDispatcher("booked.jsp");
		req.forward(request, response);
		
		
		
	}

}
