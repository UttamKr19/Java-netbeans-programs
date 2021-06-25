package is_lab.substitution.cipher;

import java.util.Scanner;

public class IS_labSubstitutionCipher {

       public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();

        String st1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String st2="goBklm89pqQDG3efJObcdW67HIaXLMCi45jRSKNTrstuPUYZ012VvhEFnwxyzA";
        String enc="";

        for (int i=0;i<inp.length();i++)
        {
            for(int j=0;j<62;j++){
                if(inp.charAt(i)==' '){
                    enc+=' ';
                    break;
                }
                if(inp.charAt(i)==st1.charAt(j)){
                    enc=enc+st2.charAt(j);
                    break;
                }
            }
        }
        System.out.println("Plain Text: "+inp);
        System.out.println("Encrypted Text: "+enc);
        String dec="";
        for (int i=0;i<enc.length();i++)
        {
            for(int j=0;j<62;j++){
                if(enc.charAt(i)==' '){
                    dec+=' ';
                    break;
                }
                if(enc.charAt(i)==st2.charAt(j)){
                    dec=dec+st1.charAt(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted Text: "+dec);
    }

}
