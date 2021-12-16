<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<script>
function populate(s1,s2){
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	
		
	if(s1.value == "india"){
		
		var optionArray =[
			<c:forEach items="${indiaStates}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} else if(s1.value == "USA"){
		var optionArray =[
			<c:forEach items="${usaStates}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	}
	else if(s1.value == "australia"){
		var optionArray =[
			<c:forEach items="${australiaStates}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		     ,   
		    </c:if>  
		    </c:forEach>  
		];
		
	}
	
	for(var option in optionArray){
		var pair = optionArray[option];
		var newOption = document.createElement("option");
		newOption.value = pair;
		newOption.innerHTML = pair;
		s2.options.add(newOption);
	}
}
</script>
<style type="text/css">
.container {
	padding: 50px;
	background-color: lightblue;
}
</style>
<title>add customer page</title>
</head>
<body style="background-color: powderblue;">
	<form action="save" method="post">
		<h2>Registration Form</h2>
		<hr>
		<table>
			<tr>
				<td><label><b>Customer ID:</b></label></td>
				<td><input type="text" name="custeno" /></td>
			</tr>
			<tr>
				<td><label><b>Customer Name:</b></label></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>

				<td><label><b>Country:</b></label></td>
				<td><select id="country" name="country" class="company"
					onchange="populate(this.id,'state')">
						<option>Select</option>

						<c:forEach var="listValue" items="${countryList}">

							<option>${listValue.countryName}</option>

							<br>
						</c:forEach>


				</select></td>
			</tr>
			<tr>

				<td><label><b>State:</b></label></td>
				<td><select id="state" name="state"></select></td>
			</tr>
			<tr>
				<td><label><b>City:</b></label></td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td><label><b>Phone No:</b></label></td>
				<td><input type="number" name="phoneno" /></td>
			</tr>
			<tr>
				<td><label><b>Created By:</b></label></td>
				<td><input type="text" name="created_by" /></td>
			</tr>
			<tr>
				<td><label><b>Created On:</b></label></td>
				<td><input type="date" name="created_on" /></td>
			</tr>



			<tr>
				<td><button type="submit">Add Customer</button></td>
			</tr>


		</table>
	</form>

</body>
</html>