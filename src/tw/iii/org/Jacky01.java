package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky01
 */
@WebServlet("/Jacky01")
public class Jacky01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
   protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
		super.service(arg0, arg1);
		System.out.println("service1");

}
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		//doTask(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		//doTask(request,response);

	}

	private void doTask(HttpServletRequest request, HttpServletResponse response){
		Enumeration<String> header =  request.getHeaderNames();
		while (header.hasMoreElements())
		{
			String info = header.nextElement() ;
			System.out.println(info);
		}
		
	try {	
	 PrintWriter out = response.getWriter();
	 out.write("Hello Jacky01");
	 out.flush();
	 out.close();
	}catch(Exception ce)
	{}
	}
	
}
