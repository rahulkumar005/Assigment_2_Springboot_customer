<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<c:forEach var="list" items="${customer2 }">		
		<tr>
			<td>${list.custeno}</td>
			<td>${list.name}</td>
			<td>${list.country}</td>
			<td>${list.state}</td>
			<td>${list.city}</td>
			<td>${list.phoneno}</td>
			<td>${list.created_by}</td>
			<td>${list.created_on}</td>
		</tr>
</c:forEach>
	</table>
	<b>customer deleted successfully!</b>
	<br>
	<a href="customer">GoTo <b>customer</b></a>
</body>
</html>