/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication158;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.KeyFactory;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.NoSuchAlgorithmException;
//import com.sun.jersey.core.util.Base64;
import static javafx.beans.binding.Bindings.and;


/**
 *
 * @author Uttam
 */


public class JavaApplication158 {

    
 private static void generateKeys(String keyAlgorithm, int numBits) {
    try {
    // Get the public/private key pair
        KeyPairGenerator keyGen=KeyPairGenerator.getInstance(keyAlgorithm);
        keyGen.initialize(numBits);
        KeyPair keyPair=keyGen.genKeyPair();
        PrivateKey privateKey=keyPair.getPrivate();
        PublicKey publicKey=keyPair.getPublic();
        System.out.println("\n"+"Generating key/value pair using "+privateKey.getAlgorithm() +" algorithm");
        // Get the bytes of the public and private keys
        byte[] privateKeyBytes=privateKey.getEncoded();
        byte[] publicKeyBytes=publicKey.getEncoded();
        // Get the formats of the encoded bytes
        String formatPrivate=privateKey.getFormat(); // PKCS#8
        String formatPublic=publicKey.getFormat(); // X.509
        
        System.out.println("Private Key : "+Base64.encode(privateKeyBytes));
        System.out.println("Public Key : "+Base64.encode(publicKeyBytes));
        // The bytes can be converted back to public and private key objects
        KeyFactory keyFactory=KeyFactory.getInstance(keyAlgorithm);
        EncodedKeySpec privateKeySpec=new PKCS8EncodedKeySpec(privateKeyBytes);
        PrivateKey privateKey2 =keyFactory.generatePrivate(privateKeySpec);
        EncodedKeySpec publicKeySpec=new X509EncodedKeySpec(publicKeyBytes);
        PublicKey publicKey2 =keyFactory.generatePublic(publicKeySpec);
        // The original and new keys are the same
        System.out.println(" Are both private keys equal? "+privateKey.equals(privateKey2));
        System.out.println(" Are both public keys equal? "+publicKey.equals(publicKey2));
        } 
        catch(Exception e) {
            System.out.println("Exception");
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        generateKeys("DSA", 1024);
        // Generate a 576-bit DH key pair
        generateKeys("DH", 576);
        // Generate a 1024-bit RSA key pair
        generateKeys("RSA", 1024);
        
        
    }
    
}
