package javalab_palindrome2;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class JavaLab_palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String st=sc.next();
       
        
        int mid;
        String a,b;
        if(st.length()%2==0){
            mid=(st.length()/2)-1;
            a=st.substring(0, mid+1);
        }
        else{
            mid=(st.length()/2);
            a=st.substring(0, mid);
        }
        
        StringBuilder sb=new StringBuilder(st.subSequence(mid+1,st.length()));
        sb.reverse();
        b=new String(sb);
        
        if(a.equals(b))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
    }
    
}
