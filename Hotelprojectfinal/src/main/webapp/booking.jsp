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
	<form action="<%=request.getContextPath()%>/booking" method="post">
		<input type="hidden" name="action" value="register">
		<div align="Center">
			<h2 style="font-style: italic;">
				Welcome to <span style="color: red; font-style: italic;">MakeMyTrip</span>
				Booking Page
			</h2>
			<table border="1" cellspacing="10" style="border-color: red;">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<td>Location</td>
					<td><select name="location">
							<option value="Mumbai">Mumbai</option>
							<option value="Goa">Goa</option>
							<option value="Delhi">Delhi</option>
							<option value="Chennai">Chennai</option>
							<option value="Punjab">Punjab</option>
					</select></td>
				</tr>
				<tr>
					<td>Hotel</td>
					<td><select name="hotel">
							<option value="Sahara Star">Sahara Star</option>
							<option value="JW Marriot">JW Marriot</option>
							<option value="The Lalit">The Lalit</option>
							<option value="Sunshine">Sunshine</option>
							<option value="Taj">Taj</option>
					</select></td>
				</tr>
				<tr>
					<td>Stay</td>
					<td><input type="text" name="stay"></td>
				</tr>
				<tr>
					<td>Guest</td>
					<td><input type="text" name="guest"></td>
				</tr>
				<tr>

					<td><button>submit</button></td>
					<td><a href="signup.jsp">Back to signup</a></td>
				</tr>
				<tr>
			</table>
		</div>
	</form>

</body>
</html>