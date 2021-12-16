<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>retrieved data</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>Name</th>
			<th>phone</th>
			<th>country</th>
			<th>state</th>
			<th>city</th>
		</tr>
		<c:forEach var="list" items="${list }">
			<tr>
				<td>${list.name }</td>
				<td>${list.phoneno }</td>
				<td>${list.country }</td>
				<td>${list.state }</td>
				<td>${list.city }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="customer">GoTo <b>customer</b></a>
</body>
</html>