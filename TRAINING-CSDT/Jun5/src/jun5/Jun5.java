package jun5;
import java.util.*;
public class Jun5 {

    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        int r=0;
        do{
            
            r=(n%10)+(r*10);
            n=n/10;
            
        }while(n>0);
        
        System.out.println("Reverse: "+r);
                
    }
    
}
