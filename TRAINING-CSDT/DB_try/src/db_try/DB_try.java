

package db_try;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB_try {

    public static void main(String[] args) {

        try {
            
        String host="jdbc:derby://localhost:1527/Information";
        String uName="uttam";
        String uPass="uttam";
        Connection con=DriverManager.getConnection(host, uName, uPass);
        Statement stmt= con.createStatement();
        
        String sql="SELECT * FROM STUDENT";
        ResultSet rs=stmt.executeQuery(sql);
      
        // rs.next();
        
       while(rs.next()){
        int sid_col=rs.getInt("sid");
        int age_col=rs.getInt("age");
        String name_col=rs.getString("name");
        String add_col=rs.getString("address");
        
        System.out.println(sid_col+" "+name_col+" "+add_col+" "+age_col);
        
        
        
       }
            
       
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
