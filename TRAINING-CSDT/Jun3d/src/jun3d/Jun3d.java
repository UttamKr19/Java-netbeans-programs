package jun3d;
import java.util.*;

public class Jun3d {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a no: ");
        n=sc.nextInt();
        System.err.println("Multiplication table of "+n);
        System.out.println();
                
        for(int i=1;i<=10;i++)
        {
            System.out.println("   "+n+" * "+i+" = "+n*i);
        }
        
        //WAP print sum of nth term series
        //Find all even no between 1 to 100
        //find the factorial of any given no
        //find the sum of odd no between 1 to 100
        
    }
    
}
