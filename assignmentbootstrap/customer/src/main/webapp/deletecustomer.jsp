<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body style="background-color: powderblue;">
	<form action="delete" method="post">
	<h2>Delete Customer </h2>
	<hr>
		<table>
			<tr>
				<td><label>Customer ID</label></td>
				<td><input type="text" name="custeno" /></td>
			</tr>

			<tr>
				<td>
					<button type="submit">Delete</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>