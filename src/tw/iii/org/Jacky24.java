package tw.iii.org;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
/**
 * Servlet implementation class Jacky24
 */
@WebServlet("/Jacky24")
public class Jacky24 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("image/jpeg");
		String templatePath = getServletContext().getInitParameter("img-path");
		File imgBg = new File(templatePath, "background.jpg");
		BufferedImage bimg = ImageIO.read(imgBg);
		Graphics2D g2d = bimg.createGraphics();
		Font font = new Font("", Font.BOLD+Font.ITALIC, 36);
		g2d.setFont(font);
		g2d.setColor(Color.BLACK);g2d.drawString("Hello", 100, 100);
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		out.close();
		}



	 
}
