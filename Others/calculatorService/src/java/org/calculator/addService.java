/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "addService")
public class addService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "num1") int a,@WebParam(name="num2")int b) {
        return ""+(a+b);
    }
    @WebMethod(operationName = "sub")
    public String sub(@WebParam(name = "num1") int a,@WebParam(name="num2")int b) {
        return ""+(a-b);
    }
    @WebMethod(operationName = "mul")
    public String mul(@WebParam(name = "num1") int a,@WebParam(name="num2")int b) {
        return ""+(a*b);
    }
    @WebMethod(operationName = "div")
    public String div(@WebParam(name = "num1") int a,@WebParam(name="num2")int b) {
        return ""+(a/b);
    }
}
