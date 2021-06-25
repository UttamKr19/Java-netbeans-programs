package may31e; 
import java.util.*;
public class May31e {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        
        if((y%4==0)&&(y%400==0||y%100!=0))
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");
        
        /*
        if(y%4==0)
        {
            if(y%100==0)
            {
                if (y%400==0)
                {
                    //yes
                    System.out.println("Leap year");
                }
                else{
                    //no
                    System.out.println("Not leap year");
                }
            }
            else
            {
               //yes
                System.out.println("Leap Year");
            }
        }
        else
        {
            //no
            System.out.println("Leap Year");
        }
        */

    }
    
}
