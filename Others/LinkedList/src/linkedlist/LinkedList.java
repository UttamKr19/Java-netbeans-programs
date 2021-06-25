
package linkedlist;

/**
 *
 * @author Uttam
 */

class node{
    int data;
    node next;
    
    
    node(){
        next=null;
    }
    
    node(int a){
        data=a;
        next=null;
    }
}




public class LinkedList {
    
    static void display(node a){
        for(node ref=a; ref!=null; ref=ref.next){
            System.out.print(" "+ref.data);
        }
        System.out.println("");
    }
    
    
    static node reverseWithoutLoop(node ref){
        
        if(ref==null)
            return null;
        
        if(ref.next==null){
            return ref;
        }
        
        node abc=ref.next;
        node tmp=reverseWithoutLoop(ref.next);
        //System.out.println(abc.data);
        abc.next=ref;
        ref.next=null;
        
        return tmp;
    }
    
    public static void main(String[] args) {
        
        
        node a=new node(21);
        node b=new node(52);
        node c=new node(13);
        node d=new node(84);
        node e=new node(15);
        node f=new node(26);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
        System.out.println("Initial List: ");
        display(a);
        node rev=reverseWithoutLoop(a);
        System.out.println("Reversed List: ");
        display(rev);
    }
    
}
