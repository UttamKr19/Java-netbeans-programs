package varargs;
import java.util.*;
public class Varargs {
    
    public static void meth(String name,double...marks)
    {
        System.out.print("Name: " + name + "   Marks:");
        for(double x:marks)
        {
                System.out.print(x+", ");
        }
        System.out.println("\b\b");
    }
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
       /* System.out.println("No. of subs: ");
        int n=s.nextInt();
        
        for(int i=0;i<n;i++)
        {
            
        }
        */
       meth("a",34);
       meth("b",56,23,2,6,33.7);
       meth("c",6.3,4.5,44);
        
    }
    
}
