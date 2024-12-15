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
	
		<p class="adminpdetailstitle"> All Guide Details </p>
		<hr class="adminphrhead">
		
		<table class="adminpTables" border="1px solid black">
			<tr>
			<th class="adminpTableshead">Guide-ID</th>
			<th class="adminpTableshead">Name</th>
			<th class="adminpTableshead">Contact</th>
			<th class="adminpTableshead">Email</th>
			<th class="adminpTableshead">Password</th>
			<th class="adminpTableshead">For Edit</th>
			<th class="adminpTableshead">Delete</th>
			</tr>
			
			<div class="adminpbtnedtndel">
				
				<c:forEach var="add" items="${guideTable}">
					<tr>
						<td>${add.guideId}</td>
						<td>${add.guideName}</td>
						<td>${add.guideContact}</td>
						<td>${add.guideEmail}</td>
						<td>${add.guidePass}</td>
						
						<td>
							<form action="editGuide" method="POST">
								<input type="hidden" name="guideEmail" value="${add.guideEmail}">
								<button type="submit" class="editntn">View</button>
							</form>
						</td>
						
						<td>
							<form action="deleteGuide" method="POST">
								<input type="hidden" name="guideEmail" value="${add.guideEmail}">
								<button type="submit" class="editntn">Delete</button>
							</form>
						</td>
						
					</tr>
				</c:forEach>
			
			</div>
		</table>
		
	</div>
	
	<ul class="adminplist">
		<li class="adminpitem"> <center><img class="adminplink" src="styles\images\bestwayguiderslogo.png" alt="Logo" width="50%" height="50%"></center> </li>
		<li class="adminpitem"> <a class="adminplink" href="adminregister.jsp"> Admin's </a> </li>
		<li class="adminpitem"> <a class="adminplink" href="guideregister.jsp"> Guide's </a> </li>
		<li class="adminpitem"> <a class="adminplink" href="home2.jsp"> Back to Home </a> </li>
		
		<li class="adminpitem"> <a class="adminplink" href="#"> Log Out </a> </li>
	</ul>
	
</body>
</html>