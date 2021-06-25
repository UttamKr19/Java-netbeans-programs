/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class SumOfdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        
        System.out.println("Sum of digits: "+sum);
    }
    
}
