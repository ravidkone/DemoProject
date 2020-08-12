package CollectionProgms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("ravi", 123,"Kar",90);
		Student s2=new Student("kiran", 143,"Kar",90);
		Student s3=new Student("Prakash", 153,"Kar",90);
		System.out.println(s1);
		HashMap map=new HashMap();
		map.put("A",s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put("b", "c");
		Set s=map.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		Collection c= map.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set ss=map.entrySet();
	Iterator itr2=ss.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	}

}

class Student{
	String name,state;
	int Jnum, score;
   public	Student(String name1,int Jnum1, String state1, int score1){
		name=name1;
		Jnum=Jnum1;
		state=state1;
		score=score1;
	}
   public String getname() {
	   return name;
   }
   public String getstate() {
	   return state;
   }
   public int getjnum() {
	   return Jnum;
   }
   public int getscore() {
	   return score;
   }
   public String toString() {
	   return name+" "+Jnum+" "+state+" "+score;
   }
}