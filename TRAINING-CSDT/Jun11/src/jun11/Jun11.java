/*
===>9771055599
*/
package jun11;
import java.util.*;
public class Jun11 {
    
    int x=90,y=80;
    
    void swapV(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
        
        System.out.println("swapV: "+x+" "+y);
    }
    
    
    void swapR(Jun11 ob)
    {
        int temp=ob.x;
        ob.x=ob.y;
        ob.y=temp;
        System.out.println("swapR: "+x+" "+y);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //int x=10,y=20;
        Jun11 obj=new Jun11();
        obj.x=sc.nextInt();
        
        obj.swapR(obj);
        obj.swapV(2, 3);
        System.out.println(obj.x+" "+obj.y);

    }   
}