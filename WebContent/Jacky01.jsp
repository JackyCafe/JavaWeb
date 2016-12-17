<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here111</title>
</head>
<body>
   <% int a = 0; %> 物件變數  
   <%! int b = 0; %> Static  
	<% 
		int lottery = (int) (Math.random()*49+1);
	%>
	<% out.print(lottery); %></br>
 	<hr>
 	a = <%= a++ %> <br/>
 	b = <%= b++ %> <br/>
 	
</body>
</html>