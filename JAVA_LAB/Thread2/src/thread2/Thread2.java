package thread2;

/**
 *
 * @author Uttam
 */
public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("running");
    }
    
    public static void main(String[] args) {
        Thread2 ob=new Thread2();
        Thread t=new Thread(ob);
        t.start();
    }

    
    
}
