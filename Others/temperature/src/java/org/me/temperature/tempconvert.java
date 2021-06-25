/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.temperature;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "tempconvert")
public class tempconvert {

    /**
     * This is a sample web service operation
     */
    
    static int facto(int n){
        if(n<=1)
            return 1;
        return facto(n-1)*n;
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "FtoC")
    public float FtoC(@WebParam(name = "temp") float faren){
        float cel = (float)5/9*(faren-32);
        return cel;
    }
    
    
    @WebMethod(operationName = "fact")
    public int fact(@WebParam(name = "facto") int n){
        return facto(n);
    }

}
