/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication257;
import xoriant.newclass;


/**
 *
 * @author Uttam
 */
public class JavaApplication257 extends Thread{
    
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    
        
        Thread t=new Thread();
        
        for(int i=0;i<5;i++){
            System.out.println(i);
            t.sleep(100);
        }
        t.start();
        System.out.println(t.isAlive());
        
        t.suspend();
        System.out.println(t.isAlive());
        
        t.join();
        System.out.println(t.isAlive());
        
        
    }
    
}


