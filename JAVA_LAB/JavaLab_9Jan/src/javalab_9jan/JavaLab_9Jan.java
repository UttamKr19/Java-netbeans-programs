/*
4.Ravi and Kumar are working on an assignment. 
Ravi takes 6 hours to type 32 pages on a computer, 
while Kumar takes 5 hours to type 40 pages. 
Design an algorithm to calculate how 
much time they will take, working together on two different
computers to type an assignment of 110 pages.

 */
package javalab_9jan;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class JavaLab_9Jan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        double a=(6/(double)32)*110;
        double b=(5/(double)40)*110;
        
        
    
        System.out.println("Time: "+((a*b)/(a+b)));
    }
    
}
