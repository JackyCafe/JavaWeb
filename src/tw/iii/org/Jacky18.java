package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Servlet implementation class Jacky18
 */
@WebServlet("/Jacky18")
public class Jacky18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out; 
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.getWriter().append("Served at: ").append(request.getContextPath());
 		
 		response.setContentType("text/html charset=utf-8");
		out = response.getWriter();
 		
		String pass1 = "123456";
		String pass3 = "123456";
		String pass2 = BCrypt.hashpw(pass1, BCrypt.gensalt());
		String pass4 = BCrypt.hashpw(pass3, BCrypt.gensalt());

		out.println(pass1 +"==>"+pass2);
		out.println(pass3 +"==>"+pass4);

 		if( BCrypt.checkpw("12345", pass2))
 		{ out.print("OK");}
 		else{
 			out.print("XX");
 		}
 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
