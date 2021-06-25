/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Uttam
 */
public class Greedy {

    
//================================================================================
    static class kp{
        //Double cost; 
        double wt, val, ind; 
         
        public kp(int wt, int val, int ind) 
        { 
            this.wt = wt; 
            this.val = val; 
            this.ind = ind; 
            //cost = new Double(val/wt ); 
        } 
    }
    
    static double fractionalKnapsack(int kp,int pro[],int w[]){
        
        kp arr[]=new kp[w.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=new kp(w[i],pro[i],i);
        }
        
        
        Arrays.sort(arr, new Comparator<kp>(){ 
            
            @Override
            public int compare(kp x,kp y)  
            { 
                double a=x.val/x.wt;
                double b=y.val/y.wt;
                if(a<b)
                    return 1;
                else 
                    return -1;
            } 
        }); 
        
        double totalW=0;
        double totalP=0;
        for(int i=0;i<arr.length;i++){
            double pp=arr[i].val;
            double ww=arr[i].wt;
            double pwr=pp/ww;
            
            
            if((totalW+ww)<=kp){
                totalW=totalW+ww;
                totalP=totalP+pp;
            }
            else{
                double tmp=kp-totalW;
                double frP=tmp*pp/ww;
                
                totalP=totalP+frP;
                break;
                
            }
        }
        return totalP;
        
    }
    
    //========================================================================
    
    static int minPlatform(int arr[],int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int needed=1;
        int plat=1;
        for(int i=1,j=0;i<arr.length && j<arr.length;){
            if(arr[i]<=dep[j]){
                if(needed>plat)
                    needed++;
                
                i++;
            }
            else{
                plat--;
                j++;
            }
        }
        return needed;
    }
    
    //==========================================================================
    
    //===============================================================================
   
    
    static int activitySelection(int st[],int end[]){
        
        //sort end[], and st[] according to end[];
        
        for(int i=0;i<end.length;i++){
            for(int j=0;j<end.length-1;j++){
                if(end[j]>end[j+1]){
                    int tmp=end[j];
                    end[j]=end[j+1];
                    end[j+1]=tmp;
                    
                    int tmp2=st[j];
                    st[j]=st[j+1];
                    st[j+1]=tmp2;
                }
            }
        }
        
        
        int count=1;
        int selected=0;
        System.out.println("ACT "+st[0]+" "+end[0]);
        for(int i=1;i<end.length;i++){
            
            if(st[i]>=end[selected]){
                System.out.println("ACT "+st[i]+" "+end[i]);
                count++;
                selected=i;
                
            }
        }
        
        return count;
        
    }
    
    //=======================================================================
    
    static int gcd(int a,int b){
        if(b==0)
            return a;
        
        return gcd(b,a%b);
    }
    static void eqyptianFraction(int n,int d){
        
        if(n==1){
            System.out.println("1/"+ d);
            return;
        }
        
        
        double tmp=Math.ceil(d/n);
        int t=(int)tmp+1;
        
        System.out.println("1/"+t);
        
        int newN=(n*t)-(d*1);
        int newD=d*t;
        
        int g=gcd(newN,newD);
        newN=newN/g;
        newD=newD/g;
        
        eqyptianFraction(newN,newD);
        
        
    }
    //=======================================================================
    
    
    static int maxOfArray(int[] arr){
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    
    static int jobSequencingWithDeadlines(int prof[],int dead[]){
        
        
        for(int i=0;i<prof.length;i++){
            for(int j=0;j<prof.length-1;j++){
                if(prof[j]<prof[j+1]){
                    int tmp=prof[j];
                    prof[j]=prof[j+1];
                    prof[j+1]=tmp;
                    
                    int tmp2=dead[j];
                    dead[j]=dead[j+1];
                    dead[j+1]=tmp2;
                }
            }
        }
        
        int maxD=maxOfArray(dead);
        int slot[]=new int[maxD];
        Arrays.fill(slot, 0);
        
        slot[dead[0]-1]=1;
        int totProfit=prof[0];
        
        for(int i=1;i<prof.length;i++){
            
            int ind=dead[i]-1;
            if(slot[ind]==0){
                slot[ind]=1;
                totProfit+=prof[i];
            }
            else{
                for(int j=ind-1; j>=0; j--){
                    if(slot[j]==0){
                        slot[j]=1;
                        totProfit+=prof[i];
                    }
                }
            }
            
        }
        
        return totProfit;
        
    }
    
    //=======================================================================
    
    
    
    //=======================================================================
    
    public static void main(String[] args) {
        
        
        
    }
    
}
