package nest;
public class Nest {
    int a=1,aa;
    static int b=2,ba;
    final int c=3,cc;
    
    Nest()
    {
        cc=0;
        System.err.println("Nest class constructor");
    }
    
    void method1()
    {
        System.out.println("Inside method1");
        a=50; b=50;
        method2();
        System.out.println(a+" "+ b);
    }
    
    static void method2()
    {
        System.out.println("Inside method2 static");
        //a=100;   //non static
        //method1();   //non static
        b=100;
    }
        
        
    public class inner1{
        inner1(){
            System.out.println("inner1 constructor");
        }
        
        void inner1method()
        {
            System.out.println("Inside inner1method");
        }
        
    }
    
    public static class inner2{
        inner2(){
            System.out.println("inner2 constructor");
        }
        
        static void inner2method(int a,String ... str)
        {
            System.out.println("Inside inner2method "+ a);
            for(String x:str)
            {
                System.out.print(" "+ x);
            }
        }      
    }
    
    
 //-------------------------------MAIN----------------------------------------------
    public static void main(String[] args) {
            
        Nest ob1=new Nest();
        ob1.method1();
        method2();
        inner2 iob=new inner2();
        ob1.a=4;
        iob.inner2method(8,"aa","bb","cc","dd","ee");
        
        inner2.inner2method(78,"zz","xx","ff");
        
        System.out.println("");
        NestClass2 ob99=new NestClass2();
        NestClass2.NC2inner ob88= ob99.new NC2inner(); 
        ob88.NC2method();
        //NC2inner ob99=new NC2inner();
        //inner1 iob2=new inner1(); //when inner1 class is static
        Nest.inner1 iob2=ob1.new inner1();        
    }  
}
