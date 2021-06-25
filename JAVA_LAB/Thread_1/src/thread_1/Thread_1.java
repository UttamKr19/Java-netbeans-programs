package thread_1;

public class Thread_1 extends Thread{

    public void run(){
        System.out.println("thread_1 run mehtod invoked");
    }
    public static void main(String[] args) {
        
        Thread t1=new Thread();
        new Thread_1().start();
        
    }
    
}
