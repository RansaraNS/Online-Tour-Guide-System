<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Admin Login</title>
	<link rel="stylesheet" href="styles/adminlogincss.css">
	<link rel="stylesheet" href="styles/homecss.css">
</head>
<body class="lgbody">
	<center>
		<form class="lgform" method="post" action="logAdmin">
		
			<br>
			<img class="lgheadimage" src="styles\images\bestwayguiderslogo.png">
			
			<br>
			<p class="lgtitle"> Email:</p> 
			<input class="lgbar" type="text" name="adminEmail" placeholder="Enter your Email" required> <br>
			
			<br>
			<p class="lgtitle"> Password:</p> 
			<input class="lgbar" type="password" name="adminPass" placeholder="Enter your password" required> <br>
			
			<br>
			<button class="lgbtn lgbtnlink"> Log in </button> <br>
			
		</form>
	</center>
		
	<footer>
		<p class="parafooter">
            © 2024 BEST WAY GUIDER'S PLC. ALL RIGHTS RESERVED. <br>
            SOLUTION BY <a class="linkfooter" href="#">S P M C</a> <br>
        </p>
	</footer>
	
</body>
</html>