package CollectionProgms;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class sortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(5);
		list.add(100);
		
		Iterator<Integer> it=list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		Collections.sort(list);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(list.get(2));
	}

}
