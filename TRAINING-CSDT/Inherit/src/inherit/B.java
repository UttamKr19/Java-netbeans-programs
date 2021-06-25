package inherit;
public class B extends A{
    int b=2,x=5;
    private int bb=22;
    protected int bbb=222;
    
    B(){
        //super(99);
        System.out.println("B()");
    }
    
    B(int x)
    {
        System.out.println("B(x)");
        bb=x;
    }
    
    void methB(){
        System.err.println("methB");
        System.out.println("Ab: "+a+" "+"aa"+" "+aaa);
        System.out.println("Bb: "+b+" "+bb+" "+bbb);
        
    }
    void test(){
        System.err.println("x: "+x+" super.x: "+super.x);
    }
 
    
}
