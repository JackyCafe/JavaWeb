package tw.iii.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jacky17
 */
@WebServlet("/Jacky17")
public class Jacky17 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	PrintWriter out;

	@Override
	public void init() throws ServletException {
		super.init();

		// load driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/iii", prop);
			System.out.println("ok");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String editid = request.getParameter("editId");

		out = response.getWriter();
		out.println(editid);
		outHTML(queryData(editid));

	}

	private HashMap<String, String> queryData(String id) {
		HashMap<String, String> row = new HashMap<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("Select * from  member where id = ?");
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.first();

			row.put("id", rs.getString("id"));
			row.put("account", rs.getString("account"));
			row.put("passwd", rs.getString("passwd"));
			row.put("realname", rs.getString("realname"));
			out.println(rs.getString("id") + ":" + rs.getString("passwd") + ":" + rs.getString("realname"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return row;

	}

	private void outHTML(HashMap<String, String> row) {
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.println("<form action='Jacky16'>");
		out.println(String.format("<input type='hidden' name='updateid' value='%s'><br>", row.get("id")));
		out.println(String.format("Account: <input type='text' name='account' value='%s'><br>", row.get("account")));
		out.println(String.format("Password: <input type='text' name='passwd' value='%s' ><br>", row.get("passwd")));
		out.println(
				String.format("RealName: <input type='text' name='realname' value='%s' ><br>", row.get("realname")));
		out.println("<input type='submit' name='type' value='edit' >");
		out.println("</form>");
	}

}
