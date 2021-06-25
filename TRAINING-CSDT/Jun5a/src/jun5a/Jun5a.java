package jun5a;
import newpackage.*;

public abstract class Jun5a extends NewClass implements NewInterface{

    public static void main(String[] args) {
            
        int n=5;
        int z=1;
        int t=0;
        
        for(int i=1;i<=n;i++,z++)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=z;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        
        
        
        //NewClass obj=new NewClass();
        
        //System.err.println(obj.a+" .... "+ obj.c);
        
      
        //System.err.println(-17%-7);
        
        z=1;
        for(int i=1;i<=n;i++,z++,t++)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=z+t;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*--------------------------------------------------------------------
            1
           222
          33333
         4444444
        555555555
        */
        System.out.println("");
        z=1;
        t=0;
        for(int i=1;i<=n;i++,z++,t++)
        {
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=z+t;k++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
        
        /*---------------------------------------------------------------------
            1
           212
          32123
         4321234
        543212345
        */
        
        System.out.println("");
        z=1;
        for(int i=1;i<=n;i++,z++)
        {
            
            for(int j=n-z;j>0;j--)
            {
                System.out.print(" ");
            }
           
            for(int l=i;l>=1;l--)
            {
                    System.out.print(l);
            }
            
            for(int m=2;m<=i;m++)
            {
                    System.out.print(m);
            }
            
            System.out.println("");
            
        }
        
        
    }
    
}
