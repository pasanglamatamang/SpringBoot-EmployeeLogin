
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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.0/css/font-awesome.min.css">
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
<a class= "back-btn-link-color" href="login"><button class="btn-back2"><div class = "loginSignupBack2"> &#10005; Logout</div></button></a>
</div>


</div>   

		<table class="table">
			<thead>
				<tr>
			        <th><font color="#F3A83B">Id</font></th>
					<th><font color="#F3A83B">Name<a href="SortAsc?employeeName=${AscEmpName.employeeName}"><button class="sort-btn">Sort: <div class="sortImg"><img src="<c:url value="/resources/images/sort-alpha-down-solid.svg"/>"> </div></button> </a></font></th>
					<th><font color="#F3A83B">Email<a href="SortDesc?employeeName=${AscEmpName.employeeName}"><button class="sort-btn">Sort: <div class="sortImg"><img src="<c:url value="/resources/images/sort-alpha-down-alt-solid.svg"/>"> </div></button> </a></font></th>
					<th><font color="#F3A83B">Password</font></th>
					<th><font color="#F3A83B">Salary</font></th>
					<th><font color="#F3A83B">Photo</font></th>
					<th><font color="#F3A83B">Action</font></th>    
					
				</tr>
			</thead>
			<tbody>
			
			<c:forEach items="${employeeDTOList}" var="allEmp">
					<tr>
					    <td><font color="#1A1D1F">${allEmp.employeeId}</font></td>
						<td><font color="#1A1D1F">${allEmp.employeeName}</font></td>
						<td><font color="#1A1D1F">${allEmp.emailId}</font></td>
						<td><font color="#1A1D1F">${allEmp.password}</font></td>
						<td><font color="#1A1D1F">${allEmp.salary}</font></td>
						<td><font color="#1A1D1F"><img src="data:image/jpeg;base64,${allEmp.photo}" style="height:120px;"></font></td>
						
						<td><font color="#ffffff"><a href="editEmployee?employeeId=${allEmp.employeeId}"><button class="update-btn">Edit</button></a> 
						
						<a href="deleteEmployee?employeeId=${allEmp.employeeId}" ><button  class="delete-btn">Delete</button></a>
					
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>
