/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation1")
    public String operation1(@WebParam(name = "par1") int par1, @WebParam(name = "par2") int par2, @WebParam(name = "par3") String par3) {
        //TODO write your implementation code here:
        
        par3=par3+" "+(par1+par2);
        
        return par3;
    }
    
    @WebMethod(operationName = "operation2")
    public String operation2(@WebParam(name = "par1") int a, @WebParam(name = "par2") int b) {
        
        return ""+(a+b);
    }
}
