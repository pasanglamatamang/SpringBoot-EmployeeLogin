<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/resources/css/loginStyles.css"/>">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Employee Registration Form</title>

</head>
<body>

	<h1>
		<font color="#E9EEFA" size="30px">Employee Edit Page</font>
	</h1>

	<br>

	<div class="signupbox">
		<form action="updateEmployee" method="post">
		
			<h1>Edit</h1>
			
			 <div class="input-icons"> 
			 <label>Id: </label> <i class="fa fa-hashtag icon" style="color:red"></i>
			<input class="input-field" type="text" name="employeeId" value="${employeeDTO.employeeId}" readonly> 
			
			<label>Name: </label> <i class="fa fa-user icon" style="color:grey"></i>
			<input class="input-field" type="text" name="employeeName" value="${employeeDTO.employeeName}" > 
			
			<label>Email: </label> <i class="fa fa-envelope icon" style="color:grey"></i> 
			<input class="input-field" type="text" name="emailId" value="${employeeDTO.emailId}" > 
				<!-- <label><span class="forgotPasswordStyle">Forgot Password?  </span></label> -->
			
			<label>Password: </label> <i class="fa fa-key icon" style="color:grey"></i>
			<input class="input-field" type="text" name="password" value="${employeeDTO.password}">
			
			<label>Salary: </label> <i class="fa fa-dollar icon" style="color:grey"></i>
			<input class="input-field" type="text" name="salary" value="${employeeDTO.salary}">  	
			
			<label>Upload Photo: </label> <i class="fa fa-image icon" style="color:grey"></i>
			<input class="input-field" type="file" name="file" id="file"> 
				
				<input type="submit" value="Update">
				
			  <h4 align="center">
				<b><font color="#1D4FAA">${hh}</font></b>
				
				
				
				
			</h4>
			
			

			<h5>
				<a class="signupLink" href="login"> Employee Login?</a>
			</h5>

			
			</div>



		</form>



	</div>




</body>
</html>