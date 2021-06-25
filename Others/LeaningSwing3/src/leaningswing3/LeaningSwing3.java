/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaningswing3;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Uttam
 */
public class LeaningSwing3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f=new JFrame();
        JProgressBar pb=new JProgressBar(0, 100);
        
        
        pb.setBounds(40,40,160,30);         
        pb.setValue(0);    
        pb.setStringPainted(true); 
        
        f.add(pb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int i=0;
        
        while(i<=100){    
            pb.setValue(i);    
            i=i+5;    
            try{Thread.sleep(150);}catch(Exception e){}    
        }    
        
    }
    
}
