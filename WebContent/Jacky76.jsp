<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
<style type="text/css">
	table{
	border-color:#0000FF; border-style:solid;
	}
	th {
		border=1;
		color='yellow';
	}


</style>
</head>
<body>
迴圈
<hr>
	<%
		String[] names={"Brad","Tony","Peter","Jacky","Mary","Kevin"};
		pageContext.setAttribute("names", names);
		pageContext.setAttribute("start", request.getParameter("start"));
		pageContext.setAttribute("end", request.getParameter("end"));
		pageContext.setAttribute("index", request.getParameter("start"));
		pageContext.setAttribute("step", 1);


	%>
	<table border=1; >
	<th>index</th><th>name</th>
	<%int i=0; %>
 	<c:forEach items="${names}" var="name" begin="${start}" end="${end}" >
 	<tr><td>${index }<c:set var="index" value="${index + step }" />

</td>	<td>
 		${name}</td>
 		</tr>
	</c:forEach>
	</table>
</body>
</html>