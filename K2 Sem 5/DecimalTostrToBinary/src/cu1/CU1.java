
package cu1;

import java.util.Arrays;
import java.lang.*;

public class CU1 {

    public static void main(String[] args) {
        
        double d=1.25;
        String s=Double.toString(d);
        System.out.println("Original decimal string "+s);
        
        byte[] b=s.getBytes();
        System.out.println("String array of ascii");
        System.out.println(Arrays.toString(b));
        

        System.out.println();
        
        for(int i=0;i<s.length();i++){
            System.out.print(b[i]);
        }
        
        System.out.println("\n");

        int abc;
        int arr[]=new int[(b.length)*6];
        String str[]=new String[s.length()];
        
        for(int i=0;i<s.length();i++){
            abc=Byte.toUnsignedInt(b[i]);
            str[i]=Integer.toBinaryString(abc);
        }
        
        
        for(int i=0;i<s.length();i++){
            System.out.print(str[i]);
        }
        
        System.out.println("");
        
        int arr2[]=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            arr2[i]=Integer.parseInt(str[i],2);
            System.out.print(Integer.parseInt(str[i],2)+" ");
        }
        
        System.out.println("");
        for(int i=0;i<s.length();i++){
            char c=(char)arr[i];
            System.out.println(c);
            System.out.print(Character.toString((char)arr[i]));
        }
        

    }
    
}
