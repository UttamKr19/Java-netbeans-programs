package inherit;
public class A {
    int a=1,x=1;
    private int aa=11;
    protected int aaa=111;
    
    A(){
        System.out.println("A()");
    }
    
    A(int a){
        System.out.println("afjafjal "+a+" fafadsf");
    }
    
    void methA(){
        System.err.println("mehtA()");
        System.out.println("Aa: "+a+" "+aa+" "+aaa);
    }
    
}
