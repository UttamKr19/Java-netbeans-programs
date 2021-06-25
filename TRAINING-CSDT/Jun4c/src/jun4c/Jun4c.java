package jun4c;
import java.util.*;
public class Jun4c {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n=s.nextInt();
        int t=n;
        int r=0;
        
        while(n>0)
        {
            r=(n%10)+r*10;
            n=n/10;
        }
        
        System.out.println("Reverse: "+ r);
        
        if(r==t)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    
}
