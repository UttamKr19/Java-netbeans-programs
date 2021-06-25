/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsse;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.*;
import java.security.spec.*;

/**
 *
 * @author Uttam
 */
public class WssE {

    /**
     * @param args the command line arguments
     */
    
    private static void generateKeys(String keyAlgorithm, int numBits) {
        
    try {
    
            KeyPairGenerator keyGen=KeyPairGenerator.getInstance(keyAlgorithm);
            keyGen.initialize(numBits);
            KeyPair keyPair=keyGen.genKeyPair();
            PrivateKey privateKey=keyPair.getPrivate();
            PublicKey publicKey=keyPair.getPublic();
            System.out.println("\nGenerating key using "+privateKey.getAlgorithm() +" algorithm");
            System.out.println("_____________________________________");
            
            byte[] privateKeyBytes=privateKey.getEncoded();
            byte[] publicKeyBytes=publicKey.getEncoded();

            System.out.println("Private Key : "+Base64.encode(privateKeyBytes));
            System.out.println("Public Key : "+Base64.encode(publicKeyBytes));

            KeyFactory keyFactory=KeyFactory.getInstance(keyAlgorithm);
            EncodedKeySpec privateKeySpec=new PKCS8EncodedKeySpec(privateKeyBytes);
            PrivateKey privateKey2 =keyFactory.generatePrivate(privateKeySpec);
            EncodedKeySpec publicKeySpec=new X509EncodedKeySpec(publicKeyBytes);
            PublicKey publicKey2 =keyFactory.generatePublic(publicKeySpec);

            System.out.println("Private keys equal? "+(privateKey.equals(privateKey2)?"Yes":"No"));
            System.out.println("Public keys equal? "+(publicKey.equals(publicKey2)?"Yes":"No"));
        } 
        catch(Exception e) {
            System.out.println("\nException\n"+e);
        } 
    }
    public static void main(String[] args) {
        
        generateKeys("DSA", 1024);
        generateKeys("DH", 576);
        generateKeys("RSA", 1024);
        generateKeys("EC", 256);
        
        
    }
    
}
