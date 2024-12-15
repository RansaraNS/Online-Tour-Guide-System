<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title> Admin Panel </title>
	<link rel="stylesheet" href="styles/adminpanelcss.css">
</head>
<body class="adminpbody">

	<div class="adminpmain" style="float:right">
	
		<p class="adminpdetailstitle"> All Admin Details </p>
		<hr class="adminphrhead">
		
		<table class="adminpTables" border="1px solid black">
			<tr>
			<th class="adminpTableshead">Admin-ID</th>
			<th class="adminpTableshead">Name</th>
			<th class="adminpTableshead">Contact</th>
			<th class="adminpTableshead">Email</th>
			<th class="adminpTableshead">Password</th>
			
			</tr>
			
			<div class="adminpbtnedtndel">
				
				<c:forEach var="add" items="${adminTable}">
					<tr>
						<td>${add.adminId}</td>
						<td>${add.adminName}</td>
						<td>${add.adminContact}</td>
						<td>${add.adminEmail}</td>
						<td>${add.adminPass}</td>

					</tr>
				</c:forEach>
			
			</div>
		</table>
		
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