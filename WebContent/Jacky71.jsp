<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>
   pageContext.setAttribute("name", "Jacky");
  c 輸出的動作，其值value =	
  <c:out value="Hello World"></c:out> <br>
  <%
   pageContext.setAttribute("name", "<h1>Jacky</h1>");
  %>
    1  <%=pageContext.getAttribute("name") %><br>
    2 <c:out value="${name}"></c:out> <br>
    3 <c:out value="${name1}" default="nobody"></c:out> <br>
     
  
</body>
</html>