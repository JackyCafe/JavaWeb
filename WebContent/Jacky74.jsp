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
	<c:if test='${param.name =="admin"}'>
test	</c:if>

<c:if test='${param.name =="admin"}' var="test1" />
<c:if test='${3<10}' var="test2" />
<c:if test="${test1 and test2}">ok</c:if>

 </body>
</html>