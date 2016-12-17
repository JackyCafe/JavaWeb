<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
 errorPage="eoorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

<%
	String x =request.getParameter("x");
	String y =request.getParameter("y");
	int result =0;
	if (x!=null && y!=null)
		result = Integer.parseInt(x)+Integer.parseInt(y);

%>
 <form action="">
 	<input type="text" name ="x"  /> + 
 	<input type="text" name ="y"  /> = 
 	<input type="submit" name ="result" value="=" /> <%=result %>
 	 
 
 
 
 </form>

</body>
</html>