/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.security.*;
/**
 *
 * @author Uttam
 */
public class FinalLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            String abc="apple";
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");

            keyPairGen.initialize(1024);
            
            KeyPair pair = keyPairGen.generateKeyPair();

            PrivateKey privKey = pair.getPrivate();
            
            Signature sign = Signature.getInstance("SHA256withDSA");

            sign.initSign(privKey);
            byte[] bytes = abc.getBytes();

            sign.update(bytes);

            byte[] signature = sign.sign();
            
            System.out.println("Digital signature ASCII: \n"+new String(signature, "ASCII"));
            System.out.println("Digital signature UTF-8: \n"+new String(signature, "UTF-8"));
        
        }
        catch(Exception e){
            System.out.println("Exception "+ e);
        }
    }
    
}
