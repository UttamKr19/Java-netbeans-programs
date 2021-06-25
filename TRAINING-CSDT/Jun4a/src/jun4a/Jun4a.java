package jun4a;
import java.util.*;
public class Jun4a {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
       
    }
    
}
