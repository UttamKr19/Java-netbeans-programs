/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication167;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Uttam
 */
public class JavaApplication167 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<String> arr=new ArrayList<>();
    
    
    
    static void printComb(String str){
        int n=str.length();
        for(int i=0;i<(1<<n);i++){
            StringBuilder sb=new StringBuilder("");
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0){
                    sb.append(str.charAt(j));
                }
            }
            if(!sb.toString().equals(""))
                System.out.println(sb);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String st="abcd";
        printComb(st);
    }
    
}
