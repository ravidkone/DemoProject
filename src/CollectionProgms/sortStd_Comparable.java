package CollectionProgms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class sortStd_Comparable {

	public static void main(String[] args) {
		 LinkedList<studentsort> slist=new LinkedList<studentsort>();
		 slist.add(new studentsort("Ravi", 1,10000,"bangalore"));
		 slist.add(new studentsort("Vinita", 4,7000,"bangalore"));
		 slist.add(new studentsort("Kiran", 2,1000,"bangalore"));
		 slist.add(new studentsort("Vinod", 3,5000,"bangalore"));
		 
		 Collections.sort(slist);
		 
		 Iterator<studentsort> it=slist.iterator();
		 while (it.hasNext()) {
			 	studentsort a=it.next();
			 System.out.println(a.rollNum);	
		}
		 
		 System.out.println("***************");
		 System.out.println(slist);
	}
	}


class studentsort implements Comparable<studentsort>{
	
	String name;
	int rollNum;
	long fees;
	String address;
	
	public studentsort(String sname, int srollNum, int sfees, String saddress) {
		this.name=sname;
		this.rollNum=srollNum;
		this.fees=sfees;
		this.address=saddress;
	}

	@Override
	public int compareTo(studentsort o) {
		// TODO Auto-generated method stub
		return this.rollNum-o.rollNum;
	}

}
