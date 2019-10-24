<%@page import="java.sql.Date"%>
<%@page import="com.hcl.hotel.Booking"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hotel.HotelDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script >

function sub(){
	var e = document.getElementById("rid");
	var sub = e.options[e.selectedIndex].text;
	if(sub != "Select Room"){
		if(document.getElementById("cnameid").value != ""){
			if(document.getElementById("cityid").value != ""){
				document.bookroom.submit();
			}else{
				alert("Please Enter City");
			}
		}else{
			alert("Please Enter Customer Name");
		}
		
	} else{
		alert("Please Select Room");
	}
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<form name="bookroom">
<%
	String Bid = new HotelDao().generateBookId();
	List<String> list = new HotelDao().getBookId();
%>
<table>
	<tr>
		<td>Book ID</td>
		<td><input type="text" name="bookid" id="bid" value=<%=Bid %> readonly="readonly"/>
	</tr>
	<tr>
		<td>Select Room</td>
		<td><select name="rooms" id="rid">
			<option value="none" selected disabled hidden>Select Room</option> 
			<%for(String i : list) {%>
				<option><%=i%></option><%} %>
		</select>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td><input type="text" name="cname" id="cnameid" />
	</tr>
	<tr>
		<td>City</td>
		<td><input type="text" name="city" id="cityid"/>
	</tr>
	<tr>
		<td><input type="button" value="BooK Room" onclick="sub()"/>
	</tr>
</table>
</form><br><br><br><br>

<%
	if(request.getParameter("city") != null){
		Booking ob = new Booking();
		ob.setRoomID(request.getParameter("rooms"));
		ob.setCustName(request.getParameter("cname"));
		ob.setCity(request.getParameter("city"));
		%><%= new HotelDao().bookRoom(ob) %>
<%
	}
%>
</center>

</body>
</html>