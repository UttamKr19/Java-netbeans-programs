/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facto;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Facto {

    /**
     * @param args the command line arguments
     */
    
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        
        System.out.println("\nFactorial of "+n+" : "+fact(n));
    }
    
}
