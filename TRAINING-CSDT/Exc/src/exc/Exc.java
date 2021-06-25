package exc;
public class Exc {
    
    static void m()
    {
        System.out.println("m()");
    }
    
    public static void main(String[] args) {

        try
        {    
            System.out.println(47/8);
            System.out.println("outer try");
            
            try{
                System.out.println("middle try");
                
                try{
                    System.out.println("innerrrr try");
                    ahk=-k;=5;
                    System.out.println("inner most, after Exception");
                    }
                catch(Exception i){
                    System.out.println(i);
                    }
                finally{
                    System.out.println("Finnallllllllyyyyyy");
                }
                System.out.println("111111");
            }
            catch(Exception i)
            {
                System.out.println("cat "+i);
            }
            System.out.println("222222");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("3333333");
        System.out.println("=+====+====+====+=");
        

    }
    
}

class abc{
    static void m2()
    {
        System.out.println("m2()");
    }
}
