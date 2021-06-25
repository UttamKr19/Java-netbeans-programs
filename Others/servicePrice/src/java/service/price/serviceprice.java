/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.price;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Uttam
 */
@WebService(serviceName = "serviceprice")
public class serviceprice {

    /**
     * This is a sample web service operation
     */
    static ArrayList<Integer> arr=new ArrayList<>();
    static void addElements(){
        arr.add(3443);
        arr.add(979);
        arr.add(13434);
        arr.add(90860);
        arr.add(9563443);
    }
    static int price(int n){
        addElements();
        return arr.get(n);
    }
    
    @WebMethod(operationName = "price")
    public String getPrice(@WebParam(name = "price") int n) {
        //int a=arr[n];
        System.out.println(arr);
        return "price: " + price(n) + "!";
    }
    
}
