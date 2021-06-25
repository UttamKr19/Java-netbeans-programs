
package excep2;

public class Excep2 {
    static int c=0;
    public static void main(String[] args) {
        
        try{
            String s="jslkdf";
            int a=0;
            if(a==0)
            {
                throw new ArithmeticException();
            }
            System.out.println("a: "+a);
            
        }
        catch(ArithmeticException e)
        {
            c++;
            System.out.println("Caught "+c);
            System.out.println(e);
            
            try{
                
            if(c==1){
                throw new ArrayIndexOutOfBoundsException();
                System.out.println("useless");
            }
            
               }
                catch(ArrayIndexOutOfBoundsException a)
                {
                    c++;
                    System.out.println("Caught "+c);
                    System.out.println(a);   
                }
        }
        
    }
    
}
