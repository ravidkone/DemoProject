package CollectionProgms;

import java.util.ArrayList;
import java.util.Collections;

public class A extends ArrayList{

	public static void main(String[] args) {
		A a1=new A();
		a1.add(10);
		a1.add("hi");
		a1.add(true);
		a1.add(null);
		a1.add(20);
		a1.add(5);
		a1.add(2);
		System.out.println(a1);
		a1.removeRange(1, 4);
		System.out.println(a1);
		Collections.sort(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
