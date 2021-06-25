/*
 7.Design an algorithm to find the greatest number that will divide 43, 91 and 183
    so as to leave the same remainder in each case.
 */
package javalab_9jana;

/**
 *
 * @author Uttam
 */
public class Javalab_9janA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flag=0;
        for(int i=43;i>=1;i--){
            int a=43%i;
            int b=91%i;
            int c=183%i;
            
            if(a==b && b==c)
            {
                System.out.println(i);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("__");
    }
    
}
