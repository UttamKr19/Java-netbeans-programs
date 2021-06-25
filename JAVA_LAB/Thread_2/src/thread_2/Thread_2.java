package thread_2;

class abc implements Runnable{
    public void run(){
        System.out.println("inside abc run");
        for(int i=0;i<5;i++){
            System.out.println("abc "+i);
        }
    }
}

class xyz extends Thread{
    public void run(){
        System.out.println("inside xyz run");
        for(int i=0;i<5;i++){
            
            System.out.println("xyz "+i);
        }
    }
}

public class Thread_2 implements Runnable {

    public void run(){
        System.out.println("inside thread run");
        for(int i=0;i<5;i++){
            System.out.println("thrd "+i);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
       
        Thread t1=new Thread(new Thread_2());
        Thread t2=new Thread(new abc());
        Thread t3=new Thread(new xyz());
        
        t1.start();
        t2.start();
        t2.join();
        t2.sleep(1000);
        t3.start();
        
        
    }
    
}
