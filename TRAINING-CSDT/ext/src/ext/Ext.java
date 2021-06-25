package ext;
public class Ext {
   public static void main(String[] args) {
        
        int n=8;
        int temp=1;
        
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n-i;j++) //for printing spaces
                System.out.print(" ");
            
            for(int k=1;k<=temp;k++) //for printing symbols
            {
                
                if(i>2 && i<=n && k>1 && k<i)
                    System.out.print(". ");
                else
                    System.out.print("* ");
            }
            
            System.out.println("");
            temp++;
        }
      
        
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
                System.out.print(" "); //printing spaces
            
            for(int k=1;k<=n-i;k++) //printing symbols
            {   
                if(i<n-2 && k>1 && k<=n-i-1)
                    System.out.print(". ");
                
                else
                    System.out.print("* ");
            }
            
            System.out.println("");
      
        }
    }
    
}
