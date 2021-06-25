package bintree ;

import java.util.Scanner;

//-------------------node----------------
class node{ 
        int data;
        node left;
        node right;
        
        node(int x){
            data=x;
            left=null;
            right=null;
        }
}


public class Bintree{

    node head; int h=0; //global
    
    //------------------------addNode----------------------------
    void addNode(int x){
        
        node newNode=new node(x);
        
        if(head==null){
            head=newNode;
        }
        else{
            node ref;
            ref=head;
            
            while(ref.left!=null&&ref.right!=null){
                ref=ref.left;
            }
        }
            
    }
    
    //----------------traverse------------------------
    void traversePost(node refHead){
        
        
        if(refHead!=null)
        {
            
            displayPost(refHead.left);
            displayPost(refHead.right);
            //System.out.print(refHead.data+ " ");
            
        }
   
    }
    
    //-------------display all nodes value-------------------
    void displayPost(node refHead){
        
        
        if(refHead!=null)
        {
            
            displayPost(refHead.left);
            displayPost(refHead.right);
            System.out.print(refHead.data+ " ");
            
        }
   
    }
    
    void displayPre(node refHead){
        
        
        if(refHead!=null)
        {
            
            System.out.print(refHead.data+ " ");
            displayPre(refHead.left);
            displayPre(refHead.right);
            
            
        }
   
    }

    void displayIn(node refHead){
        
        
        if(refHead!=null)
        {
            
            displayIn(refHead.left);
            System.out.print(refHead.data+ " ");
            displayIn(refHead.right);
            
            
        }
   
    }
    //---------------search----------------------todo
    void search(int x){
        
    }
    
    
    //---------------bfs--------------todo
    int Height(node refHead){
        if(refHead.left!=null || refHead.right!=null){
            
            if(refHead.left!=null){
                Height(refHead.left);
            }
            else if(refHead.right!=null){
                Height(refHead.right);
            }
            h++;
        }
        return h;
    }
    
    //----------------------main fxn--------------------
    public static void main(String[] args) {
        
        Bintree obj=new Bintree();
        
//        node newNode1=new node(100);
//        node newNode2=new node(50);
//        node newNode3=new node(150);
//        node newNode4=new node(30);
//        node newNode5=new node(60);
//        node newNode6=new node(120);
//        node newNode7=new node(170);
        
        node newNode1=new node(11);
        node newNode2=new node(22);
        node newNode3=new node(33);
        node newNode4=new node(44);
        node newNode5=new node(55);
        node newNode6=new node(66);
        node newNode7=new node(77);
        
        
        obj.head=newNode1;
        
        newNode1.left=newNode2;
        newNode1.right=newNode3;
        
        newNode2.left=newNode4;
        newNode2.right=newNode5;
        
        newNode3.left=newNode6;
        newNode3.right=newNode7;
        
        System.out.print("Post: ");
        obj.displayPost(obj.head);
        System.out.println("");
                

        System.out.print("Pre: ");
        obj.displayPre(obj.head);
        System.out.println("");
        
        System.out.print("In: ");
        obj.displayIn(obj.head);
        System.out.println("");
        
        System.out.println(obj.Height(obj.head));
        
    }
    
}
