/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

/**
 *
 * @author Uttam
 */
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int i = 3;
            int j = 4;
            String result = operation2(i, j);
            System.out.println("Result = " + result);
        }
        catch(Exception e){
            System.out.println("");
        }
    }

    private static String operation2(int par1, int par2) {
        com.me.ws.NewWebService_Service service = new com.me.ws.NewWebService_Service();
        com.me.ws.NewWebService port = service.getNewWebServicePort();
        return port.operation2(par1, par2);
    }
    
}
