package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.mysql.jdbc.ResultSetMetaData;

 
/**
 * Servlet implementation class Jacky16
 */
@WebServlet("/Jacky16")
public class Jacky16 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;
	private Connection conn;
	String[] fields = { "id", "account", "passwd", "realname" };

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iii?unicode=true&characterEncoding=UTF-8", prop);
			Statement stmt = conn.createStatement();
// 
			// stmt.executeUpdate("Insert into member(account,passwd,realname)
			// values('Jacky','123','Jacky')");

		} catch (Exception ex) {
			for (StackTraceElement s: ex.getStackTrace()) {
				System.out.println("error"+s.getLineNumber());
				System.out.println("error"+s.getMethodName());
				System.out.println("error"+s.toString());
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doLogin(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doLogin(request, response);

	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
 		response.setContentType("text/html;charset=utf8");

		request.setCharacterEncoding("utf8");
 
		
		out = response.getWriter();
		String type = request.getParameter("type");
		String delId = request.getParameter("delId");
		String editId = request.getParameter("editId");
		out.println("add:" + type +"<br/>");
		if (type != null && type.equals("add")) {
			String account = request.getParameter("account");
			String passwd = BCrypt.hashpw(request.getParameter("passwd") , BCrypt.gensalt());
			String realname = request.getParameter("realname");
			out.print("iii:"+ account + ":" + passwd + ":" + realname);
			addData(account, passwd, realname);
		} else if (delId != null) {
			delData(delId);
		} else if (type != null && type.equals("edit")) {
			// editData(editId);
			String updateid = request.getParameter("updateid");
			String account = request.getParameter("account");
			String passwd = request.getParameter("passwd");
			String realname = request.getParameter("realname");
			editData(account, passwd, realname, updateid);
		}
		outHTML(queryData());
		
	}
	
	
	private void editData(String account, String passwd, String realname, String updateid) {
		try {
			out.println(account + ":" + passwd + ":" + realname);

			PreparedStatement pstmt = conn
					.prepareStatement("update member set account =?,passwd=?,realname =? where id=?");
			pstmt.setString(1, account);
			pstmt.setString(2, passwd);
			pstmt.setString(3, realname);
			pstmt.setString(4, updateid);
			pstmt.execute();

		} catch (SQLException e) {
			out.println(e.toString());
		}

	}

	private void delData(String delId) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from  member where id=?");
			pstmt.setString(1, delId);
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addData(String account, String passwd, String realname) {
		try {
			PreparedStatement pstmt = conn					
//					.prepareStatement("insert into member(account,passwd,realname)" + "values('111','222','中文')");

					.prepareStatement("insert into member(account,passwd,realname)" + "values(?,?,?)");
				pstmt.setString(1, account);
				pstmt.setString(2, passwd);
				pstmt.setString(3, realname);
			
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private ArrayList<HashMap<String, String>> queryData() {
		ArrayList<HashMap<String, String>> data = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from member");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				HashMap<String, String> row = new HashMap<>();
				for (String field : fields) {
					row.put(field, rs.getString(field));
				}
				data.add(row);
			}
			out.print(rs.getRow());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}

	private void outHTML(ArrayList<HashMap<String, String>> data) {

		out.println("<h1>Jacky Big Company</h1><b1>");
		out.println("<script ='Java/Script'> function isDelete(name) {"
				+ "return confirm('Delete '+name+ '?');}  </script>");

		out.print("<a href='AddNew.html'>Add New </a>");
		out.println("<table border ='1' width ='100%'>");
		out.println("<tr>");
		out.println("<th> Id </th>");
		out.println("<th> Account </th>");
		out.println("<th> Passwd </th>");
		out.println("<th> Real Name </th>");
		out.println("<th> Delect </th>");
		out.println("<th> Edit </th>");

		out.println("</tr>");

		//

		for (HashMap<String, String> s : data) {
			out.println("<tr>");

			for (String field : fields) {

				out.println(String.format("<td> %s </td>", s.get(field)));
			}
			out.println(String.format("<td> <a href=Jacky16?delId=%s  onClick='return isDelete(\"%s\")' >Delete</td>",
					s.get(fields[0]), s.get(fields[1])));
			out.println(String.format("<td> <a href=Jacky17?editId=%s >Edit</td>", s.get(fields[0]), s.get(fields[1])));

			out.println("</tr>");
		}
		out.println("</table>");

	}



}
