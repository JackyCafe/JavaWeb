package tw.iii.org;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky13
 */
@WebServlet("/Jacky13")
public class Jacky13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public  String cal(String x,String y)
    {
    	 String result ="";
     	 Integer r = Integer.parseInt(x)+ Integer.parseInt(y);
     	 return r.toString();
    	
    }
    
    public HashMap<String,String> cal(HttpServletRequest request)
    {
    	HashMap<String, String> result = new HashMap<>();
    	return result;
    	
    }
    
}
