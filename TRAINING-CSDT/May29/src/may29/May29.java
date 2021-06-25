/*
Sum of digits of 4 digit no without loop
Area of triangle
Area of rectangle

*/
package may29;
import java.util.*;
public class May29 {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a four digit no.: ");
        int num=sc.nextInt();
        int r=0;
        r=r*10+(num%10);
        num=num/10;
        r=r*10+(num%10);
        num=num/10;
        r=r*10+(num%10);
        num=num/10;
        r=r*10+(num);
        System.out.println("Reverse: "+r);
    
    
    }
    
}
