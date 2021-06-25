/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab_ques.pkg17jan.duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Uttam
 */
public class JavaLab_ques17JanDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]={14,12,5,5,14,5,7,8,12,5,8,9,14};
       
//        HashSet<Integer> t=new HashSet<>();
//        for(int i:arr)
//            t.add(i);
//        
//        System.out.println("Array");
//        for(int i:arr)
//            System.out.print(i+" ");
//        
//        System.out.println("\nAfter removing duplicates: \n"+t);
        
//        Object out[]=t.toArray();
//        
//        for(Object i:out)
//            System.out.println((int)i);
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        
        int brr[]=new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            brr[arr[i]]+=1;
        }

        System.out.println("Array");
        for(int i:arr)
            System.out.print(i+" ");
        
        System.out.println("\nAfter removing duplicates");
        for(int i=0;i<brr.length;i++){
            if(brr[i]>0)
                System.out.print(i+" ");
        }
        
    }
    
}
