package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky28
 */
@WebServlet("/Jacky28")
public class Jacky28 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		
  		String account = request.getParameter("account");
 		String passwd = request.getParameter("passwd");
 		
 		
 		if(account!=null & passwd!=null){
 			String auto =request.getParameter("auto");
 			//if vertify true
 			if (account.equals("iii") && passwd.equals("123"))
 			{
 				if (auto !=null && auto.equals("true"))
 				{
 					//addCookie
 					Cookie accountCookie = new Cookie("account",account);
 					accountCookie.setMaxAge(7*24*60*60);
 					response.addCookie(accountCookie);
 					
 					Cookie passwdCookie = new Cookie("account",passwd);
 					accountCookie.setMaxAge(7*24*60*60);
 					response.addCookie(passwdCookie);
 					}
 				//forward
 				request.getRequestDispatcher("Jacky30").forward(request, response);
 			}
 			
 		}
 		outHTML();
 	
 	}

 	private void outHTML() {
 		out.println(" 		<form action='Jacky28' method ='get' >");
 		out.println("		account	:<input type= 'text' name='account'> ");
 		out.println("		password	:<input type= 'password' name='passwd'> ");
 		out.println("		自動登入:<input type='checkbox' name='auto' value='true'>");
 		out.println("				<input typr='submit' value ='go'>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
