
package pract;
import java.util.*;
/**
 *
 * @author Uttam
 */
public class Pract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<String> ts=new TreeSet<>();
        ts.add("jfdl");
        ts.add("fj");
        
        
        Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Bangladesh", "Dhaka");
		
		// a) Check if a particular key exists or not 
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
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
                
                }
    
    }
    
}
