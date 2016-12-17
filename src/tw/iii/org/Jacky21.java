package tw.iii.org;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

  
@WebServlet("/Jacky21")
public class Jacky21 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.setContentType("image/jpeg");
 		
 		float rate = Float.parseFloat(request.getParameter("rate"));
 		BufferedImage bimg = new BufferedImage(450, 20, BufferedImage.TYPE_INT_RGB);
 		Graphics2D g2d = bimg.createGraphics();
  		g2d.setColor(Color.YELLOW);
  		g2d.fillRect(0, 0, 400, 20);
  		g2d.setColor(Color.BLUE);
  		g2d.fillRect(0, 0, (int) (rate*400/100), 20);
  		g2d.setColor(Color.RED);
  		Paint paint;
  		// Output
 		
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		out.close();
     
     }

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
