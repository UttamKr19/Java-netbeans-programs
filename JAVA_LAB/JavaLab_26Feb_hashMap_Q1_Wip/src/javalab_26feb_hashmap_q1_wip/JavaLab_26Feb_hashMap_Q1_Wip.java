
package javalab_26feb_hashmap_q1_wip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Uttam
 */
public class JavaLab_26Feb_hashMap_Q1_Wip {


    static HashMap<String, String> M1=new HashMap<>();
	
	
	
	static HashMap<String,String>saveCountryCapital(String CountryName,String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	static String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	static String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	static HashMap<String, String> swapKeyValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	static ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}

        public static void main(String[] args) {
                // TODO code application logic here
                        saveCountryCapital("India", "Delhi");
                        saveCountryCapital("Japan", "Tokyo");
                        saveCountryCapital("USA", "Washtn.");
                        saveCountryCapital("SA", "Cape Town");
                        

                        System.out.println(getCapital("India"));
                        System.out.println(getCountry("Tokyo"));
                        
                        System.out.println(toArrayList());

                        HashMap<String, String> M2 = swapKeyValue();
                        System.out.println(M2);
            }
    
}
