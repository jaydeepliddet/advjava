package com.hotel.signup.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotel.signup.Dao.LoginDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
	 
	   
	   
	   
	   
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username=request.getParameter("username");

		String password=request.getParameter("password");
		
		
		LoginDao ld=new LoginDao();
		try {
			if(ld.register(username, password))
			{
				HttpSession session =request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("booking.jsp");
			}
			else
			{
				response.sendRedirect("success.jsp");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	

	}
}
