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

	<h1 align="center" style="color: Red; font-style: italic;">Register </h1>
<br>

	<form name="valid" action="<%=request.getContextPath()%>/register" method="post" >
		<input type="hidden" name="action" value="register">
		<div align="Center">
			<table border="1" cellspacing="10" style="border-color: red;">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>


				<tr>
					<td>PhoneNo</td>
					<td><input type="text" name="phoneno"></td>
				</tr>

				<tr>
					<td>Location</td>
					<td><input type="text" name="location"></td>
				</tr>
				<tr>
					<td>Pincode</td>
					<td><input type="text" name="pincode"></td>
				</tr>


				<tr>
					<td><button onclick="success.jsp">Login</button></td>
					<td><input type="submit" value="Submit" name="signup" >
					</td>
					

				</tr>

				<tr>
			</table>
		</div>
	</form>
</body>

</html>