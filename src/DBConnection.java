import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static Connection con;
    
    
    

    public static Connection createDBConnection() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Define Database URL
            String url = "jdbc:mysql://localhost/librarydb";
            String user = "root"; 
            String password = "dew@123"; 

            // Establish Connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully!");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver Not Found! " + e.getMessage());
        }
        catch (SQLException ex) {
            System.out.println("DB Connection ERROR! " + ex.getMessage());
        }
        
        return con; // Corrected return statement
    }
}
    
    //public static Connection createDBConnection()
    //{
    // try
       // {
          //  String url= "jdbc:mysql://localhost/librarydb";
            //con = DriverManager.getConnection(url, "root","dew@123");
       // }
     //catch(SQLException ex)
    // {
         //System.err.println("Connection failed:"+ ex.getMessage());
     //}
     //return con;
//}
//}
//