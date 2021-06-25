package jun6b;
import java.util.*;
public class Jun6b {
    
    public static void main(String[] args) {
     
        Teacher t=new Teacher();
        
        Teacher obj[]=new Teacher[4];
        
        for(int i=0;i<3;i++)
        {
            obj[i]=new Teacher();
            obj[i].meth();
        }
        
        System.out.println("\n");
        
        for(int i=0;i<3;i++)
        {
            obj[i].meth2();
        }
        
    }
    
}

class Teacher{
    
    Teacher()
    {
        System.out.println("Teacher constructor");
    }
    
    int eid;
    String name;
    String phone;
    String qualification;
    int temp;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter phone: ");
        phone=sc.nextLine();   
        System.out.print("Enter id: ");
        eid=sc.nextInt();
    }
    
    void disp()
    {
        System.out.println("Name: "+name);
        System.out.println("Id: "+eid);
        System.out.println("Phone: "+phone);
    }
    
    void meth()
    {
        Scanner s=new Scanner(System.in);
        temp=s.nextInt();
    }
    
    void meth2()
    {
        System.out.println(temp);
    }
}
