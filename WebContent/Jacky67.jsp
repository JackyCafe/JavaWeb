<%@page import="java.util.LinkedList"%>
<%@page import="java.util.HashMap"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>
	<% String[] name ={"Jacky","Brad","Peter"};  %>
	<% request.setAttribute("urName", name); %>
	name1 : ${urName[0]} <br>
	name2 : ${urName[1]} <br>
	name3 : ${urName[2]} <br>

<hr>
<%
	HashMap<String,String> data = new HashMap<>();
	data.put("my name", "Brad");
	data.put("passwd.1", "123456");
	data.put("gender", "male");
	request.setAttribute("data", data);
%>


<% 
	LinkedList list = new LinkedList<>();
	


%>


User: ${data["my name"] }<br>
Password: ${data["passwd.1"] }<br>
Gender: ${data["gender"] }<br>
	 
</body>
</html>