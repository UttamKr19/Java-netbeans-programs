
package jun3b;
import java.util.*;
public class Jun3b {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.print("Enter a character: ");
        c=sc.next().charAt(0);
        
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
          
        }
    }
    
}
