package args;

public class NewClass {
    int a,b;
    NewClass(int i,int j)
    {
        a=i; b=j;     
    } 
    
    NewClass()
    {
        System.err.println("Inside const() newcls");
    }
    
    void swapRef(NewClass Aobj)
    {
        int t;
        t=Aobj.a;
        Aobj.a=Aobj.b;
        Aobj.b=t;
    }
    
    void swapRef2(Args obj)
    {
        int t;
        t=obj.a;
        obj.a=obj.b;
        obj.b=t;
    }
}
