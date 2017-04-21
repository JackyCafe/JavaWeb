<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

 <jsp:useBean id="member" class="tw.Jacky.j2ee.Member" /> 
 <jsp:setProperty  name="member" property="id" value ="001"/>  
 <jsp:setProperty  name="member" property="name" value="${param.name } "/>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>
不寫value innerHTML
<c:set var="salary" scope="page" >${2000*2} </c:set> 
<c:set var="salary" scope="request" value="${2000*2}"/>
<c:set var="salary" scope="session" value="${2000*2}"/>
<c:set var="salary" scope="application" value="${2000*2}"/>

page : <c:out value="${pageScope.salary}"/> <br>
request: <c:out value="${requestScope.salary}"/><br>
session:<c:out value="${sessionScope.salary}"/><br>
application: <c:out value="${applicationScope.salary}"/><br>
 
 target 要用ＥＬ的寫法, javabean<br>
 <c:set target="${member}"  property="name" value="${param.name}" ></c:set>
 <c:out value="${member.name }"></c:out>
</body>
</html>