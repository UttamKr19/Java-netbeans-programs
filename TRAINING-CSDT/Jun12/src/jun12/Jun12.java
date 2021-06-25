/*
==> Polymorphism - It is a mechanism which provides a concept by which we can perform a single action
    in different ways. We can perform polymorphism in java by method overloading and method overriding.
    
1. Method overloading or compile time polymorphism or static binding
    In method overloading, a class has more than one method with same name.
    Method name is same but parameters are different.


2. Method overriding or run time polymorphism or dynamic binding
    



*/

package jun12;
import java.util.*;
public class Jun12 {
    
    void sum()
    {
        int a=9,b=4;
        System.out.println("Sum(): "+(a+b));
    }
    
    
    void sum(int a,int b)
    {
        System.out.println("Sum(int,int): "+(a+b));
    }
    
    
    void sum(double a,double b)
    {
        System.out.println("Sum(double,double): "+ (double)(a+b));
    }
    
    
    
    void sum(long a,long b)
    {
        System.out.println("Sum(long,long): "+(a+b));
    }
    
    
    public static void main(String[] args) {
           
        Jun12 ob=new Jun12();
        
        ob.sum();
        ob.sum(100,20);
        ob.sum(10.5,25.6);
        ob.sum(5l,66);
        System.out.println("");
        
        ob.sum(25.6,8);
        
        //ob.check(15,5.5);
    }
    
}
