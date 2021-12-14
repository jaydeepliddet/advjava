<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="sidebar.jsp"></jsp:include>
	<div align="center">
		<h2 style="font-style: italic;">
			Welcome to <span style="color: red; font-style: italic;">MakeMyTrip</span>
			Login Page
		</h2>
	</div>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<input type="hidden" name="action" value="register">
		<div align="Center">
			<table border="1" cellspacing="10" style="border-color: red;">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"></td>
				</tr>

				<tr>

					<td><button  onclick="booking.jsp">Login</button>
					
						</td>
						<td><a href="signup.jsp">Back to signup</a></td>
				</tr>
				<tr>
			</table>
		</div>
</body>
</html>