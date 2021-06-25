package jun10a;

import java.util.Scanner;

public class Jun10a {
    
        void table()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        int x=s.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" X "+i+" = "+ i*x);
        }
        
    } 
     
        void rev()
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a no:");
            int n=s.nextInt();
            int r=0;
            while(n>0)
            {
                r=r*10+n%10;
                n=n/10;
            }
            System.out.println(r);
            
        }
        
        void rev1(int n)
        {
            int r=0;
            while(n>0)
            {
                r=r*10+n%10;
                n=n/10;
            }
            System.out.println(r);
        }
        
        int rev2()
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a no:");
            int n=s.nextInt();
            int r=0;
            while(n>0)
            {
                r=r*10+n%10;
                n=n/10;
            }
            return r;
        }
        
        int rev3(int n)
        {
            int r=0;
            while(n>0)
            {
                r=r*10+n%10;
                n=n/10;
            }
            return r;
        }
    
    
    public static void main(String[] args) {
       
        Jun10a ob=new Jun10a();
        System.out.println(ob.rev2());
        
    }
    
}
