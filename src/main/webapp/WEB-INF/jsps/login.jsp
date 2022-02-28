<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value="/resources/css/loginStyles.css"/>">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Employee D.B Login Form</title>

</head>
<body>

	<h1>
		<font color="#E9EEFA" size="30px">Employee Login Page</font>
	</h1>

	<br>

	<div class="signupbox">
		<form action="loginPost" method="post">
		
			<h1>Login</h1>
			
			 <div class="input-icons"> 
			
			<label>Email: </label> <i class="fa fa-user icon" style="color:grey"></i>
			<input class="input-field" type="text" name="emailId" placeholder="Type your email"> 
			
			<label>Password: </label> <i class="fa fa-key icon" style="color:grey"></i> 
			
			<input class="input-field" type="password"
				name="password" placeholder="Type your password"> 
				<!-- <label><span class="forgotPasswordStyle">Forgot Password?  </span></label> -->
				<input type="submit" value="Login">
				
			  <h4 align="center">
				<b><font color="red">${loginMsg}</font></b>
				
				
			</h4>
			
			

			<h5>
				<a class="signupLink"href="registrationForm"> Employee Registration?</a>
			</h5>

 <!--  
			<h5>
				<a class="showUsersLink" href="showAllEmployees">Show All
						Employees</a>
			</h5>
			-->
			 
			</div>



		</form>



	</div>




</body>
</html>