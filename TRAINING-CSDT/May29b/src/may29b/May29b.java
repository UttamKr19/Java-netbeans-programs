package may29b;
//import java.text.DecimalFormat;
import java.util.*;
//import java.lang.Math;
//import java.math.*;

public class May29b {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
      
             
        System.out.println("Enter sides of triangle: ");      
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
       // System.err.println(a+" "+b+" "+c);
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        
        
       /* DecimalFormat t=new DecimalFormat("0.00");
        System.err.println("Area: "+ t.format(ar));
        System.out.println(String.format("Area : %.2f ",ar));
        */
    }
     
}
