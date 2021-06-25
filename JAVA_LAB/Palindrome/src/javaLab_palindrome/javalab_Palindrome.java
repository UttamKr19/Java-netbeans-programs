/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab_palindrome;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class javalab_Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String n=sc.next();
        StringBuilder st=new StringBuilder(n);
        
        st.reverse();
        
        String m=new String(st);
        if(m.equals(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
        
        
    }
    
}
