
package duplicate.j;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class duplicate {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st= sc.next();
        //System.out.println(st);
        System.out.println("");
    
        String out="";
        out+=st.charAt(0);
        //HashSet hh=new HashS
        for(int i=1;i<st.length();i++){
            int flag=0;
            
            for(int j=0;j<out.length();j++){
                if(st.charAt(i)==out.charAt(j)){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                out+=st.charAt(i);
       
        }
        
        System.out.println("String after removing duplicate chars \n"+out);
    }
}
