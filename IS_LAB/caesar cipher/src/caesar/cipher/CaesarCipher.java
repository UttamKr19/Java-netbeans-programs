package caesar.cipher;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String st=sc.nextLine();
        System.out.println("Shift position: ");
        int d=sc.nextInt();
        String out="";
        System.out.println(st);
        
       
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            int asc=(int)ch;
            if(ch==' ')
                out+=' ';
            else if(ch>='a' && ch<='z'){
                if(asc+d <= (int)'z')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'z'+(int)'a'-1);
                
            }
            else if(ch>='A' && ch<='Z'){
                if(asc+d<=(int)'Z')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'Z'+(int)'A'-1);
                
            }
            else if(ch>='0' && ch<='9'){
                if(asc+d<=(int)'9')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'9'+(int)'0'-1);
                
            }
            else if(ch>='!' && ch<='/'){
                if(asc+d<=(int)'/')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'/'+(int)'!'-1);
                
            }
            else if(ch>=':' && ch<='@'){
                if(asc+d<=(int)'@')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'@'+(int)':'-1);
                
            }
            else if(ch>='[' && ch<='`'){
                if(asc+d<=(int)'`')
                    out+=(char)(asc+d);
                else
                    out+=(char)(asc+d-(int)'`'+(int)'['-1);
                
            }
        }
        
        System.out.println(out);
        
    }
    
}
