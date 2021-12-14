package com.hotel.signup.servlet;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.signup.Dao.SignupDao;
import com.hotel.signup.model.signup;


@SuppressWarnings("serial")
@WebServlet("/register")
public class SignupServlet extends HttpServlet {
	
	private SignupDao sd=new SignupDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher req=request.getRequestDispatcher("signup.jsp");
		req.forward(request, response);
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String location=request.getParameter("location");
		String pincode=request.getParameter("pincode");
		
		signup sg=new signup();
		
		sg.setUsername(username);
		sg.setEmail(email);
		sg.setPassword(password);
		sg.setPhoneno(phoneno);
		sg.setLocation(location);
		sg.setPincode(pincode);
		
		try {
			sd.register(sg);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		PrintWriter pw=response.getWriter();
		
//		String htmlRespone = "<html>";
//		htmlRespone += "<h2>Your username is: " + username + "</h2>";
//		htmlRespone += "</html>";
//		 
//		pw.println(htmlRespone);
		
		RequestDispatcher req=request.getRequestDispatcher("success.jsp");
		req.forward(request, response);
	}

}
