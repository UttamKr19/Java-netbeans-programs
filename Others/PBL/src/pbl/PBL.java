/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

/**
 *
 * @author Uttam
 */
public class PBL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("heo");
        String input1="Hello World";
        int input2=1;
        
        int w = 0;
        input1 = input1.toLowerCase();
        System.out.println(input1);
        
        
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            if (Character.isAlphabetic((int) c)) {
                if (input2 == 0) {
                    if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                        w = w + ((int) c - (int) 'a'+1);
                    }
                } else {
                    w = w + ((int) c - (int) 'a'+1);
                }
            }
        }
        
        System.out.println(w);
        
    }
    
}
