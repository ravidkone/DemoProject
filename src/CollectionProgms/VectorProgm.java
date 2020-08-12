package CollectionProgms;

import java.util.Vector;

public class VectorProgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		Vector v=new Vector(4);
		v.add(10);
		v.add(5);
		v.add("hey");
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		System.out.println(v);
		v.add(10);
		v.add(null);
		System.out.println("------");
		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.get(0));

	}

}
