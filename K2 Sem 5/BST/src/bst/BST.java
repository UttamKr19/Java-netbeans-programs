package bst;

/*
 * @author Uttam
 */

//================== node structure =================
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

public class BST {
    
    node head; int count; int lh,rh;//global head

    
    node insert(int x,node headRef){
            node temp=headRef,temp2;
            
            if(headRef==null){
                headRef=new node(x);
                return headRef;
            }
            
            while(headRef!=null)
            {
                if(x<headRef.data){
                    temp=headRef;
                    headRef=headRef.left;
                }
                else if(x>headRef.data){
                    temp=headRef;
                    headRef=headRef.right;
                }
                else{
                    System.out.println("Element "+x+" already present");
                    return headRef;
                }
                
            }
            
            if(x<temp.data)
            {
                temp.left=new node(x);
                temp2=temp.left;
            }
            else{
                temp.right=new node(x);
                temp2=temp.left;
            }
            
            return temp2;
    }
    
    
    //============= traverse pre order=================
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
    
    
    
      
    //------------------search parent
    
    node searchParent(int x,node headRef){
        node temp=headRef,temp2;
            
            if(headRef==null){
                return null;
            }
            if(headRef.data==x){
                return null;
            }
            
            while(headRef!=null)
            {
                //temp=headRef;
                
                if(x<headRef.data){
                    temp=headRef;
                    headRef=headRef.left;
                }
                else if(x>headRef.data){
                    temp=headRef;
                    headRef=headRef.right;
                }
                else if(x==headRef.data){
                    return temp;
                }
                
            }
            
            return null;
    }
    

    //=============search node=============================
    node searchNode(int x,node ref){
        
        if(ref==null){
            return null;
        }
        
        while(ref!=null){
            if(ref.data==x){
                return ref;
            }
            else if(x>ref.data){
                ref=ref.right;
            }
            else{
                ref=ref.left;
            }
        }
        return null;
    }
    
//===========================node count=========================
    int nodeCount(node ref){
       //count=0;
       
       if(ref!=null)
        {
            nodeCount(ref.left);
            count++;
            nodeCount(ref.right);
            
            
        }
        
        
       return count;
    }
    
 //==================check if bst or not=======Naive
    boolean checkBST(node ref){
        
        if(ref==null){
            return true;
        }
        else if(ref.left!=null && ref.left.data>ref.data){
            return false;
        }
        else if(ref.right!=null && ref.right.data<ref.data){
            return false;
        }
        
        if(checkBST(ref.left)==false ||checkBST(ref.right)==false )
            return false;
        
        return true;

    }
    
    
    //==========================delete=====================incomplete
    void delete(int x,node ref){
        node par=searchParent(x, ref);
        node delNode=searchNode(x, ref);
        if(delNode.left==null && delNode.right==null){
            
            if(par.right.data==x){
                    par.right=null;
                }
            else if(par.left.data==x){
                    par.left=null;
                }
        }
        if(delNode.left==null || delNode.right==null){
            
           if(delNode.left==null && delNode.right!=null){
            
                if(par.right.data==x){
                    par.right=delNode.right;
                }
                else if(par.left.data==x){
                    par.left=delNode.right;
                }
            
            }
            else if(delNode.left!=null && delNode.right==null){

                if(par.left.data==x){
                    par.left=delNode.left;
                }
                else if(par.left.data==x){
                    par.right=delNode.left;
                }

            }
        }
    }
    
    
    //=======================height======================
    int treeHeight(node ref){
        if(ref==null)
            return 0;
        else{
            
            lh=treeHeight(ref.left);
            rh=treeHeight(ref.right);
            
            if(lh>rh){
                return lh+1;
            }else
                return rh+1;
        }
        
    }
    
//========================= main function ========================
    public static void main(String[] args) {

        BST obj=new BST();
       
        
        obj.head=obj.insert(100, obj.head);
        
        obj.insert(50, obj.head);
        obj.insert(150, obj.head);
        obj.insert(800, obj.head);
        obj.insert(40, obj.head);        
        obj.insert(50, obj.head); // repeating element
        obj.insert(170, obj.head);
        obj.insert(120, obj.head);
        obj.insert(7, obj.head);
        obj.insert(45, obj.head);

        System.out.println("In-order");
        obj.displayIn(obj.head);
        System.out.println("");
        
        System.out.println("After deleting 7");
        obj.delete(7, obj.head);
        
        System.out.println("Pre-order");
        obj.displayPre(obj.head);
        System.out.println("");
         System.out.println("In-order");
        obj.displayIn(obj.head);
        System.out.println("");
        
        //System.out.println("Search :"+obj.searchNode(150, obj.head).data);
        
        System.out.println("No of nodes: "+ obj.nodeCount(obj.head));
        
        System.out.println("Height: "+obj.treeHeight(obj.head));
        
        //System.out.println("Parent :"+obj.searchParent(800, obj.head).data);
        
        System.out.println("BST or not: "+obj.checkBST(obj.head));
        
    }
 
    
}
