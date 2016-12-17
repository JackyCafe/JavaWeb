<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="member" class="tw.Jacky.j2ee.Member"/> 
 <jsp:setProperty  name="member" property="id" value ="001"/>  
 <jsp:setProperty  name="member" property="name" value="${param.name } "/>
  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style css>
	</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
	
</head>
<body>
<p>Welcome,<jsp:getProperty name="member" property="name" />
<hr>
 <p>Welcome,${member.name} 
</body>
</html>