/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningswing;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author Uttam
 */
class swing{
    swing(){
        JFrame fr=new JFrame("frame1");
        
        //button
        JButton butt=new JButton(new ImageIcon("E:\\project\\project\\Images\\png\\tag-title - Copy.png"));
        butt.setBounds(100,100,100, 40);
        
        //textFeild
        JTextField tf=new JTextField("Hello");
        tf.setBounds(100,300,100,40);
        
        butt.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){  
                tf.setText("Welcome");  
            }  
        });  
        
        JLabel jl1=new JLabel("label str");
        JLabel jl2=new JLabel(new ImageIcon("E:\\project\\"
                + "project\\Images\\png\\tag-title - Copy.png"));
        jl1.setCursor(new Cursor(1));
        jl1.setBounds(50, 200, 100, 60);
        
        
        fr.setBackground(Color.gray);
        fr.setSize(500,500);
        fr.add(butt); fr.add(tf); fr.add(jl1); fr.add(jl2);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class swing2 extends JFrame{
    swing2(){
        
        setBackground(Color.gray);
        setSize(500,500);
        
        JButton butt=new JButton("button");
        butt.setBounds(100,100,100, 40);
        
        add(butt);
        setLayout(null);
        setVisible(true);
        
    }
}
public class LearningSwing extends JFrame {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //new swing();
        JFrame jf=new JFrame();
        JLabel lab=new JLabel("aggg");
        lab.setBounds(300, 200, 200, 30);
        
        
        JTextField fld=new JTextField("www.google.com");
        fld.setBounds(200, 400, 200, 30);
        
        JButton bu=new JButton();
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("00000000000000");
            }
        });
        bu.setBounds(100, 100, 50, 30);
        
        
        JButton but=new JButton();
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String host=fld.getText();  
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();  
                    lab.setText("IP : "+ip);
                }catch(Exception ec){
                    lab.setText("error");
                }
            }
        });
        but.setBounds(450, 450, 50, 30);
        but.setVisible(true);
        but.setCursor(new Cursor(12));
        
        
        
        
        jf.add(lab);jf.add(bu); jf.add(fld);jf.add(but);
        jf.setSize(600,600);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
