package jdbc_2;

import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Uttam
 */
public class Jdbc_2 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String name,gender;
        int id,age;
//        
//        System.out.println("Enter employee's details");
//        System.out.println("\nEnter name:");
//        name=sc.next();
//        System.out.println("\nEnter id:");
//        id=sc.nextInt();
//        System.out.println("\nEnter age:");
//        age=sc.nextInt();
//        System.out.println("\nEnter gender:");
//        gender=sc.next();
//        
//        System.out.println("\n"+name);
//        System.out.println(id);
//        System.out.println(age);
//        System.out.println(gender);
//        
        
        
        try{  
            
            Connection con=DriverManager.getConnection(  
            "jdbc:derby://localhost:1527/JavaLab","uttam","uttam");  
            Statement stmt= con.createStatement();
            
    
//            String sql="insert into Employee"
//                    + " values('"+name+"' , '"+id+"' , "
//                    + "'"+age+"' , '"+gender+"')";
//            
//            
//            System.out.println("--------------");
//            
//            stmt.executeUpdate(sql);

            ResultSet rs2=stmt.executeQuery("select * from Employee");
            
            while(rs2.next()){
                System.out.println(rs2.getString(1)+ " "+rs2.getString(2)+
                    " "+ rs2.getString(3)+" "+rs2.getString(4));
            }  
                
            
            con.close();
            
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  

}
