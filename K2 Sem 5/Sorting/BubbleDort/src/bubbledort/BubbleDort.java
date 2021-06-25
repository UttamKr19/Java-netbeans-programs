/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbledort;

/**
 *
 * @author Uttam
 */
public class BubbleDort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int arr[]={1,3,4,12,13,14,15,5,90,-21,-90};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        
        for(int i:arr){
            System.out.print(" "+i);
        }
    
    
    }
    
}
