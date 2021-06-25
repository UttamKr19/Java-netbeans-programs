/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author Uttam
 */
public class NewClass implements ActionListener{
    NewClass(){
       
    }
    
    
   public static void main(String[] args) {  
        Frame f=new Frame("ActionListener Example");  
        final TextField tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        Button b=new Button("Click Here");  
        b.setBounds(50,100,60,30);  
        //2nd step  
        b.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
                    tf.setText("Welcome to Javatpoint.");  
            }  
        });  
        
        f.add(b);f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    //3rd step  

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
