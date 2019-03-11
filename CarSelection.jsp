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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Select a Car To Book</h1>

	<form method="get" action="BookingController">
		<table>
			<tr>
				<label> <input type="radio" name="car" value="etios"
					> 
					<img src="D:\workspace\carbookingtest/nexa.jpg">
				</label>

				<label> <input type="radio" name="car" value="nexa" >
					<img src="D:\workspace\carbookingtest/toyota_etios.jpg">
				</label>
		</table>
		<input type="submit" value="Submit" />
	</form>

</body>
</html>