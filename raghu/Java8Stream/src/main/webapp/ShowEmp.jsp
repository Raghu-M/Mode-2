<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employ Management Screen</title>

</head>
<body>
	<div align="center">
		<h1>Employ List</h1>
		<form action="searchEmp" method="get">
		<table><tr><td>Employ Name:</td><td>
		<input type="text" name="search"/></td></tr>
		<tr><td>Band:</td><td>
		<input type="text" name="band"/></td></tr>
		<tr><td>Salary Greater than:</td><td>
		<input type="text" name="salary"/></td></tr>
		<tr><td> <input type="submit" value="Search"/></td></tr>
		</table>
		</form><br><br>
		
		<table border="1">

			<th>EMP Num</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Band</th>
			<th>Date Of Join</th>

			<c:forEach var="emp" items="${empList}">
				<tr>

					<td>${emp.empNo}</td>
					<td>${emp.empName}</td>
					<td>${emp.salary}</td>
					<td>${emp.band}</td>
					<td>${emp.dateOfJoin}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>