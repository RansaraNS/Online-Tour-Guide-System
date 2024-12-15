<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title> Admin Panel </title>
	<link rel="stylesheet" href="styles/adminpanelcss.css">
</head>
<body class="adminpbody">

	<div class="adminpmain" style="float:right">
	
		<p class="adminpdetailstitle"> Guide Registration Form </p>
		<hr>
		
		<form action="viewGuide" method="POST">
			<button type="submit"  class="admintablebtn"> View All Guide's </button>
		</form>
		
		<form class="adminpdetails" method="POST" action="addGuide">
			<p class="adminpftitle"> Name: </p>
			<input class="adminpdetailsbar" type="text" name="guideName" placeholder="Enter Guide Name" required> 
			
			
			<p class="adminpftitle"> Contact: </p>
			<input class="adminpdetailsbar" type="text" name="guideContact" pattern="[0-9]{10}" placeholder="Enter Guide Contact" required>  
			
			<p class="adminpftitle"> Email: </p>
			<input class="adminpdetailsbar" type="email" name="guideEmail" placeholder="Enter Guide Email" required> 
			
			
			<p class="adminpftitle"> Password: </p>
			<input class="adminpdetailsbar" type="password" name="guidePass" placeholder="Enter Guide Password" required> 
			
			<br>
			<input class="adminpregbtn" type="submit" value="Save">
			
		</form>
	</div>
	
	<ul class="adminplist">
		<li class="adminpitem"> <center><img class="adminplink" src="styles\images\bestwayguiderslogo.png" alt="Logo" width="50%" height="50%"></center> </li>
		<li class="adminpitem"> <a class="adminplink" href="adminregister.jsp"> Add Admin </a> </li>
		<li class="adminpitem"> <a class="adminplink" href="guideregister.jsp"> Add Guide </a> </li>
		<li class="adminpitem"> <a class="adminplink" href="home2.jsp"> Back to Home </a> </li>
		
		<li class="adminpitem"> <a class="adminplink" href="#"> Log Out </a> </li>
	</ul>

</body>
</html>