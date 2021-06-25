
package javalab_26feb_hashmap_q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Uttam
 */
public class JavaLab_26Feb_hashmap_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Bangladesh", "Dhaka");
		
		// a) Check if a particular key exists or not 
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals("Japan")) {
				System.out.println("Key Japan exists");
				break;
			}
		}
		
		// b) Check if a particular value exists or not 
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		
		// c) Use Iterator to loop through the map key set
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
        
//        Iterator it=hs.entrySet().iterator();
//        while (it.hasNext()) { 
//            Map.Entry mapElement = (Map.Entry)it.next(); 
//            String v= (String)mapElement.getValue(); 
//            System.out.println(mapElement.getKey() + " : " + v); 
//        } 
        
        System.out.println("");
    }
    
}
}
