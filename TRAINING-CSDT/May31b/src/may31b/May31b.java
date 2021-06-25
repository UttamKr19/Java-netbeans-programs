
package may31b;
import java.util.*;
public class May31b {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int a=sc.nextInt();
        if(a>=18)
            System.out.println("Eligible for vote");
        else
            System.err.println("Not eligible for vote");

    }
    
}
