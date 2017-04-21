<%@page import="java.util.LinkedList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ taglib uri="http://www.iii.org.tw/Jacky-tag" prefix="j" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>

<body>
	<j:if test="${param.name == 'brad' }">
	doTag(): Hello, Brad
	</j:if>
<%
	LinkedList<String> names = new LinkedList<>();
	names.add("Brad"); names.add("III");; names.add("OK");
	pageContext.setAttribute("names", names);
%>
<j:loop var="name" items="${names }">
Hello, ${name }<br />
</j:loop>

</body>
</html>