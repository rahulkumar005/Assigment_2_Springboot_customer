<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>update customer page</title>
</head>
<body style="background-color: powderblue;">
	<form action="update" method="post">
		<h2>Update Customer</h2>
		<hr>
		<table>
			<tr>
				<td><label>Customer ID:</label></td>
				<td><input type="text" name="custeno" /></td>
			</tr>
			<tr>
			<td><label>Customer Name:</label></td>
			<td><input type="text" name="name"/></td>

			<tr>
				<td><label>Phone No:</label></td>
				<td><input type="text" name="phoneno" /></td>
			</tr>
			<tr>
				<td><label>Country:</label></td>
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
				<td><label>State:</label></td>
				<td><select id="state" name="state"></select></td>
			</tr>
			<tr>
				<td><label>City:</label></td>
				<td><input type="text" name="city" /></td>
			</tr>

			<tr>
				<td><label>Updated By:</label></td>
				<td><input type="text" name="updated_by" /></td>
			</tr>
			<tr>
				<td><label>Updated On:</label></td>
				<td><input type="date" name="updated_on" /></td>
			</tr>
			<tr>
				<td><button type="submit">Update Customer</button></td>
			</tr>
		</table>
	</form>

</body>
</html>