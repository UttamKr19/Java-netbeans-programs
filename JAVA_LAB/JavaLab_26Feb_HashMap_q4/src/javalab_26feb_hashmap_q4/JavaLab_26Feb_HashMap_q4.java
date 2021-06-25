
package javalab_26feb_hashmap_q4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Uttam
 */
public class JavaLab_26Feb_HashMap_q4 {

    /**
     * @param args the command line arguments
     */
    static HashMap<String, Integer> contacts = new HashMap<>();
	
	static void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	static void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "ContactList [contacts=" + contacts + "]";
	}
	
	static boolean doesContactNameExist(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	static boolean doesContactNumberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			//System.out.println(me.getValue() + " == " + number + " :: " + (me.getValue() == number));
			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	
	static void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
    public static void main(String[] args) {
        // TODO code application logic here
                addContact("Bob Biswas", 98310983);
		addContact("Police", 100);
		addContact("Alice", 98765432);
				
		System.out.println("Police: " + doesContactNameExist("Police"));
		System.out.println("98765432: " + doesContactNumberExist(98765432));
		
		System.out.println();
		listAllContacts();
    }
    
}
