/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningswing6;

import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.*;

/**
 *
 * @author Uttam
 */
public class LearningSwing6 extends Canvas{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("dance.gif");  
        g.drawImage(i, 20,60, (ImageObserver) this);  
          
    }  
    
    public static void main(String[] args) {
        // TODO code application logic here
        LearningSwing6 m=new LearningSwing6();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
