<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jacky Big Company</title>
<style type="text/css">
div {
	color: #09bFf0;
	margin-top: 5px; margin-left : 20px; margin-right : auto; margin-bottom
	: 20px;
  	float: right;
  	padding:5px;
	border:#0AF0FA 2px solid; 
}

/* .pageContext{
			color:#0000FF; 
		    float:left;
		    font-family :Serial-MonoSpace;
		    margin:3px;
		} */
</style>
</head>
<body>
	<%
		String method = ((HttpServletRequest) pageContext.getRequest()).getMethod();
		String path = ((HttpServletRequest) pageContext.getRequest()).getContextPath();
		String ip = ((HttpServletRequest) pageContext.getRequest()).getLocalAddr();
		//String method = ((HttpServletRequest)pageContext.getRequest())
	%>
	<div class="pageContext">
		pageContext
		<hr>
		Method:<%=method%><br> path:<%=path%><br> ip:
		<%=ip%><br>
	</div>

	<div class="Jsp">
		JSP 隱含物件
		<hr>
		Method:
		<%=request.getMethod()%><br> path:<%=request.getContextPath()%><br>
		ip:<%=request.getLocalAddr()%><br>
	</div>
	<div class="EL">
		EL
		<hr>
		Method: ${pageContext.request.method}<br>
		path:${pageContext.request.contextPath }<br> ip:
		${pageContext.request.localAddr}
	</div>
</body>
</html>