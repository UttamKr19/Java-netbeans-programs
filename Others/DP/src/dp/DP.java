/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

public class DP {

    static int[] arr={2,3,8,1,6,4};
    static int[] wt={2,5,1,6,8,9};
    static int[] pr={7,4,3,6,3,6};
    static int[][] dp;
    
    
    //================================================================================
    static int knapsack1(int wt[],int pr[],int n,int W){
        return knapsack(W, n);
    }
    
    static int knapsack(int W,int n){
        
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]>W){
            return knapsack(W, n-1);
        }
        return Math.max(knapsack(W, n-1),pr[n-1]+knapsack(W-wt[n-1], n-1));
    }
    
    static int knapsackDP1(int W,int n){
        if(n==0||W==0){
            return 0;
        }
        
        if((dp[W][n])!=-1)
            return dp[W][n];
        
        if(wt[n-1]>W){
            dp[W][n]=knapsackDP1(W, n-1);
            return dp[W][n];
        }
        return dp[W][n]=Math.max(pr[n-1]+knapsackDP1(W-wt[n-1], n-1),knapsackDP1(W, n-1));
        
    }
    
    static int knapsack2(int dp[][],int wt[],int pr[],int W,int n){
        dp=new int[W+1][n+1];
        //initialize
        //return knapsack
        for(int i=0;i<W+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else
                    dp[i][j]=-1;
            }
        }
        
        for(int i=0;i<W+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println("");
        }
        
        return knapsackDP1(W,n);
        
        
    }
    //=================================================================================
    static boolean isSubsetSum(int arr[],int sum,int n){
        if(sum==0){
            return true;
        }
        if(n==0 && sum>0){
            return false;
        }
        
        if(arr[n-1]>sum)
            return isSubsetSum(arr, sum, n-1);
        
        return isSubsetSum(arr, sum, n-1)||isSubsetSum(arr, sum-arr[n-1], n-1);
       
    }
    
    static int subsetSumCount(int arr[],int sum,int n){
        if(sum==0){
            return 1;
        }
        if(n==0 && sum>0){
            return 0;
        }
        
        if(arr[n-1]>sum)
            return subsetSumCount(arr, sum, n-1);
        
        return subsetSumCount(arr, sum, n-1)+subsetSumCount(arr, sum-arr[n-1], n-1);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(knapsack1(wt,pr,wt.length,3));
        System.out.println(subsetSumCount(arr, 8, arr.length));
        System.out.println(knapsack2(dp, wt, pr,8 , wt.length));
        
        
    }
    
}
