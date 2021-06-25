package jun3;
import java.util.*;
public class Jun3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int ch;
        ch=sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid input");
            
        }
        
        
        
    }
    
}
