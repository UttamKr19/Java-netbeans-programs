/*
===> Methods: 
>Way of doing something
>It is group of statements that perform some specific task.It is a self contained sub program.
>The biggest advantage of creating/using method is reusability of code.
>With the help of method, we reduce complexity of program.

=>There are two types of methods:
1. Pre-defined methods
    > To use pre defined methods, we need to import the class to which the method belongs. 
       After importing class, we have to create object of the class and then 
        we can access the method through the created object.

2. User-defined methods
    > User defined methods can be categorized into four types according to return type
    and accept argument basis.

1. No return type and no accept argument value
syntax:
void methodname()
{
//statement
}

2. No return type but accept argument values
syntax:
void methodname(arg1,agr2,...){
//statements
}

3. Return type but no accept argument value
syntax:
datatype methodname()
{
//statements
return value;
}

4. Return type and accept argument values
syntax:
datatype methodname(arg1,arg2,...)
{
//statements
return value;
}
    
->General syntax of method
    <access specifier><return type/no return type> Mehtodname(arguments or no arguments)
    {
        //statements
    }

=>User defined methods can be categorized into two types according to calling basis
1.Call by value
    
2.Call by reference
    In call by reference, if any change occurs in called method the calling method is also affected
    


*/

package jun7a;
import java.util.*;
public class Jun7a {
    
    void sum()
    {
        System.out.println("NO RT/NO Args");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no.");
        int x=s.nextInt();
        int y=s.nextInt();
        
        System.out.println("Sum: "+(x+y));
    }
    
    
    void sum2(int x,int y)
    {
        
        System.out.println("Sum: "+(x+y));
    }
    
    int sum3()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no.");
        int x=s.nextInt();
        int y=s.nextInt();
        return (x+y);
    }
    
    int sum4(int x,int y)
    {
        
        return (x+y);
    }
    
    
    public static void main(String[] args) {

        System.out.println("");
        Jun7a obj=new Jun7a();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no.");
        int x=s.nextInt();
        int y=s.nextInt();
       

        System.out.println("Sum: "+obj.sum4(x,y));
    }
    
}

//WAP Reverse
//WAP Factorial
