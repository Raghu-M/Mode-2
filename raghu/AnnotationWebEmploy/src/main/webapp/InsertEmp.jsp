<%@page import="com.hcl.employ.MainProg"%>
<%@page import="com.hcl.employ.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form>
<table  bgcolor="#2873C4">
	<tr >
		<td>Name</td>
		<td><input type="text" name="name" />
	</tr>
	<tr>
		<td>Department</td>
		<td><input type="text" name="dept" />
	</tr>
	<tr>
		<td>Designation</td>
		<td><input type="text" name="desig" />
	</tr>
	<tr>
		<td>Salary</td>
		<td><input type="text" name="basic" />
	</tr>
	<tr>
		<td colspan="2"><input type="submit" Value="Insert" />
	</tr>
</table><br><br><br>
</form>

<%
	if(request.getParameter("basic") != null){
		Employ ob = new Employ();
		ob.setName(request.getParameter("name"));
		ob.setDept(request.getParameter("dept"));
		ob.setDesig(request.getParameter("desig"));
		ob.setBasic(Integer.parseInt(request.getParameter("basic")));
		%> 
		<%= new MainProg().InsertEmp(ob)%> 
		<jsp:forward page="show.jsp"></jsp:forward>
		<%}%>
</center>
</body>
</html>