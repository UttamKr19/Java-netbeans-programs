package box;
public class Box {
    
    public static void a() //Method static
    {
        System.out.println("Static");
    }
    
    public void b() //Method non static
    {
        System.out.println("Non static");
    }
    
    public void b(int b)
    {
        System.out.println("overload mtd "+b);
    }
   
    public static void main(String[] args) {
        
        box1 obj1=new box1();
        box1 obj2=new box1(5,4);
        
        System.out.println(obj1.vol());
       
        System.out.println(obj2.vol());  
        
        obj1.len=8;
        obj1.bre=2;
        System.out.println(obj1.vol());
       
       obj2.len=10;
       System.out.println(obj2.vol());
       System.out.println("vol overload "+(double)obj2.vol(58,2));
 
       a();
       Box bb=new Box();
       bb.b();
       bb.b(5);
       
       abc ob1=new abc();
       
       
    }
    
public static class abc //class static.. can't compile w/o static
{
    int a=54;
    abc()
    {
        System.out.println("Const abc class");
    }
}

}
