package excep3;
public class Excep3 {
    
    static void meth()throws ArithmeticException,
            IllegalAccessError,ArrayIndexOutOfBoundsException,
            Error,IllegalAccessError
    {
        System.out.println(b);
    }
        
    
    public static void main(String[] args) {
        try{
        Excep3.meth();
        }
        catch(IllegalAccessError i)
        {
            System.out.println("Illegal");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic");
        }
        catch(Exception e)
        {
            System.out.println("other  "+ e);
        }
        finally{
            System.out.println("Finally block");
        }
        
    }
    
}
