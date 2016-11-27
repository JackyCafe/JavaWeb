package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky02
 */
@WebServlet("/Jacky02")
public class Jacky02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //doInput Module 處理運算
 	 int  x=0, y=0 ,result = 0;
 	 try{
	   x = Integer.parseInt(request.getParameter("x"));
	   y = Integer.parseInt(request.getParameter("y"));
 	   result = x+y;
 	 }catch(Exception e) {}
		
		
		//do Output 
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
 		out.println("<form>");
 		out.println("<input type = 'text' name = 'x' value ='"+ x +"'>" +"+");
 		out.println("<input type = 'text' name = 'y'  value = '"+y+"'>");
// 		out.println("<input type = 'sumbit'  value ='='/>" );
		out.println("<input type='submit' value='=' />");
		out.println("<span >"+String.valueOf(result)+" </span>");

 		
 		out.println("</form>");

 		
 		
 		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
