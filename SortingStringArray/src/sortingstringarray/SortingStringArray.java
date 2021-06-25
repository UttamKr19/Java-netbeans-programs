/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingstringarray;

/**
 *
 * @author Uttam
 */
public class SortingStringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[]={"dfg","uiughb","dcvh","jkji","1jajv","akda"};
        //System.out.println(Integer.toString(a,16));
        //54 21 56 2 85
        for(String st:arr)
            System.out.print(st+" ");
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) > 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println("");
            for(String st:arr)
                System.out.print(st+" ");
            
        }
        
        System.out.println("\n");
        for(String st:arr)
            System.out.print(st+" ");
    }
    
}
