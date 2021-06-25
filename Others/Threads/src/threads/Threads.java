/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

class abc implements Runnable {
    Thread t;
    abc(){
        t=new Thread(this);
        System.out.println("===========abc");
        t.start();
    }
    public void run(){
        try{
          for(int i=0;i<5;i++){
              System.out.println("  "+i);
              Thread.sleep(500);
          } 
        }
        catch(Exception e){
            System.out.println("exception abc");
        }
        
    }
}

public class Threads implements Runnable{
    Thread t = new Thread(this);
    
    public void run(){
        try{
            
            for(int i=0;i<5;i++){
                System.out.println(""+(char)(i+97));
                t.sleep(500);
            } 
          }
          catch(Exception e){
              System.out.println("exception abc");
          }
    }
    
    public static void main(String[] args) throws InterruptedException {
        try{
            Threads ob=new Threads();
            ob.t.start();
            ob.t.join();
            abc ob1=new abc();
            System.out.println("Prii "+ob.t.getPriority());
            
        
        }
        catch(Exception e){
            
        }
        
    }
    
}
