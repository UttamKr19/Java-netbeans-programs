/*
8.Design an algorithm to print a pattern 
1
12
123
1234
12345

 */
package javalab_pattern;

/**
 *
 * @author Uttam
 */
public class JavaLab_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
