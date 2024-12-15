<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title> Admin Panel </title>
	<link rel="stylesheet" href="styles/adminpanelcss.css">
</head>
<body class="adminpbody">
	
		<div class="adminpmain" style="float:right">
	
			<p class="adminpdetailstitle"> View Guide Information </p>
			<hr>
			
			<form action="viewGuide" method="POST">
				<button type="submit"  class="admintablebtn"> View All Guide's </button>
			</form>
			
			<c:set var="gud" value="${guide}"/>
			
				<p class="adminpftitle"> Name: </p>
				<input class="adminpdetailsbar" type="text" name="guideName" value="${gud.guideName}" readonly> 
				
				<p class="adminpftitle"> Contact: </p>
				<input class="adminpdetailsbar" type="text" name="guideContact" value="${gud.guideContact}" readonly> 
				
				<p class="adminpftitle"> Email: </p>
				<input class="adminpdetailsbar" type="email" name="guideEmail" value="${gud.guideEmail}" readonly> 
				
				<p class="adminpftitle"> Password: </p>
				<input class="adminpdetailsbar" type="password" name="guidePass" value="${gud.guidePass}" readonly> 
			
			
			
			<form action="guideedit.jsp" method="POST">
			
				<input type="hidden" name="guideName" value="${gud.guideName}">
				<input type="hidden" name="guideContact" value="${gud.guideContact}">
				<input type="hidden" name="guideEmail" value="${gud.guideEmail}">
				<input type="hidden" name="guidePass" value="${gud.guidePass}">
			
			<input type="submit" class="admintablebtn" value="Update" style="float:right">
			
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