/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningswing5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static javafx.util.Duration.hours;
import javax.swing.*;

/**
 *
 * @author Uttam
 */
public class LearningSwing5 implements Runnable {

    /**
     * @param args the command line arguments
     */
    JFrame f;  
    JLabel l;
    Thread t=null;  
    int hours=0, minutes=0, seconds=0;  
    String timeString = "";  
    
     public void run(){
        
        int hours,minutes,seconds;
        
        try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance(); 
            //System.out.println(cal);
            hours = Calendar.HOUR_OF_DAY ;  
            if ( hours > 12 ) hours -= 12;  
            minutes = Calendar.MINUTE;  
            seconds = Calendar.SECOND;  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            String timeString = formatter.format( date );  
  
            l.setText(timeString);
            //System.out.println(hours+" "+minutes+ " "+seconds);
  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
 }  
 
     void fun(){
        f=new JFrame("Time");
        l=new JLabel("32ra");
        l.setBounds(50,50,50,50);
        l.setVisible(true);
        
        t=new Thread(this);
        t.start();
        
        
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
        
    public static void main(String[] args)  {
        // TODO code application logic here
        new LearningSwing5().fun();
        
        
        
    }
    
}
