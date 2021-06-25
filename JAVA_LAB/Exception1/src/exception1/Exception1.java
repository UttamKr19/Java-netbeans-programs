/*
1.Get an input String from user and parse it to integer, if it is not a number it
will throw number format exception Catch it and print "Entered input is not a
valid format for an integer." or else print the square of that number. (Refer
Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
 */
package exception1;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.next();
        
        try{
            int n=Integer.parseInt(str);
            System.out.println("Square: "+(n*n));
            
        }catch(NumberFormatException e){
            System.out.println("\n"+str+" is not a valid format for an integer.");
        }
    }
    
}
