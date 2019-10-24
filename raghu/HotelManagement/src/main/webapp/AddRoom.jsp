<%@page import="com.hcl.hotel.HotelDao"%>
<%@page import="com.hcl.hotel.Room"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String id= new HotelDao().generateRoomId();
%>
<center>
<form>
<table>
	<tr>
		<td>RoomId</td>
		<td> <input type="text" name="roomid" value=<%=id %> readonly="readonly"/>
	</tr>
	<tr>
		<td>Type</td>
		<td> <select name="type">
				<option>Single</option>
				<option>Double</option>
		</select></td>
	</tr>
	<tr>
		<td>Cost Per Day</td>
		<td> <input type="text" name="cpday" />
	</tr>
	<tr>
		<td>Status</td>
		<td> <input type="text" name="status" value="Available" readonly="readonly"/>
	</tr>
	<tr>
		<td colspan="2"> <input type="submit" value="ADD" />
	</tr>
	
</table>
</form>

<%
	if(request.getParameter("cpday") != null){
		Room ob = new Room();
		ob.setType(request.getParameter("roomid"));
		ob.setStatus(request.getParameter("status"));
		ob.setCostPerDay(Integer.parseInt(request.getParameter("cpday")));
		%><%= new HotelDao().addRoom(ob)%><%
	}
%>
</center>
</body>
</html>