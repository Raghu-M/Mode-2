<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="addStudent.hcl" >
<table>
	<tr>
		<td>Roll Number</td>
		<td><input type="text" name="rollno" /></td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><input type="text" name="sname" /></td>
	</tr>
	<tr>
		<td>Age</td>
		<td><input type="text" name="age" /></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="gender" value="Male" />Male<br>
		<input type="radio" name="gender" value="Female" />Female<br>
		<input type="radio" name="gender" value="Other" />Other</td>
	</tr>
	<tr>
		<td>Country</td>
		<td><input type="text" name="country" /></td>
	</tr>
	<tr>
		<td>Date of Join</td>
		<td><input type="date" name="dateOfJoin" /></td>
	</tr>
	<tr>
		<td>Final Score</td>
		<td><input type="text" name="fScore" /></td>
	</tr><tr>
		<td colspan="2"><input type="Submit" value="Insert" ></td>
	</tr>
	
</table>
</form>
</center>
</body>
</html>