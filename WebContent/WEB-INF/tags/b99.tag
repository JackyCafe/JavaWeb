<%@tag description="Hello,World" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <table border="1" width='100%'> 
  	
  	<c:forEach begin="1" end="4" var="r" >
  	<tr>
  	  		<c:forEach begin="2" end="5" var="y"> 
  			<td>
  				<c:forEach begin="1" end ="9" var ="x">
   				${y+(r-1)*4 }X ${x }= ${(y+(r-1)*4)*x }  <br/>
   				</c:forEach>
  			</td>
    		</c:forEach>
    </tr>		
    </c:forEach>		
    	
  
  
  
</table>

   
 