<%@page import="com.hcl.employ.Employ"%>
<%@page import="com.hcl.employ.MainProg"%>
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
	Enter empno :
	<input type="text" name="empno" />
	<input type="submit" value="Search" /><br><br><br><br>
	</form>
	
	
	
  <% 
  	if(request.getParameter("empno") != null){
  		
  		%><table border="1">
			<tr><th>Empno</th>
			<th>Name</th>
			<th>DepartMent</th>
			<th>Designation</th>
			<th>Salary</th></tr><tr><%
		
 	int empno = Integer.parseInt(request.getParameter("empno"));
			Employ e = new MainProg().searchEmp(empno);%>
			<td><%=e.getEmpno()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getDept() %></td>
			<td><%= e.getDesig()%></td>
			<td><%=e.getBasic()%></td></tr>
			<%} %>
</table>
</center>
</body>
</html>