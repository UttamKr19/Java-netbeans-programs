/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc;

import java.io.FileReader;
import java.util.*;

/**
 *
 * @author Uttam
 */
public class Cc {

    /**
     * @param args the command line arguments
     */
    static void q1(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            
            HashSet<Integer> hs=new HashSet<>();
            ArrayList<Integer> al=new ArrayList<>();
            
            for(int j=0;j<n;j++){
                al.add(sc.nextInt());
                hs.add(al.get(j));
            }


            int a=0;int b=0;
            for(int j=0;j<n;j++){
                int tm=m-al.get(i);
                if(hs.contains(tm)){
                    a=al.indexOf(tm)+1;
                    b=i+1;
                    break;
                }
            }
            
            int aaa[]=new int[3];
            List all=Arrays.asList(aaa);
            
            
            System.out.println(Math.min(a,b)+ " " +Math.max(a,b));
        }
    }
    
    static void q2(){
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<n;j++){
                al.add(sc.nextInt());
                
            }
            Collections.sort(al);
            
            int m=sc.nextInt();
            ArrayList<Integer> bl=new ArrayList<>();
            for(int j=0;j<m;j++){
                bl.add(sc.nextInt());
            }
            Collections.sort(bl);
            
            for(;al.size()>0;){
                int el=al.get(0);
                if(bl.contains((Object)el)){
                    al.remove((Object)el);
                    bl.remove((Object)el);
                }else{
                    //System.out.println(el);
                    al.remove((Object)el);
                }
            }
            for(int j=0;j<bl.size();j++){
                System.out.print(bl.get(j)+" ");
            }
            
            
        }
}
    
    
    static int q3(int sum,int n){
        
        if(sum==0)
            return 1;
        if(sum<0)
            return 0;
        if(n==0 && sum>0)
            return 0;
        
        
        return q3(sum,n-1) + q3(sum-n*n,n);
        
    }
    
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
    
    static void quickSort(int[] arr){
        int low=0; int high=arr.length-1;
        int res[]=quick(arr,low,high);
        for(int i=0;i<res.length;i++)
            System.out.println(" "+res[i]);
    }
    
    static int[] quick(int[]arr, int low,int high){
        
        if(low<high)
        {
            int part=partition(arr,low,high);
            quick(arr,low,part);
            quick(arr,part+1,high);
        }
        
        
        
        return arr;
    }
    
    static int partition(int arr[], int low, int high){
        
        int i=low;
        int j=high;
        int piv=arr[(low+high)/2];
        
        while(i<=j){
            while(arr[i]<piv){
                i++;
            }
            while(j>=0 && arr[j]>piv){
                j--;
            }
             
            if(i<=j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }
            else
                break;
           
        }
        
        return i;
        
    }
    
    
    public static void main(String aa[]) {
        // TODO code application logic here
        //int arr[]=new int[3];
        //int arr[]={56,456,324,46,1,6,345,234,4,412,15,5};
        String t="";
        String st[];
        try{
           int ch;
           FileReader fr=new FileReader("C:\\Users\\Uttam\\Documents\\words.txt");
           while ((ch=fr.read())!=-1){
               t=t+(""+(char)ch);
           }
           st=t.split("\r\n");
          
           
        }catch(Exception e){
            
        }
        
        
    }
    
}
