
package Model;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class dbconnection {

    static Connection con;
   
             
       public static Connection getConnection()
       {
            try {
        String dbpath="jdbc:mysql://localhost:3306/rems";
        con=DriverManager.getConnection(dbpath,"root","");
            }  
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
            
       }
       
    
}
