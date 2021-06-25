/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningswings2;

import java.awt.Cursor;
import javax.swing.*;  
import java.awt.event.*;
import javafx.scene.layout.Border;
public class LearningSwings2{

    public LearningSwings2() {
        
        JTextArea area;  
        JButton b;
        
        JFrame f= new JFrame();  

        JCheckBox c= new JCheckBox("abc");
        c.setBounds(100,100,100,30);
        
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange()==1?"checked":"unchecked");
                System.out.println(c.isSelected());
                if(!c.isSelected())
                    JOptionPane.showMessageDialog(f,"\nSSS");
            }
        });
        
        b=new JButton("Count Words"); 
        b.setBounds(100,300,120,30);  
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //area.append("\nHello");
                System.out.println(e.paramString());
                
            }
        });
        String column[]={"ID","NAME","SALARY"};         
        String data[][]={ {"1","A","670000"},    
                          {"2","B","780000"},    
                          {"3","C","700000"}};  
        
        JTable jt=new JTable(data,column);    
        jt.setBounds(30,40,200,200); 
        
        JScrollPane sp=new JScrollPane(jt);
        
        f.add(c);f.add(b); f.add(jt);f.add(sp);
        f.setSize(450,450);  
        f.setLayout(null);  
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        new LearningSwings2();
        System.out.println("abcdef".substring(0,5));
    }

    
}
