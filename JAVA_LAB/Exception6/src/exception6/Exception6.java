/*
6.Write a program to accept name and age of a person from the command
prompt(passed as arguments when you execute the class) and ensure that the age
entered is >=18 and < 60.
Display proper error messages.
The program must exit gracefully after displaying the error message in case the
arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)
 */
package exception6;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Exception6 {

    /**
     * @param args the command line arguments
     */
    
    
    
    static void method(int a) throws Exception{
        if(a<18 || a>=60){
            throw new Exception();
        }
        System.out.println("Age is :"+a);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter age: ");
            int age=sc.nextInt();
            method(age);
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        
    }
    
}
