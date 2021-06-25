
package binarytree;

import java.util.ArrayList;

class node{
    int data;
    node left;
    node right;
    

    node(){
        left=null;
        right=null;
    }
    
    node(int a){
        data=a;
        left=null;
        right=null;
    }
}

public class BinaryTree {

    static void levelOrderTraversal(node ref){
        ArrayList<node> arr=new ArrayList<>();
        
        
        if(ref==null)
            return;
        
        System.out.print(ref.data+" ");
        if(ref.left!=null){
           arr.add(ref.left);
        }
        if(ref.right!=null){
           arr.add(ref.right);
        }
        
        while(!arr.isEmpty()){
            System.out.print(arr.get(0).data+" ");
            node cur=arr.remove(0);
            if(cur.left!=null){
               arr.add(cur.left);
            }
            if(cur.right!=null){
               arr.add(cur.right);
            }
        }
    }
    
    static void preOrder(node ref){
        if(ref==null)
            return;
        
        System.out.print(" "+ref.data);
        preOrder(ref.left);
        preOrder(ref.right);
        
    }
    
    static void inOrder(node ref){
        if(ref==null)
            return;
        
        inOrder(ref.left);
        System.out.print(" "+ref.data);
        inOrder(ref.right);
        
    }
    
    static void postOrder(node ref){
        if(ref==null)
            return;
        
        postOrder(ref.left);
        postOrder(ref.right);
        System.out.print(" "+ref.data);
        
    }
    
    static int heightOfTree(node ref){
        if(ref==null)
            return 0;
        
        return 1 + Math.max(heightOfTree(ref.left), heightOfTree(ref.right));
    }
    
    
    static void printLevel(node ref,int l,int n){
        if(ref==null)
            return;
        
        if(n==l){
            System.out.print(ref.data+ " ");
            return;
        }
        
        
        printLevel(ref.left,l,n+1);
        printLevel(ref.right,l,n+1);
        
        
    }
    
    static void leftView(node ref){
        if(ref==null)
            return;
        
        ArrayList<node> arr=new ArrayList<>();
        ArrayList<Integer> brr=new ArrayList<>();
        
        int lev=1;
        
        System.out.print(ref.data+" ");
        brr.add(lev);
        
        lev++;
        if(ref.left!=null){
           arr.add(ref.left);
           brr.add(lev);
        }
        if(ref.right!=null){
           arr.add(ref.right);
           brr.add(lev);
        }
        
        if(ref.left==null && ref.right==null){
            System.out.print(ref.data+ " ");
            return;
        }
        
        int h=heightOfTree(ref);
        
        while(lev<=h){
            //System.out.print(arr.get(0).data+" ");
            node cur=arr.get(0);
            lev++;
            if(cur.left!=null){
               arr.add(cur.left);
               brr.add(lev);
            }
            if(cur.right!=null){
               arr.add(cur.right);
               brr.add(lev);
            }
        }
        
        System.out.println(arr.get(0)+" ");
        
        System.out.println(brr);
        for(int i=0;i<brr.size()-1;i++){
            if(brr.get(i)<brr.get(i+1)){
                System.out.print(arr.get(i+1).data+" ");
            }
        }
    }
    
    static void levelOrderPrint(node ref){
        int h=heightOfTree(ref);
        
        for(int i=1;i<=h;i++){
            printLevel(ref, i, 1);
        }
    }
    
    //--------
    
    static int levelWidth(node ref,int lev){
        if(ref==null)
            return 0;
        
        if(lev==1)
            return 1;
        
        return levelWidth(ref.left, lev-1)+levelWidth(ref.right, lev-1);
    }
    
    
    static int widthLeft(node ref,int l,int r){
        if(ref==null)
            return 0;
        
        return 0;
    }
    static int width(node ref,int l,int r){
        if(ref==null)
            return 0;
        l=width(ref.left,l+1,r);
        r=width(ref.right, l, r+1);
        
        return l-r;
        
        
        ///return 1 + width(ref.left)+ width(ref.right);
    }
    
    //============
    
    //---------------
    
    static void viewUtil(node ref,int l,int n, ArrayList<node> arr){
        if(ref==null)
            return;
        
        if(n==l){
            arr.add(ref);
            return;
        }
        
        
        viewUtil(ref.left,l,n+1,arr);
        viewUtil(ref.right,l,n+1,arr);
        
        
    }
    
    static void viewLeft(node ref){
        int h=heightOfTree(ref);
        ArrayList<node> arr=new ArrayList<>();
        for(int i=1;i<=h;i++){
            viewUtil(ref, i, 1,arr);
            System.out.print(arr.get(0).data+" ");
            arr.clear();
        }
    }
    
    static void viewRight(node ref){
        int h=heightOfTree(ref);
        ArrayList<node> arr=new ArrayList<>();
        for(int i=1;i<=h;i++){
            viewUtil(ref, i, 1,arr);
            System.out.print(arr.get(arr.size()-1).data+" ");
            arr.clear();
        }
    }
    
    
    
    //========================
    
    static void mirror(node ref){
        if(ref==null)
            return;
        
        if(ref.left!=null && ref.right!=null){
            
            mirror(ref.left);
            mirror(ref.right);
            
            node temp=ref.left;
            ref.left=ref.right;
            ref.right=temp;
        }
        
        if(ref.left==null && ref.right!=null){
            
            mirror(ref.right);
            ref.left=ref.right;
            ref.right=null;
        }
        
        if(ref.left!=null && ref.right==null){
            
            mirror(ref.left);
            ref.right=ref.left;
            ref.left=null;
        }
    }
    
    public static void main(String[] args) {
        
        node a=new node(5);
        a.left=new node(6);
        a.right=new node(8);
        a.left.left=new node(32);
        a.left.right=new node(53);
        a.right.left=new node(64);
        a.right.right=new node(90);
        a.right.right.right=new node(123);
        a.left.right.left=new node(99);
        
        /*
              5
            /   \
          6       8
         / \     / \
        32  53  64  90
           /          \
         99           123
        
        */
        
       
        System.out.println("");
        
        System.out.println(levelWidth(a, 3));
        
        
        
        
        
        
        
        System.out.println("");
        
    }
    
}
