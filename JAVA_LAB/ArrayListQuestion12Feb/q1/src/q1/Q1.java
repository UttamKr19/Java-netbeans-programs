/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;

/**
 *
 * @author Uttam
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> ar=new ArrayList<>();
        ar.add("Jan"); ar.add("Feb"); ar.add("Mar");
        ar.add("Apr"); ar.add("May"); ar.add("Jun");
        ar.add("Jul"); ar.add("Aug"); ar.add("Sep");
        ar.add("Oct"); ar.add("Nov"); ar.add("Dec");
        
        for(String s:ar)
            System.out.println(s);
    }
    
}
