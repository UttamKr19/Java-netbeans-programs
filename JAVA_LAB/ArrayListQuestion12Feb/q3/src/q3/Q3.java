/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;

/**
 *
 * @author Uttam
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> ar=new ArrayList<>();
        try{
            ar.add("ajfvd");
            ar.add("ffdjh");
            ar.add("affjh");
            ar.add("fjhcv");
            ar.add("fjdfh");
        }catch(Exception e){
            System.out.println("Only Strings allowed");
        }
        
        
        for(String i:ar)
            System.out.println(i);
    }
    
}
