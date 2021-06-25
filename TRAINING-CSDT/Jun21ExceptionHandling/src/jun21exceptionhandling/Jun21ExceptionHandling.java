package jun21exceptionhandling;
import java.util.*;

public class Jun21ExceptionHandling {

    void method1() throws ArithmeticException{
                throw new ArithmeticException("Calculation error");
    }

    void method2() throws ArithmeticException{ 
        method1();
    }

    void method3(){
    try{ method2();
    }catch(ArithmeticException e){

           System.out.println("ArithmeticException handled");
    }

}
    
    
    
    
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(a/b);
        
        Jun21ExceptionHandling ob=new Jun21ExceptionHandling();
        ob.method3();
    }catch(Exception e){
        System.out.println("Exception: "+e.getMessage());
    }finally{
            System.out.println("\nFinally block");
        }
    
}
    
}
