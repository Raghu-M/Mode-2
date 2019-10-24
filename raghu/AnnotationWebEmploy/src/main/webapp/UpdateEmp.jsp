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
<%
	int empno =  Integer.parseInt(request.getParameter("empno"));
	Employ emp = new MainProg().searchEmp(empno);
	
%>
<form>
<table  bgcolor="#2873C4">
	<tr>
		<td>Empno</td>
		<td><input type="text" name="empno" value=<%=emp.getEmpno() %> readonly="readonly"/>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="name" value=<%=emp.getName() %> readonly="readonly"/>
	</tr>
	<tr>
		<td>Department</td>
		<td><input type="text" name="dept" value=<%=emp.getDept()%> />
	</tr>
	<tr>
		<td>Designation</td>
		<td><input type="text" name="desig" value=<%=emp.getDesig() %> />
	</tr>
	<tr>
		<td>Salary</td>
		<td><input type="text" name="basic" value=<%=emp.getBasic() %> />
	</tr>
	<tr>
		<td colspan="2"><input type="submit" Value="Update" />
	</tr>
</table><br><br><br>
</form>

<%
	if(request.getParameter("basic") != null){
		Employ ob = new Employ();
		ob.setEmpno(Integer.parseInt(request.getParameter("empno")));
		ob.setName(request.getParameter("name"));
		ob.setDept(request.getParameter("dept"));
		ob.setDesig(request.getParameter("desig"));
		ob.setBasic(Integer.parseInt(request.getParameter("basic")));
		%> 
		<%= new MainProg().updateEmp(ob)%>
		<jsp:forward page="show.jsp"></jsp:forward>
		<%}%>
</center>

</body>
</html>