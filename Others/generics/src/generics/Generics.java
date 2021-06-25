/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Uttam
 */

class gen<t>{
    t obj;
    
    gen(t ob){
        obj=ob;
    }
    
    void fun(){
        System.out.println(obj+" --> "+obj.getClass());
        System.out.println(getObj()+"\n");
    }

    public t getObj() {
        return obj;
    }
    
    
}


class genTwo<a,b,c>{
    a oba;
    b obb;
    c obc;
    
    genTwo(a ob1,b ob2,c ob3){
        oba=ob1;
        obb=ob2;
        obc=ob3;
    }
    
    void fun(){
        System.out.println(oba+" --> "+oba.getClass());
        System.out.println(obb+" --> "+obb.getClass());
        System.out.println(obc+" --> "+obc.getClass());
    }

    public c getObc() {
        return obc;
    }

    public a getOba() {
        return oba;
    }

    public b getObb() {
        return obb;
    }

}

class genNum<t extends Number>{
    t ob;

    public genNum(t obj) {
        ob=obj;
    }
    
    void fun(){
        System.out.println(ob+" --> "+ob.getClass());
        //System.out.println(getObj()+"\n");
    }
    
    
}

class genNumArr<t extends Number>{
    t ob[];

    public genNumArr(t obj[]) {
        ob=obj;
    }
    
    void disp(){
        for(t i:ob)
            System.out.print(" "+i);
    }
    
    
}


public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        gen<Integer> ob=new gen<>(32);
        ob.fun();
        
        System.out.println("=============================");
        
        genTwo<Integer,String,Double> obj=new genTwo<>(123,"abcd",42.42);
        obj.fun();
        
        System.out.println("=============================");
        
        genNum<Float> obb=new genNum<>(32.4f);
        obb.fun();
        
        System.out.println("=============================");
        
        Double arr[]={32.42,53.0,753.2};
        genNumArr<Double> obd =new genNumArr<>(arr);
        obd.disp();
        
        
        
    }
    
}
