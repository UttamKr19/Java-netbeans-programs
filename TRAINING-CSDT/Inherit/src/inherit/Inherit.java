package inherit;

public class Inherit extends B {
    Inherit()
    {
        int b=898;
        //super();
        System.out.println("Inherit const");
    }
    public static void main(String[] args) {

        System.out.println("Start");
        
        Inherit obji=new Inherit();
        
        //A obja=new A();
        //B objb=new B(8); 
        //System.out.println("");
        //objb.test();
        C objc=new C();
        System.out.println(objc.ccc);
       
        
        //objc.methA();
        //objc.methB();
        //objc.methC();
        
        //System.out.println(objc.a+objc.b+objc.c);
        //System.out.println(obji.aa);
        
        
    }
    
}
