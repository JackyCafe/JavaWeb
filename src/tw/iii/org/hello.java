package tw.iii.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 * let ==>容器概念 WebContain 會產生一個物件實體，誰要就派一個執行緒去對付他
 * 部署時會看到/hello 
 * 物件永遠繼承自ttpServlet
 */
@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 類別擁有一個無傳參數建構子
     * 第一次編譯會產生出物件實體
     */
    public hello() {
        super();
        System.out.println("Hello");
        
        // TODO Auto-generated constructor stub
    }

    
    @Override
    public void init() throws ServletException {
     	System.out.println("init");
     	super.init();
    }
	
    /*  如果調整 不使用父類別的 service 方法時，生命週期不會進入doGet()方法
     * 
     * */
    @Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
 		System.out.println("Service()");
//		super.service(request, response);
 		String key1 = request.getParameter("key1");
 		System.out.println("key " + key1);
    }
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         System.out.println("doGet");

		response.getWriter().append("Served @: ").append(request.getContextPath());
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println("doPost");

		doGet(request, response);
	}

}
