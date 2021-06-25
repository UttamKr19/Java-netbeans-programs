package duplicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(2);
        ar.add(4);
        ar.add(2);
        ar.add(6);
        ar.add(8);
        ar.add(5);
        ar.add(9);
        ar.add(2);
        ar.add(4);
        ar.add(2);
        ar.add(4);
        ar.add(2);
        ar.add(4);
        
        
        
        //iterator i;
        System.out.println(ar);
        
        Collections.sort(ar);
        System.out.println(ar);
        ArrayList br=new ArrayList();
        for(int i=0;i<ar.size()-1;i++){
            if(ar.get(i)==ar.get(i+1)){
               br.add(ar.get(i));
               i++;
            }
            else{
                br.add(ar.get(i));
            }
        }
        
        System.out.println(br);
        
    }
    
}
