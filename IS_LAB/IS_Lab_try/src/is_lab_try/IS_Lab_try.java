/*
 *Substitution Cipher
 */
package is_lab_try;

import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class IS_Lab_try {

  
   
    public static void main(String[] args) {
      
        
        String s1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char alpha[]=s1.toCharArray();
        String s2="deBcfQktKLMoghpHIJaRSTxyzAVvDNOijFqruWXCsbYUuwGlmnEPZ";
        char key[]=s2.toCharArray();
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plain text: ");
        String str=sc.nextLine();
        String encryp="";
        //char enc[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < 52; j++)
            {
                if(str.charAt(i)==' '){
                    encryp+=' ';
                    break;
                }
                else if (str.charAt(i)==alpha[j])
                {
                    //enc[i] = key[j];
                    encryp+=key[j];
                    break;
                }
            }
        }
        
        
        
        //char dec[] = new char[encryp.length()];
        String decryp="";
        
        for (int i = 0; i < encryp.length(); i++)
        {
            for (int j = 0; j < 52; j++)
            {
                if(encryp.charAt(i)==' '){
                    decryp+=' ';
                    break;
                }
                else if (encryp.charAt(i)==key[j])
                {
                    //dec[i]=alpha[j];
                    decryp+=alpha[j];
                    break;
                }
            }
        }
        
        //System.out.println("\nOutput: "+(new String(dec)));
        //System.out.println(decryp);
        System.out.println("\nPlain Text: "+str);
        System.out.println("Encrypted Text: "+encryp);
        System.out.println("Decrypted Text: "+decryp);
    }
    
    
    
}
