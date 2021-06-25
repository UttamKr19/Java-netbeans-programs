/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc29jan;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class EXc29Jan {

    /**
     * @param args the command line arguments
     */
    
    static void method(String str) throws NumberFormatException,ArithmeticException{
        int a=Integer.parseInt(str);
        System.out.println("----");
        System.out.println("Number "+a);
        
    }
    public static void main(String[] args) throws NumberFormatException {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a string: ");
        //String str=sc.next();
        int n=5;
        int arr[]=new int[5];
        int sum=0;
        try{
           for(int i=0;i<5;i++){
               arr[i]=sc.nextInt();
               if(arr[i]>50){
                   throw new ArithmeticException();
               }
               sum+=arr[i];
               

           }   
           
           System.out.println("Sum: "+sum);
        }catch(ArithmeticException e){
            System.out.println("Exception occured: \n"+e);
        }
        
        
        
       
        
    }
    
}
