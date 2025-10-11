import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private static PreparedStatement pst = null;
	private static Connection con = null;
	
	public static Connection getCon() {
		    String url = "jdbc:mysql://localhost:3306/keller";
	        String user = "root";
	        String password = "root@39";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//2. Create connection object
	        con = DriverManager.getConnection(url, user, password);

	        //3. Create statement object
	         pst = con.prepareStatement(password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void createUser(User user) {
		try {
			String sql = "INSERT into USER20 (fullname , username, password) values (? , ? , ?)";
			pst = getCon().prepareStatement(sql);
			pst.setString(1, user.getFullName());
			pst.setString(2, user.getUserName());
			pst.setString(3, user.getPassword());
			
			pst.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<User> getAllUsers(){
		
		List<User> listUsers = null;
		try {
			String sql = "SELECT * from USER20";
			pst = getCon().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			listUsers = new ArrayList<>();
			while(rs.next()) {
				User obj = new User();
				obj.setId(rs.getInt(1));
				obj.setFullName(rs.getString(2));
				obj.setUserName(rs.getString(3));
				obj.setPassword(rs.getString(4));
				
				listUsers.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUsers;
		
	}
	
	public static User getUserByUserName(String userName) {
		User obj = new User();
		try {
			
			String sql = "select username , password from user20 where username = ?";
			pst = getCon().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			obj.setUserName(rs.getString(1));
			obj.setPassword(rs.getString(2));
//		while(rs.next()) {
//			if(userName.equals(rs.getString(1)))
//		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	
	public static void updateUser(User u) {
		// TODO Auto-generated method stub
		try
		{
			String sql="update user20 set fullname=? where id=?";
			pst=getCon().prepareStatement(sql);
			pst.setString(1, u.getFullName());
			pst.setInt(2, u.getId());
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 
	public static void deleteUser(User u) {
		try
		{
			String sql="delete from user20 where id=?";
			pst=getCon().prepareStatement(sql);

			pst.setInt(1, u.getId());
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
