
package thisk;

public class ThisK {
    
    public static void main(String[] args) {
        
        abc ob=new abc();
        ob.meth(2, 6);
        
        System.out.println("Main- a,b: " + ob.x + " " + ob.y);
    }
    
}


class abc{
    
    
    int a,b;
    int x,y;
    
    void meth(int x,int y){
        System.out.println("this x "+this.x );
        System.out.println("only x "+ x);
        this.x=x;
        this.y=y;
        System.out.println("ths x "+this.x);
        
        System.out.println("x,y: " + x + " " + y);
        System.out.println("a,b: " + x + " " + y);
    }
}
