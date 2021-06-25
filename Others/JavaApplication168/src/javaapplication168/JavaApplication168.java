/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication168;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Uttam
 */
public class JavaApplication168 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.height);
        System.out.println(screenSize.width);
        
        
        HashMap<String,String[]> map=new HashMap<>();
        //HashMap<String,String> answer=new HashMap<>();
        
        String t="";
        //String line[];
        String word;
        int ch;
//        try{
//            String path="C:\\Users\\Uttam\\Documents\\NetBeansProjects\\"
//                    + "UTTAM\\Sem8\\WordGames\\src\\data\\game2";
//            FileReader fr=new FileReader(path+"\\words.txt");
//            while ((ch=fr.read())!=-1){
//
//                t=t+(""+(char)ch);
//
//            }
//            String line[]=t.split("\n");
//
//            int r=(int)(Math.random() * (line.length-1));
//
//            String lineSplit[]=line[r].split(",");
//
//            String firstWord=lineSplit[0];
//            
//            String options[]={lineSplit[1],lineSplit[2],
//                    lineSplit[3],lineSplit[4]};
//
//            map.put(firstWord, options);
//            answer.put(firstWord, options[1]);
//            
//            
//            System.out.println(map.keySet());
//            System.out.println(answer.keySet());
//           
//        }catch(IOException e){
//            System.out.println("exc");
//        }

       String wordPool="";
       String keyValue="";
       HashSet<Integer> hash=new HashSet<>();
       try{
            String path="C:\\Users\\Uttam\\Documents\\NetBeansProjects\\"
                    + "UTTAM\\Sem8\\WordGames\\src\\data\\game2";
            
            FileReader fr=new FileReader(path+"\\word_pool.txt");
            FileReader fr2=new FileReader(path+"\\key_value.txt");
            while ((ch=fr.read())!=-1){
                wordPool+=(""+(char)ch);
            }
            
            while ((ch=fr2.read())!=-1){
                keyValue+=(""+(char)ch);
            }
            
            
            
            
            String[] keyValue_list=keyValue.split("\n");
            int r;
            do{
                r=(int)(Math.random() * (keyValue_list.length));
                
            }while(hash.contains(r));
            String question=keyValue_list[r].split(",")[0];
            String answer=keyValue_list[r].split(",")[1];
            
                    
            System.out.println(question+" "+answer);
        }catch(IOException e){
            System.out.println("exc");
        }
    }
    
}
