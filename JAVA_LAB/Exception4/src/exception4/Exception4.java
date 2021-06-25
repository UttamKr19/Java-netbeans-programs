/*
4.Write a class MathOperation which accepts 5 integers through command line.
Create an array using these parameters. Loop through the array and obtain the sum
and average of all the elements and display the result.
Various exceptions that may arise like ArithmeticException, NumberFormatException,
and so on should be handled.
 */
package exception4;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */

public class Exception4 {

    /**
     * @param args the command line arguments
     */
    
    static double MathsOp() throws ArithmeticException, NumberFormatException{
        double avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(sc.next());
            avg=(avg+arr[i])/(i+1);
        }
        
        return avg;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Average: "+MathsOp());
        }catch(NumberFormatException a){
            System.out.println(a);
        }catch(ArithmeticException a){
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
}
