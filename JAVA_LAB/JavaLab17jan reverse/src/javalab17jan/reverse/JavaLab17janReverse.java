/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab17jan.reverse;

/**
 *
 * @author Uttam
 */
public class JavaLab17janReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[10];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        
        int rev[]=new int[arr.length];
        for(int i=rev.length-1,j=0;i>=0;i--,j++){
            rev[j]=arr[i];
        }
        
        System.out.println("Original array");
        for(int i:arr)
            System.out.print(i+" ");
        
        System.out.println("\nReversed array");
        for(int i:rev)
            System.out.print(i+" ");

    }
    
}
