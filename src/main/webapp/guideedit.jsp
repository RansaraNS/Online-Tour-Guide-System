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
	
			<p class="adminpdetailstitle"> Edit Guide Information </p>
			<hr>
			
			<form class="adminpdetails" method="POST" action="updateGuide">
			
				<p class="adminpftitle"> Name: </p>
				<input class="adminpdetailsbar" type="text" name="guideName" value="${param.guideName}" required> 
				
				
				<p class="adminpftitle"> Contact: </p>
				<input class="adminpdetailsbar" type="text" name="guideContact" value="${param.guideContact}" required> 
				
				<p class="adminpftitle"> Email: </p>
				<input class="adminpdetailsbar" type="email" name="guideEmail" value="${param.guideEmail}" required> 
				
				
				<p class="adminpftitle"> Password: </p>
				<input class="adminpdetailsbar" type="text" name="guidePass" value="${param.guidePass}" required> 
				
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