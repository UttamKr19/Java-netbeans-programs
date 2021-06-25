/*
Write a program that accepts 2 integers a and b as input and finds the quotient of
a/b.
This program may generate an Arithmetic Exception. Use exception handling
mechanisms to handle this exception.
In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally
block”.
Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block
Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block
 */
package exception7;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception7 {

    
    public static void main(String[] args) {
    
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==0){
                throw new ArithmeticException();
            }
            System.out.println("Division: "+a/b);
        }catch(ArithmeticException a){
            //System.out.println(a);
            System.out.println("DivideByZero Caught");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Inside Finally Block");
        }
    }
    
}
