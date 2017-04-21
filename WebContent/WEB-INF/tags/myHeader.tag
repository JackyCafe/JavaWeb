<%@tag description="My Header" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="pageName"  %>
<%@attribute name="func"  %>
<%@attribute name="url"  %>
<%@attribute name="year"  %>



<h1> Jacky Big Company</h1> 
${pageName} <a href= "${url }">${func}</a> 

<jsp:doBody />
<hr/>
Copyright : ${year } 