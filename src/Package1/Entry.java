package Package1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Entry {

	public static void main(String[] args) {
		
		LinkedList<student> ll=new LinkedList<student>();
		
		ll.add(new student("vinita", 1));
		ll.add(new student("ravi", 4));
		ll.add(new student("vinod", 2));
		ll.add(new student("sharan", 4));
		
		Collections.sort(ll);
		
		Iterator<student> it=ll.iterator();
		while (it.hasNext()) {
			student s=it.next();
	System.out.println("Name is: "+s.sName+" ID is:"+s.sID);
		}
		
//		student s=  new student("vinita", 1);
//		student s1=new student("ravi", 2);
//		student s2=new student("vinod", 3);
//		student s3=new student("sharan", 4);

	}

}
