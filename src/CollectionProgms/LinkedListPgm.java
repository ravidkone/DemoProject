package CollectionProgms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPgm {

	public static void main(String[] args) {

		LinkedList<Integer> lll=new LinkedList<>();
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(8);
		ll.add(4);
		ll.add(4);
		ll.add(10);
//	//	ll.add(null);
//		ll.add(19);
		
//		for (int i = 0; i < ll.size(); i++) {
//			System.out.println("Elements are: "+ll.get(i));
//			
//		}
		lll.add(100);
		lll.add(200);
		
		ll.add(3, 90);
		ll.addAll(2,lll);
		
		Iterator<Integer> it=ll.iterator();
		
		while (it.hasNext()) {
        System.out.println("Elements are: "+it.next());			
		}
	}

}
