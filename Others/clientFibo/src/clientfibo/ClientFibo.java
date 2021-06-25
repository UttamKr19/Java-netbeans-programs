/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfibo;

import org.service.ServiceFibonacci_Service;
import org.service.ServiceFibonacci;

/**
 *
 * @author Uttam
 */
public class ClientFibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceFibonacci_Service ser=new ServiceFibonacci_Service();
        ServiceFibonacci port=ser.getServiceFibonacciPort();
        System.out.println(port.fibo(6));
    }
    
}
