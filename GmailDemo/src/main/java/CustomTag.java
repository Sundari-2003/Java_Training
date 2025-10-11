import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
import java.util.*;
public class CustomTag extends TagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.println("Current Date: " + new Date());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
