/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;


class abc{
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
        System.out.println(Thread.activeCount());
    }
}

public class Threads2 implements Runnable {

    Thread t=new Thread(this);
    Threads2(){
        try{
            t.start();
        }
        catch(Exception e){
            
        }
    }
    
    @Override
    public void run() {
        abc ob=new abc();
        
        ob.call("World");
    }
    
    public static void main(String[] args) {
        abc ob=new abc();
         
        Threads2 ob2 = new Threads2();
        try{
            ob2.t.join();
            ob.call("jdfl");
        }catch(Exception e){
            
        }
        
        
    }

    
    
}
