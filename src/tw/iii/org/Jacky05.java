package tw.iii.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Jacky05")
public class Jacky05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 }

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html;charset=utf-8");
	  
	  PrintWriter out = response.getWriter();
	  String username = request.getParameter("username");
	  out.print(username);
	  String type = request.getContentType();
      int len = request.getContentLength();
      out.println(type+"  <br> "+len +"<br/>");
      InputStream in  = request.getInputStream();
      InputStreamReader reader = new InputStreamReader(in);
      int line ;
      byte[] buf =new byte[len];
      in.read(buf);
      String con = new String(buf);
      out.println(getFileName(con));
//      out.println(con);
      in.read(buf);
      in.close();
      
//      while ((line = reader.read())!=-1)
//      {
//    	  out.println(line);
//      }
      
//      BufferedReader reader = request.getReader();
//      String line; int i = 1;
//		
//      while ((line = reader.readLine())!=null)
//      {
//    	out.println(i++ +line+"<br>");  
//      }
	}
	
	
	private String getFileName(String body)
	{
		String filename;
		int beginIndex = body.indexOf("filename=\"");
		String temp =body.substring(beginIndex+10);
		System.out.println(temp);
		String temp2 = body.substring(0,temp.indexOf("\""));
		return temp2;
		
	}
}
