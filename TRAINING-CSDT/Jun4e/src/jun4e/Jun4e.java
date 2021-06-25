
package jun4e;
import java.util.*;
public class Jun4e {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        int t=n;
        int a=0;
        while(n>0)
        {
            a=a+((n%10)*(n%10)*(n%10));
            n=n/10;
        }
        
        if(a==t)
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong number");
        
    }
    
}
