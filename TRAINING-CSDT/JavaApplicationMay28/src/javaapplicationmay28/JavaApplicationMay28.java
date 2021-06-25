/* 
// How to display msg
        //Syntax- System.out.println("message");
        //System.out.println("asgjk");
        
        //how to display value and variable
        //syntax- System.out.println(variable+"message");
        //int a=39;
        //System.out.println(a+ " ");
        
        How to take input from user
        //Step 1: first of all we create object of Scanner class
        where scanner class is predefined class. It is defined in 'util' subpackage
        so if we want to create object of Scanner class then we first declare its related
        predefined pkg before class name
        import java.util.Scanner;
        Scanner s=new Scanner(System.in);//creating object of Scanner class
        
        Step 2: after creating obj of Scanner class we are able to take input from user.
            int a=s.nextInt();//to take I/P
            char ch=s.next().charAt(0);

*/

package javaapplicationmay28;
import java.util.*;
public class JavaApplicationMay28 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        
       //WAP to enter cost of the pen from user and find 100 pens cost
       
       /*
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter one pen cost: ");
        int x=sc.nextInt();
        int z=x*100;
        System.out.println("Total cost: "+(x*100));
        System.out.println("Cost with discount: "+(z-(z/10)));
        
       */
       
       
       //WAP to enter cost of a mobile phone and a laptop, you find three mobile cost and 
       //two laptop cost and finally display total cost of shopping
         
        /*  
            System.out.print("Enter cost of mobile: ");
            int mob=sc.nextInt();
            int lap=sc.nextInt();
            System.out.println("Cost of three mobile and laptops: "+ 3*(mob+lap));
           
        */ 
        
       //WAP enter basic salary of employee and calculate 30% da and 40% ta of basic salary
       //finally calculate gross salary of employee
       
       /*
            System.out.print("Enter salary of employee: ");
            double sal=sc.nextInt();
            double da=0.3*sal;
            double sa=0.4*sal;
            System.out.println("DA: "+da+", SA: "+sa);
            System.out.println("Gross salary: "+ (sal+da+sa) );
       
       */ 
       
       //WAP enter radius of circle and find area and circumference of circle
       
       /*
            System.out.print("Enter radius of the circle: ");
            float r=sc.nextFloat();
            System.out.println("Area of circle: "+ 2*2*3.14);
            System.out.println("Circumference: "+ 2*3.14*4);
       
       */        
        
       //WAP enter three digit no. from user and find its reverse
            
          /*
            //for any no. 
            System.out.print("Enter a no.: ");
            int num=sc.nextInt();
            int r=0;
            while(num>0)
            {
                r=(num%10)+r*10;
                num=num/10;
            }
            System.out.println("Reverse: " +r);
            
            //for three digit no. without loop  
            System.out.print("Enter a three digit no.: ");
            int n=sc.nextInt();
            int a=n;
            System.out.print("Reverse of three digit no.: ");
                 
            System.out.print(n%10);
            n=n/10;
            System.out.print(n%10);
            n=n/10;
            System.out.println(n%10);
        */    
            
       //WAP enter four digit no. from user and find sum of its digits
        
        System.out.print("Enter a four digit no.: ");
        int a=sc.nextInt();
        int sum=0;
        /*
        int sum=0;
        while(a>0)
        {
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("Sum of digits: "+ sum);
        */
        sum=sum+a%10;
        a=a/10;
        sum=sum+a%10;
        a=a/10;
        sum=sum+a%10;
        a=a/10;
        sum=sum+a%10;
        System.out.println("Sum of digits: "+sum);
        
        
  
 
    }
    
}
