
package power;

import java.util.Scanner;

public class Power {

    int powww(int a,int b){
        if (b == 0) 
            return 1; 
        
        int temp=powww(a,b/2);
        
        if (b % 2 == 0) 
            return temp*temp; 
        else
            return a*temp*temp;
    }

    
    int loop(int a,int b){
        int p=1;
        for(int i=1;i<=b;i++){
            p=p*a;
        }
        return p;
        
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Power o=new Power();
        
        System.out.println("Enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        
        
        
        System.out.println("Result "+o.powww(a, b));
        
        System.out.println("loop "+o.loop(a, b));
        
    }
    
}
