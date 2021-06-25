package jun6a;
import java.util.*;
public class Jun6a {

    public static void main(String[] args) {
        // TODO code application logic here
        System.err.println("Welcome");
        Employee e1=new Employee();
        e1.getinfo();
        System.out.println("\nDetails of employee:");
        System.out.println("");
        e1.disp();
    }
    
}

class Employee
{
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
}