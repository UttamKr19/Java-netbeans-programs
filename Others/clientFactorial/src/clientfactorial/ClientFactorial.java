/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfactorial;

import com.client.ServiceFactorial;
import com.client.ServiceFactorial_Service;

/**
 *
 * @author Uttam
 */
public class ClientFactorial {
    public static void main(String[] args) {
        
        ServiceFactorial_Service service = new ServiceFactorial_Service();
        ServiceFactorial port = service.getServiceFactorialPort();
        
        System.out.println(port.factorial("5"));
        
    }
    
}
