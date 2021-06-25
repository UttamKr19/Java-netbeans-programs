/*
=>>>Class and objects
syntax:
class classname 
{
//attributes
//behaviours
}

class Employee
{
int eid;
String name;
String address;

void getinfo()
{
//statements
}
void display()
{
//stm
}

#How to access member of class
    class members-> 1. Instance member( Att,methods,etc)
                    2. Static member( Att,methods,etc)

1. If we want to access instance member of class then we first create obj of class
    Syntax:
    classneme objectname=new classname();
    Employee e1=new Employee();
    Employee e2=new Employee();

2. After creating obj of class, we are able to access instance member of class.
    Syntax:
    objectname.instanceMemberOfClass;
    e1.getinfo();//method calling
    e1.id=33;//instance variable initialization

*/

package jun6;
import java.util.*;
public class Jun6 {
    Jun6()
    {
        System.out.println("Jun6 const");
    }
    int eid;
    String name;
    String address;
    
    String name1;
    
    void getinfo(){
        Scanner sc=new Scanner(System.in);
      
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter address: ");
        address=sc.nextLine();   
        System.out.print("Enter id: ");
        eid=sc.nextInt();
    }
    
    void meth()
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.print("Enter name: ");
        name1=sc.nextLine();
    }
    
    void disp()
    {
        System.out.println("Id: "+ eid);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
    }
    
    void show()
    {
        System.out.println(name1);
    }
    
    
    public static void main(String[] args) {
            
        System.err.println("Welcome");
        Jun6 e1=new Jun6();
        e1.getinfo();
        System.out.println("\nDetails of employee:");
        System.out.println("");
        e1.disp();
        
        
    }
    
}
