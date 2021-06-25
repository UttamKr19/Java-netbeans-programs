package nest;
public class NestClass2 {
    
    int p,q;
    static int r,s;
    
    NestClass2()
    {
        System.out.println("NestClass2 constructor");
    }
    
    void method001()
    {
        System.out.println("Inside method001");
        Nest.method2();
    }
    
    static void method002()
    {
        System.out.println("Inside method002 static");
        Nest.method2();
    }
    
    public class NC2inner{
        NC2inner(){
            System.out.println("NC2inner()");
        }
        
        void NC2method()
        {
            System.out.println("NC2method()");
        }
    }
    
}
