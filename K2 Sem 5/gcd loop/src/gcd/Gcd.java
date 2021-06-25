
package gcd;
import java.util.*;

public class Gcd {
    
    int grec(int a,int b){
       if(a==0)
           return b;
       return grec(b%a,a);
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Gcd o=new Gcd();
        
        System.out.println("Enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int t=1;
        
        // Approach 1- loop  
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                t=i;
            }
        }
        System.out.println("Approach 1: "+t);
        
        
        //Approach 2- subtract
        
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        System.out.println("Approach 2: "+a);
        
        
        while(a!=b)
        {
            if(a>b){
                a=a%b;
                
                if(a==0){
                    System.out.println("g is "+b);
                    break;
                }
                
            }
            else{
                b=b%a;
                if(b==0){
                    System.out.println("g is "+a);
                    break;
                }
                
            }
        }
        
        System.out.println("Approach extra: "+a);
        
        
        //Approach 3- recursion(Euclidean)
        
        System.out.println("Approach 3: "+o.grec(a,b));
        
        
        
        
    }
    
}
