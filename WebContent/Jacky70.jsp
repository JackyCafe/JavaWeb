<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>


<%
	//scope 
	//1. page 
	pageContext.setAttribute("name", "page");
    //2. request
	request.setAttribute("name", "request");
    //3. session 
   	 session.setAttribute("name", "session");
    //4. Application
	 application.setAttribute("name", "application");

%>
Page :${pageScope.name} <br>
Request:${requestScope.name} <br>
Session:${sessionScope.name} <br>
Application:${applicationScope.name} <br>   







</body>
</html>