package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Jacky30
 */
@WebServlet("/Jacky30")
public class Jacky32 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PrintWriter out; 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
 
		out = response.getWriter();
		
		out.print("Brad<32>");
		int Lotteries = (int)(Math.random()*49+1);
		out.print("Lottery " +Lotteries+"<br>");

		HttpSession session = request.getSession();
		session.setAttribute("name", "bard");
		session.setAttribute("name", "bard");

		out.print("<a href ='Jacky33'> Jacky33</a>");
 
	
	
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
