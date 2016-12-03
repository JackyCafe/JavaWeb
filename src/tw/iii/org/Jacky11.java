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
@WebServlet(urlPatterns = { "/Jacky10" }, initParams = {
		@WebInitParam(name = "Jacky10", value = "Jacky10", description = "Dispatcher") })
public class Jacky11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		PrintWriter out = response.getWriter();
//		out.println("<h1> Hello World" +name +":"+price);
//		
	LinkedList<HashMap<String,Integer>> line = (LinkedList<HashMap<String,Integer>> )request.getAttribute("linedata");
	for(HashMap<String,Integer> p:line)
	{
		out.println(p.get("x")+":"+p.get("y"));
	}
		 
		
		
	}

}
