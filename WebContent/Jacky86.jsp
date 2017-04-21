<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Properties" %> 
    
<%
	//JSP
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		Connection conn	 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iii?unicode=true&characterEncoding=UTF-8", prop);		
		System.out.print("Ok");
		Statement stmt = conn.createStatement();
		String sql = "Insert into member(Account,Passwd,Realname) values ('aaa','bbb','ccc')";
		stmt.execute(sql);
	}catch(Exception e)
	{
		System.out.print(e.toString());
	}



%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
</head>
<body>

</body>
</html>