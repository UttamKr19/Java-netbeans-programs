package earth;
public class Aliens {
        int age,aa,bb;
        Aliens() //Constructor
        {
            age=1500;
            //System.err.println("Inside Aliens mthd");       
            //System.out.println("aliens age "+ age);
            
            System.out.println("Basic constructor");
                
        }
        Aliens(int a,int b) // Parameterized constructor
        {
            aa=a;
            bb=b;
            System.out.println("Parameterized const:" + aa*bb);
            
        }
        
        Aliens(int a)
        {
            aa=a;
            System.out.println("Single parameter:" +aa);
        }
        
        
}
