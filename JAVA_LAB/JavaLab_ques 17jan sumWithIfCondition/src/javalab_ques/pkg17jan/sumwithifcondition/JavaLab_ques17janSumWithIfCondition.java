/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab_ques.pkg17jan.sumwithifcondition;

/**
 *
 * @author Uttam
 */
public class JavaLab_ques17janSumWithIfCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]={1,2,6,1,1,1,7,2};
        
        int six=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                six=i;
                break;
            }
        }
        
        int seven=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==7){
                seven=i;
                break;
            }
        }
        //System.out.println(six+" "+seven);
        int sum=0;
        
        if(six==-1 || seven==-1 || six>seven){
            for(int i=0;i<arr.length;i++)
                sum+=arr[i];
        }
        else{
            for(int i=0;i<six;i++)
                sum+=arr[i];
            
            for(int i=seven+1;i<arr.length;i++)
                sum+=arr[i];
        }
        
        System.out.println("Sum: "+sum);
    }
    
}
