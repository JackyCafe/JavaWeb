package tw.iii.org;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Jacky15")

public class Jacky15 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     	testSQL();	
	}

     	
	 
	private void testSQL() {
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection  conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iii?user=root&password=root");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("Insert into member(account,passwd,realname) values('Jacky','123','Jacky')");
            
            System.out.println("ok");
        } catch (Exception ex) {
            // handle the error
        	System.out.println("error");
        }
		}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		doGet(request, response);
	}

}
