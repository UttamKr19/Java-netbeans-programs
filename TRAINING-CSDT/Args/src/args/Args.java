package args;
public class Args {
    int a=20,b=30;
    int x,y;
    
    public void swap(int x,int y)
    {
        int t;
        t=x;
        x=y;
        y=t;
        System.err.println("Inside method "+x+ " "+ y);
    }
            

    void swapRef(Args Aobj)
    {
        int t;
        t=Aobj.a;
        Aobj.a=Aobj.b;
        Aobj.b=t;
        
    }
    
    static void abc()
    {
        System.out.println("method abc");
    }
    
    public void abcc(){
        System.out.println("method abccc");
    }
    
    public static void main(String[] args) {
        
        // ob1.x=41; ob1.y=85;
        
        Args ob1=new Args();
        NewClass ob2=new NewClass(85,3);
        NewClass ob3=new NewClass();
        
        ob1.swap(ob1.a,ob1.b);
        System.out.println("Val "+ ob1.a+" "+ob1.b);
        
        ob2.swapRef(ob2);
        System.out.println("Ref:  "+ ob2.a+" "+ob2.b);
       
        ob3.swapRef2(ob1);
        //ob1.swapRef(ob1); 
        System.out.println("REF2 "+ob1.a+" "+ ob1.b);
        
        //Args obj2=new Args();
        //obj2.abcc();
        
        
    }
    
}
