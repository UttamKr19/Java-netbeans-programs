
package jun22_multithr;


public class Jun22_MultiThr {

    public static void main(String[] args) {
        
        A oA=new A();
        oA.start();
        
    
    }
    
}


class A extends Thread{
    @Override
    public void run(){
        System.out.println("HAHAHAHAHAHA");
        
        for(int i=1;i<8;i++)
        
            if(i>=3){
                try {
                    Thread.sleep(2000);
                    System.out.print(" "+i);
                } catch (InterruptedException ex) {
                    System.out.println("Exxxxccceeption");
                }
            }
            else{
                System.out.print(" "+i);
            }
    }
}