package jun4;

import java.util.*;
public class Jun4 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter a no: ");

        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(" "+j*i+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
