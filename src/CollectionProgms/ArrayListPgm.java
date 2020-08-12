package CollectionProgms;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) {
		
		// creating Array List object
		ArrayList list=new ArrayList();
		
		// Adding values to list
		list.add(10);
		list.add(10.5);
		list.add("Hey");
		list.add(true);
		list.add(null);
		
		//Print the values of list
		System.out.println("List size is: "+list.size());
		System.out.println("Elements are: "+list);
		System.out.println("Element got using index-0: "+list.get(0));
		System.out.println("Element got using index-2: "+list.get(2));
		
		// getting list elements using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elements retrived using for loop: "+list.get(i));
			
		}
		
		
		list.add(50);
		System.out.println("New Elements are: "+list);
		list.add(2, "ravi");
		System.out.println("Latest New Elements are: "+list);
		list.set(2, "Ravi Kone");
		System.out.println("Updated New Elements are: "+list);
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("ravi");
		list1.add("dabba");
		System.out.println("Elements in list1: "+list1);
		list.addAll(list1);
		System.out.println(list);
		
		
		ArrayList list2=new ArrayList<>();
		list2.add('A');
		list2.add('B');
		list1.addAll(2, list2);
		
		System.out.println("New list1: "+list1);
		System.out.println("New list1: "+list);
		System.out.println("removed element is: "+list.remove(3));
		System.out.println("New list1 after removal: "+list);
		System.out.println(list.remove(true));
		System.out.println(list.removeAll(list1));
		System.out.println(list);
		//System.out.println(list.retainAll(list2));
		//System.out.println(list);
		

	}

}
