
package may31c;
import java.util.*;
public class May31c {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //WAP enter basic salary of employee from user, and calculate da and ta on
        // the basis of condition. if basic salary>=5000 then we calculate 80% da
        //and 70% ta of basic salary otherwise we calculate 60% da and 40% ta of 
        //basic salary. Finally calculate gross salary.
        
        System.out.print("Enter basic salary: ");
        double bs=sc.nextInt();
        double da,ta;
        
        if(bs>=5000)
        {
            da=bs*(0.8);
            ta=bs*(0.7);
        }
        else
        {
         da=bs*(0.6);
         ta=bs*(0.4);  
        }
        
        System.out.println("Basic Salary: "+bs);
        System.out.println("D.A: "+da);
        System.out.println("T.A: "+ta);
        System.out.println("Gross salary: "+(bs+da+ta));
              
        
        //WAP 
        
    }
    
}
