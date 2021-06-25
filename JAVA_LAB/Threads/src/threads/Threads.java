/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import com.sun.webkit.ThemeClient;

/**
 *
 * @author Uttam
 */
public class Threads extends Thread{

    int i=5;
    @Override
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args){
        
        try{
            Threads ob=new Threads();
            ob.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
