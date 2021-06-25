package jun11b;
import jun10b.*;
//import jun10.Jun10;

public class Jun11b extends Jun10b {
    Jun11b()
    {
        System.out.println("constructor");
    }
    
    Jun11b(int x)
    {
        System.out.println("Constr. Parameterised: "+x);
    }
    
    
    void show()
    {
        System.out.println("show");
    }
    
    public static void main(String[] args) {
       
        Jun11b ob=new Jun11b();
        Jun10b obj=new Jun10b();
        ob.show();
        Jun11b ob1=new Jun11b(322);
        obj.ser();
        obj.a=33;
    }
    
}
