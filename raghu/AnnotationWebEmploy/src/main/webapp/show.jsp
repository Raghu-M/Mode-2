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
<center><table style="font-family: Verdana, Arial, Sans-Serif; font-size:small; ">
	<tr bgcolor="#2873C4" style="color: white"><th>Empno</th>
		<th>Name</th>
		<th>DepartMent</th>
		<th>Designation</th>
		<th>Salary</th>
		<th>Update</th>
		<th>Delete</th></tr><tr  bgcolor="yellow">
  <% 
  int a=1;
for(Object ob: new MainProg().show()){
			if(a%2==0){ 
				%> <tr bgcolor="#D0D6F5"> <%
			} else {
				%> <tr bgcolor="#EDEFF9"> <%
			}
			Employ e = (Employ)ob;%>
			<td><%=e.getEmpno()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getDept() %></td>
			<td><%= e.getDesig()%></td>
			<td><%=e.getBasic()%></td>
			<td><a href="UpdateEmp.jsp?empno=<%=e.getEmpno()%>">Update</a> </td>
			<td><a href="DeleteEmp.jsp?empno=<%=e.getEmpno()%>">Delete</a> </td></tr>
			<% a++; } %>
			<tr bgcolor="#2873C4"><td colspan="7"><center> <a href ="InsertEmp.jsp" ><input type="button" value="Insert" /> </a></center></td></tr>
</table>
</center>
</body>
</html>