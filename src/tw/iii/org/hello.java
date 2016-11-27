package tw.iii.org;

import java.io.IOException;
import java.util.Enumeration;

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
 * 如果把@WebServlet("/hello") 改成@WebServlet("III01.php") 則瀏覽器必須跑
 * http://localhost:8080/JavaWeb/III01.php


 */
@WebServlet("/III01.php")
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

    
    /* 一次性的設定
     * 屬性的初始化可以做在這邊
     * */
    @Override
    public void init() throws ServletException {
     	System.out.println("init");
     	super.init();
    }
	
    /*  如果調整 不使用父類別的 service 方法時，生命週期不會進入doGet()方法
     *  用request.getParamter接受參數．
     *  在Service 中沒有特別限制get or post 
     *  Service 的父類別 中把路拆開 Post的可以跑doPost get的doGet
     * */
    @Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
 		System.out.println("Service()");
 		
 		
 		try {
 		HttpServletRequest req = (HttpServletRequest) request;
 		String method =req.getMethod();
 		System.out.println(method);
 		System.out.println("Cast ok");
 		}catch(ClassCastException ce)
 		{
 			System.out.println(ce.toString());
 		}
 		
//		super.service(request, response);
// 		String key1 = request.getParameter("key1");
// 		System.out.println("key " + key1);

 		
 		Enumeration<String> ps = request.getParameterNames();
 		while (ps.hasMoreElements())
 		{
 			String item = ps.nextElement();
 			String value = request.getParameter(item);
 			System.out.println(item +"---->"+value);
 		}
 		
 		
 		
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
