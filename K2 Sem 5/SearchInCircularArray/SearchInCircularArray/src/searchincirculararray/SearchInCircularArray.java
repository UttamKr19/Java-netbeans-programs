/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchincirculararray;

/**
 *
 * @author Uttam
 */
public class SearchInCircularArray {

    
    public static void main(String[] args) {
        
        int arr[]={15,16,37,58,2,3,4,5,8,9,12};
        
        //int brr[]={1,2,2,3,4,4,5,6};
        //int crr[]={12,9,6,4,3,2,2,1}; 
        
        int temp=-1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                temp=i;
                break;
            }
        }
        
    }
    
}
