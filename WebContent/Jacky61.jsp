<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="tw.Jacky.j2ee.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
<%
	Member member = new Member();
	member.setId("001"); member.setName("Brad"); %>
 </head>
<body>
		I am Jacky60
		Welcome, <%= member.getName() %>
		
</body>
</html>