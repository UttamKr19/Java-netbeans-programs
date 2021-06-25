/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycledetect;

import java.util.HashSet;

/**
 *
 * @author Uttam
 */


class node{ 
        int data;
        node next;
}

public class CycleDetect {
    node head; 
    
   
    
    void addNode(int x){
        
        node newNode=new node();
        newNode.data=x;
        newNode.next=null;
        
        
        if(head==null){
            head=newNode;
        }
        else{
            node i=head;
            while(i.next!=null)
                i=i.next;
            
            i.next=newNode;
        }
    }
    
    void display(){
        for(node i=head;i!=null;i=i.next){
                System.out.print(i.data+" ");
            }
    }
    
    void detectCyc(node head){
         HashSet<node> s = new HashSet<>(); 
         int flag=0;
        while(head!= null) { 
            
            if (s.contains(head)){
                flag=1;
                break;
            }
            
            s.add(head); 
  
            head= head.next; 
        } 
        if(flag==0){
            System.out.println("No cycle detected");
        }else
             System.out.println("Cycle detected");
        
    }

    public static void main(String[] args) {
        CycleDetect ob=new CycleDetect();
        ob.addNode(12);
        node temp=ob.head;
        ob.addNode(56);
        ob.addNode(2);
        ob.addNode(28);
        ob.addNode(16);
        
        System.out.println("\nNormal Linked list");
        ob.display();
        ob.detectCyc(temp);
        
        temp.next.next=temp.next;
        System.out.println("for Linked list with cycle");
        ob.detectCyc(temp);
        
    }
    
}
