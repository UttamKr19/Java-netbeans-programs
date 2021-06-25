/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab_ques17jan.largest.two;

/**
 *
 * @author Uttam
 */
public class JavaLab_ques17janLargestTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[]=new int[10];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        
        int min1=min;
        int max1=max;
        
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max && arr[i]!=max1)
                max=arr[i];
            if(arr[i]<min && arr[i]!=min1)
                min=arr[i];
        }
        
        int min2=min;
        int max2=max;
        
        System.out.println("Array");
        for(int i:arr)
            System.out.print(i+" ");
        
        System.out.println("\nTwo minimums: "+min1+","+min2);
        System.out.println("Two maximums: "+max1+","+max2);
    }
    
}
