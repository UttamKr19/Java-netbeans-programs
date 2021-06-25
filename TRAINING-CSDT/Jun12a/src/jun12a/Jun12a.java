/*
==>Inheritance - It is a mechanism for inheriting one class attr and behaviour through another
    class. In this mechanism, one object acquires all the properties and behaviours of a parent object.
    The idea behind inheritance in java is that you can create new classes that are built upon existing classes.
    Inherited class is called super class/base class/parent class and the inheriting class is called sub/derived/child class.


*/
package jun12a;

import newpackage.NewClass;

class test extends NewClass{
   int x=10,y=20;
    
    void meth1()
    {
        System.out.println("meth1");
    }
    
    void swap(test ob)
    {
        int temp=ob.x;
        ob.x=ob.y;
        ob.y=temp;
    } 
    
    void swap(test ob,int x,int y){
        int temp=this.x;
        this.x=this.y;
        this.y=temp;
    }
    
}

public class Jun12a extends test {

    void meth2()
    {
        System.out.println("meth2");
    }
    
    public static void main(String[] args) {
        Jun12a ob=new Jun12a();
        
        /*ob.meth0();
        ob.meth1();
        ob.meth2();
        ob.sor();
        System.out.println("");
        ob.ssort();
        ob.bsearch();
*/
        test t=new test();
        System.out.println("t.x,y: "+ t.x+" "+t.y);
        
        t.swap(t);
        System.out.println("t.x,y: "+ t.x+" "+t.y);
        
        t.swap(t, t.x, t.y);
        System.out.println("t.x,y: "+ t.x+" "+t.y);
       
        
    }   
}
