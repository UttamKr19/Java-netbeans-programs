/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poid1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class Poid1 {

    /**
     * @param args the command line arguments
     */
    static boolean isPalin(int n){
        String str=""+n;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
    
    static boolean mirr(int n){
        String str=""+n;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '9':
                    return false;
                
            }
        }
        return true;
    }
    
    static boolean isPrime(long a){
        if(a==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    
    static int maxi(int []arr){
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        
            if(arr[i]>res)
                res=arr[i];
        }
        return res;
    
    }
    
    static int[] fun(String s){
        int brr[]=new int[26];
        for(int i=0;i<s.length();i++){
            //System.out.println(s.charAt(i)+" "+i);
            brr[(int)(s.charAt(i)-'a')]++;
        }
        return brr;
    }
    
    static String lex(String s){
        int brr[]=new int[26];
        for(int i=0;i<s.length();i++){
            brr[(int)(s.charAt(i)-'a')]++;
        }
        
        String st1="";
        
        for(int i=0;i<26;i++){
            int h=brr[i];
            while(h-- >0){
                st1+=(char)(i+'a');
            }
        }
        return st1;
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	String st=sc.next();
	
	
        int arr[]=new int[n];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(st.charAt(i)=='1')
                al.add(i+1);
        }
        
        if(al.isEmpty()){
            for(int i=0;i<n;i++)
                System.out.print(0+" ");
            return;
        }
        
        if(al.size()==n){
            for(int i=n;i>0;i--){
                System.out.print(i+" ");
            }
            return;
        }
        
        if(al.size()==1){
            System.out.print(1+" ");
            for(int i=n-1;i>0;i--){
                System.out.print(0+" ");
            }
            return;
        }
        
        
        int brr[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
            brr[i]=al.get(i);
        
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<brr.length;j++){
                //System.out.println(i+" "+j);
                int tt=brr[j]+i-1;
                if(tt>=n){
                    break;
                }
                if(st.charAt(tt)=='1'){
                    arr[i]++;
                    //brr[i]++;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
            
        
        
    }
}


