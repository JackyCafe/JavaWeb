<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="jacky" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	#DoSth{
		width: 520px;
		font-family: monospace;
		font: 14px;
		color: red;
	}
</style>
<jacky:myHeader pageName="會員專區" func="回首頁" url="http://tw.yahoo.com" year="2017">
	<div id="DoSth"> Do Something!!  html ,不能再放％的script </div>

</jacky:myHeader>
<hr/>
 <title>Jacky Big Company</title>
</head>
<body>
	<jacky:hello />
	<jacky:b99 />
</body>
</html>