package talabate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Connect {
    public Connection Connect() throws SQLException
    {
     
         Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Resturant","Rest","1234");
        System.out.println("create connection");
        
        return conn;
    }

 
}
