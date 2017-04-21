<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="jacky" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.iii.org.tw/Jacky-tag" prefix="mytag" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>Jacky Big Company</title>
</head>
<body>
	<jacky:MyCal x="10" y="3">10+3 = ${addResult }</jacky:MyCal>
		<jacky:MyCal x="10" y="3">10+3 = ${addResult }</jacky:MyCal> <br/>
		<jacky:MyCal x="10" y="3">10-3 = ${subResult }</jacky:MyCal><br/>
		<jacky:MyCal x="10" y="3">10*3 = ${mutileResult }</jacky:MyCal><br/>
		<jacky:MyCal x="10" y="3">10/3 = ${divideResult }</jacky:MyCal><br/>
		
		<jacky:myData title='詳細資料' 姓名='Brad' 性別='male' 年齡='50' />
		
		<c:set var="account" value="JackyLin"></c:set>
	<c:if test="${fn:contains(account,'Jacky') }">ok</c:if>
	${mytag:sayHello('Jacky') }
	${mytag:sayHelloV2('Jacky','AAA','BBB','III') }
	
  </body>
</html>