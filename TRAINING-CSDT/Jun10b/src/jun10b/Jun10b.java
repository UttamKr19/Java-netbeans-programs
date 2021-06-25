
package jun10b;

import java.util.Scanner;


public class Jun10b {

    public void ser()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        int x=s.nextInt();
        int sum=0;
        for(int i=0;i<=x;i++)
        {
            sum=sum+i;
        }
        
        System.out.println("Sum: "+sum);
        
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jun10b ob=new Jun10b();
        ob.ser();
    }
    
}
