/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importantones;

import java.util.TreeSet;

/**
 *
 * @author Uttam
 */
public class ImportantOnes {

    /**
     * subset sum
     * coin change
     * grid no of ways from 0,0 to m,n
     * partition Reducible 
     */
    
    
    //===========================================================================
    static boolean isSubsetSumPossibe(int arr[],int sum,int n){
        if(sum==0)
            return true;
        if(sum<0)
            return false;
        if(n==0 && sum>0)
            return false;
        
        if(arr[n-1]>sum)
            isSubsetSumPossibe(arr, sum, n-1);
        
        return isSubsetSumPossibe(arr, sum-arr[n-1],n-1) ||
                isSubsetSumPossibe(arr, sum, n-1);
    }
    
    static int SubsetSum(int arr[],int sum,int n){
        if(sum==0)
            return 1;
        if(sum<0)
            return 0;
        if(n==0 && sum>0)
            return 0;
        
        if(arr[n-1]>sum)
            isSubsetSumPossibe(arr, sum, n-1);
        
        return SubsetSum(arr, sum-arr[n-1],n-1) +
                SubsetSum(arr, sum, n-1);
    }
    
    //===============================================================================
    
    
    static int coinChangeNoOfWaysNaive(int arr[],int sum,int n){
        if(sum==0)
            return 1;
        if(sum<0)
            return 0;
        if(n==0 && sum>0)
            return 0;
        
        if(arr[n-1]>sum)
            coinChangeNoOfWaysNaive(arr, sum, n-1);
        
        return coinChangeNoOfWaysNaive(arr, sum-arr[n-1], n) +
                coinChangeNoOfWaysNaive(arr, sum, n-1);
        
    }
    
    
    //========================================================================
    
    static int grid(int m,int n){
        if(n==1 || m==1)
            return 1;
        
        return grid(m,n-1)+grid(m-1,n);
    }
    
    //=======================================================================
    
    static int partition(int n,int m){
        
        if(m==0 || n<m)
            return 0;
        if(n==0)
            return 1;
        
        return partition(n,m-1)+partition(n-m,m);
    }
    
    //=======================================================================
    
    
    public static void main(String[] args) {
        
       int arr[]={4,3,2,6,9,1,10,12,5,7};



        
    }
    
}
