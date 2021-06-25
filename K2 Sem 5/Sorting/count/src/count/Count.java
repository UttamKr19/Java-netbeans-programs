
package count;

import java.util.*;
/**
 *
 * @author Uttam
 */
public class Count {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int size=inp.nextInt();
        int arr[]=new int[size];
        
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=inp.nextInt();
        }
        
        //int arr[]={3,6,1,20,5,3,2,6,12,2,7,9,3,1};
        
        System.out.println("Input array:");
        for(int x: arr)
           System.out.print(x+" ");
        
        System.out.println("");
         
         
        
        int max=arr[0];
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        int brr[]=new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            brr[arr[i]]=brr[arr[i]]+1;
        }
        
//        System.out.println("Frequency array: \n");
//        for(int x: brr)
//            System.out.print(x+ " ");
        
        for(int i=1;i<max+1;i++){
            brr[i]=brr[i]+brr[i-1];
        }
        
        for(int i=0;i<brr.length;i++){
            brr[i]=brr[i]-1;
        }
        
        
//        System.out.println("");
//        for(int x: brr)
//            System.out.print(x+" ");
        
        
        int out[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            out[brr[arr[i]]--]=arr[i];
            
        }
        
        System.out.println("");
        System.out.println("Output array");
        for(int x: out)
            System.out.print(x+" ");
    }
    
}
