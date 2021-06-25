/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jul19;

import java.io.IOException;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class gen<t>{
    
    t obj;
    
    t genFunGet(t o){
      return o;  
    }
    
    gen(t o){
        obj= o;
    }
    
}

public class Jul19 {

    public static void main(String[] args) throws IOException {
       
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(new Integer(33));
        arr.add(88);
        System.out.println(arr);
        for(int i=2;i<6;i++)
        {
            arr.add(i+3);
        }
        
        System.out.println(arr.get(2));
        
        Integer ia[] = new Integer[arr.size()];
        ia = arr.toArray(ia);

        System.out.println(ia[2]);
        
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.addFirst(34);
        ll.addLast(22);
        System.out.println(ll);
        
        System.out.println(ll.get(2));
        
        Queue<Integer> q=new LinkedList<>();
        q.add(34);
        q.add(44);
        q.add(54);
        System.out.println(q.peek());
        
        Stack<Integer> st=new Stack<>();
        
        st.push(3);
        st.push(33);
        st.add(9);
        System.out.println(st);
        while(!st.isEmpty()){
            System.out.println(st.pop()+ " ");
            
        }
        
        Iterator<Integer> ii=st.iterator();
        while(ii.hasNext()){
            System.out.println(ii.next());
        }
        
        Collections.reverse(ll);
        System.out.println(ll);
        Collections.sort(arr);
        System.out.println(arr);
        
        List<Integer> n;
        n=new LinkedList<>();
        
        
        
      
       
    }
       
        
        
        
        
    }
    
}
