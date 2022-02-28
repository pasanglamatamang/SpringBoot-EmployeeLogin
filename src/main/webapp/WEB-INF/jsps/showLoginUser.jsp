
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/css/signupStyles.css"/>">

<title>Show All Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>



		<div class="container">
	
	<div class="edb-header">
Employee D.B
</div>
	
	<div class="header-form">
	
	
	<div class="goBackButton">
<a class= "back-btn-link-color" href="login"><button class="btn-back"><div class = "loginSignupBack"> &#8592; Login/Signup</div></button></a>
</div>

<div class="goBackButton">
<a class= "back-btn-link-color" href="showAllEmployees"><button class="btn-back3"><div class = "loginSignupBack"> Show All Employees</div></button></a>
</div>

<div class="goBackButton">
<a class= "back-btn-link-color" href="logout"><button class="btn-back2"><div class = "loginSignupBack2"> &#10005; Logout</div></button></a>
</div>


</div>   

		<table class="table">
			<thead>
				<tr>
			  		<th><font color="#F3A83B">Id</font></th>
					<th><font color="#F3A83B">Name</font></th>
					<th><font color="#F3A83B">Email</font></th>
					<th><font color="#F3A83B">Password</font></th>
					<th><font color="#F3A83B">Salary</font></th>
					<th><font color="#F3A83B">Photo</font></th>
					
				</tr>
			</thead>
			<tbody>
					<tr>
					    <td><font color="#1A1D1F">${emp.employeeId}</font></td>
						<td><font color="#1A1D1F">${emp.employeeName}</font></td>
						<td><font color="#1A1D1F">${emp.emailId}</font></td>
						<td><font color="#1A1D1F">${emp.password}</font></td>
						<td><font color="#1A1D1F">${emp.salary}</font></td>
						<td><font color="#1A1D1F"><img src="data:image/jpeg;base64,${emp.photo}" style="height:120px;"></font></td>
						
					
					</tr>
				

			</tbody>
		</table>
	</div>

</body>
</html>
