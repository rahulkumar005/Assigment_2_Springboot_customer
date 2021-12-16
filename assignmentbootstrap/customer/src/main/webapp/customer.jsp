<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="customer.css">

<title>customer home page</title>
</head>
<body bgcolor="powderblue">
	<form action="customer" method="post">

		<ul>
			<li class="dropdown">
			<a href="/customer/customer" class="dropbtn">Customer Home</a>
				<div class="dropdown-content">
					<a href="/customer/save">Add customer</a> <a
						href="/customer/delete">Delete customer</a> <a
						href="/customer/update">Update customer</a> <a
						href="/customer/search">Search customer</a>
				</div>
			</li>
			<li class="dropdown">
			<a href="/customer/customer" class="dropbtn">News</a>
				<div class="dropdown-content">
					<a href="https://www.indiatoday.in/news.html">India Today</a> <a
						href="https://www.aajtak.in/">AajTak</a> <a
						href="https://www.hindustantimes.com/">Hindustan Times</a> <a
						href="https://indianexpress.com/todays-paper/">The Indian Express</a>
				</div></li>
		</ul>

	</form>
</body>
</html>