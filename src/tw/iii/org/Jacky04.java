package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky04
 */
@WebServlet("/Jacky04")
public class Jacky04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 String username = request.getParameter("username");
		 out.println(username);
		 String gender = request.getParameter("gender");
		 out.print(gender);
		 
		 String[] likes  = request.getParameterValues("like");
		 for (String s:likes)
		 out.print(s);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
