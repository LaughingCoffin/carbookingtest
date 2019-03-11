<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
	border: 1 px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="CarController">
		<table>
			<tr>
				<td><center>Name</center></td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td><center>Email</center></td>
				<td><input type="email" id="email" name="email"></td>

			</tr>
			<tr>
				<td><center>Password</center></td>
				<td><input type="password" id="password" name="password"></td>

			</tr>

		</table>
		<input type="submit" value="Submit" />
	</form>

</body>
</html>