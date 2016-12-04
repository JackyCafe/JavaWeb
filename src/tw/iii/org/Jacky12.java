package tw.iii.org;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky12
 */
@WebServlet("/Jacky12")
public class Jacky12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String x = request.getParameter("x");
			String y = request.getParameter("y");
			if(x == null) x="0";
			if(y == null) y="0";
			
			//1. Model
				Jacky13 jacky =new Jacky13();
 				String  res = jacky.cal(x,y);
 				System.out.println(res);
			//2. forward ==>view
 				request.setAttribute("x", x);
 				request.setAttribute("y", y);
 				request.setAttribute("res", res);

 				request.getRequestDispatcher("Jacky14").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
