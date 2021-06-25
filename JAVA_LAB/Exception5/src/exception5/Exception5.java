/*
5.Write a Program with a division method which receives two integer numbers and
performs the division operation.
The method should declare that it throws ArithmeticException. This exception
should be handled in the main method.
 */
package exception5;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
