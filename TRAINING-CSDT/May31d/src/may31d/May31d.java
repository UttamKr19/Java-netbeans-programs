//greatest of four nums
package may31d;
import java.util.*;
public class May31d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter four numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int m;
        
        if(a>b&&a>c&&a>d)
            m=a;
        else if(b>a&&b>c&&b>d)
            m=b;
        else if(c>a&&c>b&&c>d)
            m=c;
        else
            m=d;
        
        System.out.println("Maximun: "+ m);
                   
        
    }
    
}
