package javalab_ques17jan;

import java.util.Arrays;

/**
 *
 * @author Uttam
 */
public class JavaLab_ques17Jan {

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
        
        System.out.println("Array");
        for(int i:arr)
            System.out.print(i+" ");
        
        System.out.println("\nMin: "+min+ "\nMax: "+max);
      
    }
    
}
