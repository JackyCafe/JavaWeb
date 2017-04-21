<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="Jacky77.jsp"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>
	 Header <hr>
	  <c:import url="Jacky77.jsp"></c:import><hr>
<%-- 	  <c:import url="https://tw.yahoo.com">
	  </c:import>
	   --%>
	 <c:import url="Jacky79.jsp?x=100&y=33">
	<%-- <c:param name="x" value="10" />
	<c:param name="y" value="3" /> --%>
</c:import>
	   	 <hr>
	   
	 Fooder<hr>
	 
</body>
</html>