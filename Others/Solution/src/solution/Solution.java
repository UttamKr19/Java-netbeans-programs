/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=sc.nextInt();
         for(int i=0;i<t;i++){
             int n=sc.nextInt();
             int k=sc.nextInt();
             int orgK=k;
             int count=0;
             boolean flag=false;
             int arr[]=new int[n];
             for(int j=0;j<n;j++){
                 arr[i]=sc.nextInt();
                 
                 if(arr[i]==k && arr[i]!=1){
                     if(flag==false)
                         flag=true;
                     
                     if(flag==true)
                        k--;
                 }
                 if(arr[i]==k && arr[i]==1){
                     count++;
                     k=orgK;
                     flag=false;
                 }
                 
             }
             
             System.out.println("Case #"+(i+1)+": "+count);
         }
    }
    
}
