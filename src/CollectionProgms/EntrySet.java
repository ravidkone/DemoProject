package CollectionProgms;

import java.util.Iterator;
import java.util.TreeSet;

public class EntrySet {

	public static void main(String[] args) {

	//	HashSet<Integer> hs=new HashSet<Integer>(); // insertion is random
	//	LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(); // insertion is in order
		TreeSet<Integer> hs=new TreeSet<Integer>(); // insertion is in ascending order
		
		hs.add(1);
		hs.add(8);
		hs.add(4);
		hs.add(10);
		hs.add(10);
	//	hs.add(null); //tree set can't have null value
		hs.add(19);
		
		
		Iterator<Integer> it=hs.iterator();
		while (it.hasNext()) {
System.out.println("Elemets are:"+ it.next());			
		}
	}

}
