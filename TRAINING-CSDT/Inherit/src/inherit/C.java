package inherit;
public class C extends B{
    
    int c=3;int x=99;
    private int cc=33;
    protected int ccc=333;
    
    C(){
        B objct=new B(88);
        System.out.println("C()");
    }
    
    void methC(){
        System.err.println("methC");
        System.out.println("Ac: "+a+" "+"aa"+" "+aaa);
        System.out.println("Bc: "+b+" "+"bb"+" "+bbb);
        System.out.println("Cc: "+c+" "+cc+" "+ccc);
       
    }
    
    @Override
    void test()
    {
        System.out.println(" ");
    }
    
 
}
