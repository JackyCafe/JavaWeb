package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Jacky26")
public class Jacky26 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     		PrintWriter out = response.getWriter();
     		Cookie cookie = new Cookie("name","Jacky");
      	
     	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	doGet(request, response);
	}

}
