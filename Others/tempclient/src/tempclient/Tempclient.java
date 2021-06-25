/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempclient;

/**
 *
 * @author Uttam
 */
public class Tempclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===========================================");
        System.out.println(ftoC(342));
        System.out.println(fact(5));
        
        
    }

    private static float ftoC(float temp) {
        org.me.tempclient.Tempconvert_Service service = new org.me.tempclient.Tempconvert_Service();
        org.me.tempclient.Tempconvert port = service.getTempconvertPort();
        return port.ftoC(temp);
    }

    private static int fact(int facto) {
        org.me.tempclient.Tempconvert_Service service = new org.me.tempclient.Tempconvert_Service();
        org.me.tempclient.Tempconvert port = service.getTempconvertPort();
        return port.fact(facto);
    }
    
}
