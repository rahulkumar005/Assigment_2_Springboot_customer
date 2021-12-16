
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
			<th>Phone No</th>
			<th>Country</th>
			<th>State</th>
			<th>City</th>
			<th>Updated By</th>
			<th>Updated On</th>
		</tr>
		<tr>
			<td>${customer.custeno}</td>
			<td>${customer.name }</td>
			<td>${customer.phoneno}</td>
			<td>${customer.country}</td>
			<td>${customer.state}</td>
			<td>${customer.city}</td>
			<td>${customer.updated_by}</td>
			<td>${customer.updated_on}</td>
		</tr>
	</table>

<b>customer updated successfully!</b><br>
	<a href="customer">GoTo<b>customer</b></a>
</body>
</html>