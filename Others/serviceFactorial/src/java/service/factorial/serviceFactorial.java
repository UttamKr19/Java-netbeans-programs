/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "serviceFactorial")
public class serviceFactorial {

    /**
     * This is a sample web service operation
     */
    
    static int factorial(int n){
        if(n<=1)
            return 1;
        return factorial(n-1)*n;
    }
    
    @WebMethod(operationName = "factorial")
    public String hello(@WebParam(name = "factorial") String txt) {
        int a=Integer.parseInt(txt);
        return "Factorial: " + factorial(a) + ".";
    }
    
}
