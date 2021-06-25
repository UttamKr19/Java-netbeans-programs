/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.service;

import java.util.Arrays;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "serviceFibonacci")
public class serviceFibonacci {

    /**
     * This is a sample web service operation
     */
    static String fibo(int n){
        String res=null;
        
        int arr[]=new int[n+1];
        arr[0]=0;arr[1]=1;arr[2]=1;
        switch (n) {
            case 0:
                return "";
            case 1:
                return "0";
            case 2:
                return "0 1";
            case 3:
                return "0 1 1";
            default:
                break;
        }
        
        for(int i=3;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
            
        
        return Arrays.toString(arr);
    }
    @WebMethod(operationName = "fibo")
    public String hello(@WebParam(name = "fibo") int n) {
        return "Fibonacci Series: " + fibo(n);
    }
}
