/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist19feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Uttam
 */
public class LinkedList19feb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        
        arr.add("Uttam");
        arr.add("Kumar");
        arr.add("hello");
        arr.add("bello");
        arr.add("mello");

        //set method
        arr.set(2,"SET");
        
        //printing initial elements
        System.out.println("==> Initial elements");
        for(String s:arr)
            System.out.print(" "+s);
        
        //get method
        System.out.println("\n------------------------------");
        System.out.println("==> GET element of index 1 "+arr.get(1));
        
        //remove method-----------------------------------
        System.out.println("\n---------------------------");
        arr.remove("Kumar");
        System.out.println("==> After removing Kumar");
        for(String s:arr)
            System.out.print(" "+s);
        
        //adding more elements at end-----------------------
        System.out.println("\n------------------------------");
        arr.add(0, "Uttt");
        System.out.println("==> After adding Utt at index 0");
        for(String s:arr)
            System.out.println(" "+s);
        
        //serching element---------------------------------
        System.out.println("\n---------------------------------");
        System.out.println("Enter element you want to search");
        
        String search=sc.next();
        if(arr.contains(search))
            System.out.println("Element is present in list");
        else
            System.out.println("Element is not present in list");
        
        
        //add all
        //Appending another list
        
        String str[]=new String[]{"ball","cat"};
        List<String> brr=Arrays.asList(str);
        arr.addAll(2, brr);
        
        System.out.println("\n-----------------------------");
        System.out.println("==> After appeding another list");
        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        
        
        //remove all
        System.out.println("\n--------------------------------");
        arr.removeAll(brr);
        System.out.println("\n==> After remove all");
        System.out.println(arr);
        
        
        //sublist--------------------------------------------
        System.out.println("\n----------------------------");
        arr.add("zzz");
        arr.add("yyy");
        arr.add("ccc");
        System.out.println("==> Sublist "+arr.subList(2, 4));
        
        //size
        System.out.println("\n-----------------------------------");
        System.out.println("==> Size of final list \n"+arr.size());
        
        
        //List iterator
        System.out.println("\n----------------------------");
        System.out.println("==> List iterator display reverse");
        ListIterator<String> li=arr.listIterator();
        while(li.hasNext()){
            li.next();
        }
        
        while(li.hasPrevious()){
            System.out.print(" "+li.previous()); 
        }
        
        //clear
        System.out.println("\n-----------------------------");
        arr.clear();
        System.out.println("==> Size after clear()"+arr.size());
  
        
    }
    
}
