package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky10
 */
@WebServlet
public class Jacky10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("Jacky11");
		//也可以帶參數
		//也可以帶物件實體
		//RequestDispatcher dispatcher = request.getRequestDispatcher("Jacky11?name=jacky&price=123");
		LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
		HashMap<String,Integer> p0 = new HashMap<>();
		p0.put("x", 11);
		p0.put("y", 22);
		line.add(p0);
		
		HashMap<String,Integer> p1 = new HashMap<>();
		p1.put("x", 33);
		p1.put("y", 44);
		line.add(p1);
		
		HashMap<String,Integer> p2 = new HashMap<>();
		p2.put("x", 55);
		p2.put("y", 66);
		line.add(p2);
		request.setAttribute("linedata", line);
		
		out.println("<h1> Jacky Big Company");
		out.print("<hr>");
		dispatcher.include(request, response);
		dispatcher.forward(request, response);
		out.println("<hr>");
		out.println("Copyleft");
		
		
	}

}
