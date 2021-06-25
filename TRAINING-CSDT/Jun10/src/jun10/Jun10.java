
package jun10;
import java.util.*;
public class Jun10 {
    
    void fact()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        int x=s.nextInt();
        int res=1;
        for(int i=x;i>=1;i--)
        {
            res=res*i;
        }
        System.out.println("Factorial: "+res);
        
    }
    
    void fact2(int x)
    {
        int res=1;
        for(int i=x;i>=1;i--)
        {
            res=res*i;
        }
        System.out.println("Factorial: "+res);
        
    }
    
    int fact3()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        int x=s.nextInt();
        int res=1;
        for(int i=x;i>=1;i--)
        {
            res=res*i;
        }
        return res;
    }
    
    int fact4(int x)
    {
        int res=1;
        for(int i=x;i>=1;i--)
        {
            res=res*i;
        }
        return res;   
    }
    
    public static void main(String[] args) {
        
    Jun10 ob=new Jun10();
   // Scanner s=new Scanner(System.in);    
        System.out.println(ob.fact4(5));
            
    }
    
}
