package interf;

public class InterF implements NewInterface1,NewInterface2 {
    
    InterF()
    {
        System.err.println("InterF constructor");
    }
    
    @Override
    public void disp()
    {
        System.out.println("disp");
    }
    
    @Override
    public void disp(int a)
    {
        System.out.println("disp(int "+a+")");
    }
    
    @Override
    public void meth1()
    {
        System.out.println("meth1");
    }
    
    @Override
    public void meth2()
    {
        System.out.println("meth2");
    }
    
    
    public static void main(String[] args) {
       
        InterF obj=new InterF();
        obj.disp();
        
        NewInterface1 ob1=new InterF();
        NewInterface2 ob2=new InterF();
        NewInterface1 ob3=obj;
        ob1.disp();
        ob2.disp(85);
        
        
    }
    
}
