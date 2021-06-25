package linkedlist;

import java.util.Scanner;

//-------------------node----------------
class node{ 
        int data;
        node next;
}


public class LinkedList {

    node head; //global
    
    //------------------------addNode----------------------------
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
    
    
    //------------searchNode--------------------------
    void search(int x){
        int flag=0;
        for(node i=head;i!=null;i=i.next){
                if(i.data==x){
                    System.out.println("Found");
                    flag=1;
                    break;
                }
            }
        if(flag==0)
            System.out.println("Not found");
    }
    
    //-------------length-----------------------
    int length(){
        int l=0;
        node i=head;
        
        if(head==null)
            return 0;
                
        while(i!=null){
            i=i.next;
            l++;
        }
        return l;
    }
    
    //--------------insert node-----------
    void insertNode(int elem,int pos){
        
        node newNode=new node();
        newNode.data=elem;
        
        
        if(pos<=0 || pos>length()+1){
            System.out.println("Can't insert at position "+pos);
            
        }
        else if(pos==1){
            node temp=head;
            head=newNode;
            newNode.next=temp;
        }
        else if(head==null)
        {
            head=newNode;
            newNode.next=null;
        }
        else if(pos==length()+1){
            node ref=head;
            while( ref.next!=null)
            {
                ref=ref.next;
            }
            ref.next=newNode;
            newNode.next=null;
        }
        else{
            node ref=head;
            int i=1;
            int n=length();
            while( i<=n)
            {
                if(i==pos-1)
                    break;
               
                i++;
                ref=ref.next;
                
            }
            
            node temp=ref.next;
            ref.next=newNode;
            newNode.next=temp;
            
        }
        
    }
    

    //--------------delete node-----------
    void deleteNode(int pos){
        if(pos<0 || pos> length()){
            System.out.println("Can't be deleted");
        }
        else if(pos==1){
            head=head.next;
        }
        else if(pos==length()){
            
            node temp=head;
            
            while(temp.next.next!=null){
                temp=temp.next;
            }
            
            temp.next=null;
            
        }
        else{
            node temp=head;
            int i=1;
            int n=length();
            while( i<=n)
            {
                if(i==pos-1)
                    break;
                
                temp=temp.next;
            }
            temp.next=temp.next.next;
            
        }
        
    }
    
    
    //--------------------reverse----------------------
    void reverse(){
        node pre=null;
        node cur=head;
        node nex;
       
        while(cur!=null){
            
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
            
        }
        head=pre;
        
    }
    
    
    //-------------display all nodes value-------------------
    void display(){
        for(node i=head;i!=null;i=i.next){
                System.out.print(i.data+" ");
            }
    }
    
    void displayRecursive(node head){
        if(head==null)
            return;
        System.out.print(head.data+ " ");
        displayRecursive(head.next);
        System.out.print(head.data+ " ");
    }
    
    //----------------------main fxn--------------------
    public static void main(String[] args) {
        
        LinkedList obj=new LinkedList();
        LinkedList obj2=new LinkedList();
        node l=new node();
        
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        
//        for(int i=0;i<n;i++){
//            int e=sc.nextInt();
//            obj.addNode(e);
//        }
        
       
        int arr[]={34,22,62,3,23,63,9};
        
        for(int i=0; i<arr.length;i++){
            obj.addNode(arr[i]);
        }
        
        for(int i=0; i<arr.length;i++){
            obj2.addNode(arr[i]);
        }
        
        obj.display();
        System.out.println("");
        System.out.print("Search 135: ");
        obj.search(135);
        System.out.print("Search 23: ");
        obj.search(23);
        System.out.println("\nlength: "+obj.length());
        //System.out.println(obj2.length());
        obj.insertNode(999, 3);
        obj.deleteNode(2);
        System.out.println("After deletion");
        obj.display();
        System.out.println("\nReverse");
        obj.reverse();
        obj.display();
        System.out.println("");
        obj.displayRecursive(obj.head);
        
        
        
        
        
    }
    
}
