//while loop
//WAP reverse of no
//WAP enter a no from user and check if it's palindrome of not
//WAP enter a no from user and check if it's armstrong no or not
//WAP to find all armstrong no. from 1 to 1000
package jun4b;

public class Jun4b {

    public static void main(String[] args) {
        
        int n=6;
        int z=1;
        for(int i=n;i>0;i--)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=z;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
            
            z++;
        }
        
        System.out.println("");
        
        z=1;
        for(int i=n;i>0;i--)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=z;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
            
            z++;
        }
        
        System.out.println("");
        
        z=0;
        for(int i=n;i>0;i--)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print("*");
            }
            
            for(int k=1;k<=z;k++)
            {
                System.out.print(" ");
            }
            System.out.println("");
            
            z++;
        }

    }
    
}
