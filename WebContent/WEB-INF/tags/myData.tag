<%@tag description = "My Cal" pageEncoding = "UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@tag dynamic-attributes="data"%>


<table border='1' width='100%'>
	<c:forEach var='row' items='${data}'>
	   <tr>
	   		<th>${row.key}</th>
	   	   	<td>${row.value}</td>
	   
	   </tr>
	</c:forEach>

</table>