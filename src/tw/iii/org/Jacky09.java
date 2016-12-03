package tw.iii.org;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(location="/Users/hungming/Documents/workspace/JavaWeb/WebContent/upload2")
@WebServlet("/Jacky09")
public class Jacky09 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//針對中文檔名必須在request前加上下面這一句
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		Collection<Part> parts = request.getParts();
		
		for(Part part :parts)
		{
		String header = part.getHeader("Content-Disposition"); //Content-Disposition
		String myfilename = getFilename(header);
		long size =part.getSize();
		out.print(myfilename+":"+size);
		if (size>0)
		 part.write(myfilename);
		}
	}
	
	private String getFilename(String body){
		int start = body.indexOf("filename=\"");
		String temp = body.substring(start+10);
		String filename = temp.substring(0, temp.indexOf("\""));
		int s = filename.lastIndexOf("\\");
		filename = filename.substring(s+1);
		
		return filename;
	}
}