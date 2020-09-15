package CollectionProgms;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class sortStd_Comparator {

	public static void main(String[] args) {
		
		LinkedList<std> l=new LinkedList<std>();
		l.add(new std("ravi",2,"M"));
		l.add(new std("kavi",4,"B"));
		l.add(new std("tavi",3,"D"));
		l.add(new std("lavi",1,"A"));
		
		Collections.sort(l,new numCompare());
		
		Iterator<std> it=l.iterator();
		while (it.hasNext()) {
			std s=it.next();
			System.out.println("Roll num:"+s.num+"Name: "+s.name+"Grade: "+s.grade);
			
		}
		System.out.println("****************");
Collections.sort(l,new gradeCompare());
		
		Iterator<std> it1=l.iterator();
		while (it1.hasNext()) {
			std s=it1.next();
			System.out.println("Roll num:"+s.num+"Name: "+s.name+"Grade: "+s.grade);
			
		}
	}

}

class std{

	String name;
	int num;
	String grade;
	
	public std(String sName, int sNum, String sgrade) {
		this.name=sName;
		this.num=sNum;
		this.grade=sgrade;
	}
	
}

class numCompare implements Comparator<std>{

	@Override
	public int compare(std o1, std o2) {
		return o1.num-o2.num;
	}
	
}

class gradeCompare implements Comparator<std>{

	@Override
	public int compare(std o1, std o2) {
	return	o1.grade.compareTo(o2.grade);
	}
	
}
