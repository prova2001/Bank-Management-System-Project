
 import com.mysql.cj.jdbc.Driver;

 import java.sql.*;

public class Conn {
    Connection connection;

    Statement statement;

    public Conn() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagement","root","123456");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
