
package box;
public class box1 {
        int len,bre;
        box1()
        {
            System.err.println("Box1 const()");
        }
        
        box1(int l,int b)
        {
            System.err.println("Box1 const(l,b)");
            len=l;
            bre=b;
        }
        
        public int vol()
        {
            return len*bre;
        }
        
        public int vol(int a, int b)
        {
            return a*b;
        }
    
}
