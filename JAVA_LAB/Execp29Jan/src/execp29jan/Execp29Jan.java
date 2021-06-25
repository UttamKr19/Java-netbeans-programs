/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execp29jan;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Execp29Jan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        try{
            String str=sc.next();
            int n=Integer.parseInt(str);
            System.out.println("Square: "+(n*n));
        }catch(NumberFormatException e){
            System.out.println("Entered input is not a\n" +
            "valid format for an integer.");
        }
        
        
        
    }
    
}
