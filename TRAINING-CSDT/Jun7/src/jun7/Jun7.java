package jun7;
public class Jun7 extends abc {

    static void method2()
     {
         System.out.println("STATIC METHOD");
     }

    public static void main(String[] args) {
        abc ob=new abc();    
        ob.id=123;
        System.out.println("ob.id: "+ob.id);
        abc ob2=new abc();
        ob2.method1();
        method2();
        method3();  
    }
    
}

class abc{
    abc()
    {
        a++;
        System.out.println("constructor "+a);
    }
    
    int id;
    static int a=0;
    String name;
    
     void method1()
     {
         id=9;
         System.out.println("id: "+9);
     }
     
     static void method3()
     {
         System.out.println("Static meth3");
     }
    
}