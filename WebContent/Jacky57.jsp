<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here111</title>
</head>
<body>
	標準標籤  
	沒帶參數不能用這種寫法
		<jsp:include page="Jacky58.jsp"></jsp:include> 

	
			 key value 對照
			 
			<jsp:include page="Jacky58.jsp"> 
			   <jsp:param  name="x" value="123"/>
			   <jsp:param  name="y" value="456"/>
			   
			</jsp:include>
		
</body>
</html>