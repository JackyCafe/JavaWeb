package tw.Jacky.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyIf extends SimpleTagSupport {
	private boolean test;
	
	
	
	
	public boolean isTest() {
		return test;
	}




	public void setTest(boolean test) {
		this.test = test;
	}




	@Override
	public void doTag() throws JspException, IOException {
// 		super.doTag();
		if(test){
 		JspFragment jf = getJspBody();
 		jf.invoke(null);
		}
	}
}
