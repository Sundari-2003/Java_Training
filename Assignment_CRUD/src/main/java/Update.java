import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
 
/**
* Servlet implementation class UpdateServlet
*/
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			int id = Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("nname");

			User u=new User();
			u.setId(id);
			u.setFullName(name);

			UserDAO.updateUser(u);
			List<User> list=UserDAO.getAllUsers();
			out.println("<h3>User list</h3>");
			for(User obj:list)
			{
				out.println("<br>"+" "+obj.getId()+" "+obj.getFullName()+" "+obj.getUserName()+" "+obj.getPassword());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 
}