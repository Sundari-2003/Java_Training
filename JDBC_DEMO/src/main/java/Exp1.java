import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exp1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/keller";
        String user = "root";
        String password = "root@39";

        //1. Load the driver class
        Class.forName("com.mysql.jdbc.Driver");

        //2. Create connection object
        Connection conn = DriverManager.getConnection(url, user, password);

        //3. Create statement object
        Statement stmt = conn.createStatement();

        String sql = "CREATE TABLE mlauser11(id INT, name VARCHAR(100), city VARCHAR(100));";

        //4. Execute Query
        stmt.execute(sql);

        //5. Close the connection object
        conn.close();

        System.out.println("Done");
    }
}

