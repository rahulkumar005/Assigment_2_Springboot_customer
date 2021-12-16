<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Country</th>
			<th>State</th>
			<th>City</th>
			<th>Phone No</th>
			<th>Created By</th>
			<th>Created On</th>
		</tr>
		<tr>
			<td>${customer.custeno}</td>
			<td>${customer.name}</td>
			<td>${customer.country}</td>
			<td>${customer.state}</td>
			<td>${customer.city}</td>
			<td>${customer.phoneno}</td>
			<td>${customer.created_by}</td>
			<td>${customer.created_on}</td>
		</tr>
	</table>
	<b>customer added successfully!</b><br>
	<a href="customer.jsp">GoTo <b>customer</b></a>
</body>
</html>