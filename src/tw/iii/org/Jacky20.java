package tw.iii.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class Jacky20
 */
@WebServlet("/Jacky20")
public class Jacky20 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PrintWriter out;   
    private Connection conn;
	@Override
	public void init(ServletConfig config) throws ServletException {
 		super.init(config);
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iii", prop);
			Statement stmt = conn.createStatement();
 			stmt.execute("SET NAME UTF8");
			// stmt.executeUpdate("Insert into member(account,passwd,realname)
			// values('Jacky','123','Jacky')");

		} catch (Exception ex) {
			// handle the error
			System.out.println("error");
		}

	}

    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String jsonString = getJSONString(
				"http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
//		out.println(jsonString);
		parseJSON(jsonString);
		
    }

    private String getJSONString(String url){
		String ret = null;
		try{
			URL jsonURL = new URL(url);
			HttpURLConnection conn = 
					(HttpURLConnection)jsonURL.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream(),"UTF-8"));
			ret = reader.readLine();
 		}catch(Exception ee){}
		return ret;
	}
	 
    
    
    private String parseJSON(String json)
    {
    	JSONArray root = new JSONArray(json);
    	for (int i=0; i<root.length();i++)
    	{
    		JSONObject row = root.getJSONObject(i);
    		String name = row.getString("Name");
    		String tel = row.getString("Tel");
    		out.println(name);
    		out.print(tel+"<br/>");
    		addData(name,tel);
    	}
    	
//    	System.out.println("count()"+root.length());
    	return  ""+root.length();
    }
    
	private void addData(String name, String tel ) {
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("insert into food(name,tel)" + "values(?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
 			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
