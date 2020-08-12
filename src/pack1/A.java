package pack1;

import pack2.start;

public class A extends start{

	public static void main(String[] args) {
		
		System.out.println("Calling methods of another package: ");
		A a1=new A();
		a1.test1();
		a1.test2();
		//a1.test3(); // not possible
		//a1.test4(); // not possible
	}

}
