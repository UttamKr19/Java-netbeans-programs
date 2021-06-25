//Vowel consonant check
package may31f;
import java.util.*;
public class May31f {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch=sc.next().charAt(0);
        //A-65,E-69,I-73,O-79,U-85,Z-90
        //a-97,e-101,i-105,o-111,u-117,z-122
        int a=(int)ch;
        
        if((a<65)|| ((a>90)&&(a<97)) || (a>122))
            System.out.println("Entered charater is not an alphabet");
         
        else if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||
                (ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
        {
            System.out.println(ch+ " is a Vowel");
        }   
        else
            System.out.println(ch+" is a Consonant");
       
 
    }
}
