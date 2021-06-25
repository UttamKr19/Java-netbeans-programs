/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Uttam
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    
    static int MooresVotingAlgoForMajorityElement(int arr[]){
        
        int tmp=arr.length/2;
        int majority=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==majority){
                count++;
            }
            else{
                count--;
                if(count==0){
                    majority=arr[i];
                    count=1;
                }
                
            }
        }
        
        //verify the candidate
        int cnt=0;
        for(int i:arr){
            if(i==majority)
                cnt++;
        }
        
        if(cnt>tmp)
            return majority;
        return -1;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]={3,4,5,3,5,3,3,3};
        System.out.println(MooresVotingAlgoForMajorityElement(arr));
    }
    
}
