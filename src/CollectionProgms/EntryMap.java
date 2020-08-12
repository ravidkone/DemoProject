package CollectionProgms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class EntryMap {

	public static void main(String[] args) {
		
	//	HashMap<Integer, String> hm=new HashMap<Integer, String>(); //intersion is not in order
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>(); //Intersion is in order
	//	TreeMap<Integer, String> hm=new TreeMap<Integer, String>(); //ascending order
		
		hm.put(10, "ravi");
		hm.put(20, "kone");
		hm.put(80, "kone1");
		hm.put(30, "vin");
		
		
		for (Integer S : hm.keySet()) {
			System.out.println(S);
			
		}
		System.out.println("*********");
		for (String s1 : hm.values()) {
			System.out.println(s1);
			
		}
		
        System.out.println("While:");

		Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()) {
        	Entry<Integer, String> me = (Entry<Integer, String>) itr.next();
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }
        System.out.println("For Loop:");
        for(Entry<Integer, String> me2: hm.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }
	}

}
