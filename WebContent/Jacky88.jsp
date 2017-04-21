<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix ="sql" %>

 <sql:setDataSource  dataSource="jdbc:mysql:localhost/iii,com.mysql.jdbc.Driver,root,root"/>
 
 <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/iii" user="root" password="root"
var ="iii" scope="session"/>  

<sql:query var="result" sql="select * from member" dataSource="${iii}"/>
<sql:update dataSource="${iii}" var="n" 
sql="Insert into member (account,passwd,realname) values(?,?,?)"
 
> 

<sql:param value = "${param.account}" /> 
<sql:param value = "${param.passwd }"/> 
<sql:param value = "${param.realname }" /> 
 
</sql:update> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>
<br>
	${result.rowCount }
 	<table border=1> 	
 	<c:forEach items="${result.rows}" var="member">	
 	<tr>
   	<td> ${member.id}</td><td>${member.account}</td><td>${member.passwd } </td><td>${member.realname}</td><br>
	</tr>
	</c:forEach>
	</table>
 	
 	 
 </body>
</html>