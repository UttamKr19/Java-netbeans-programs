package jun3f;
import java.util.*;
public class Jun3f {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n,fact=1,sum=0;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        
        int i=n;
        while(i>0)
        {
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of "+n+": "+fact);
        
        i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of numbers till "+n+": "+sum);
        
        
    }
    
}
