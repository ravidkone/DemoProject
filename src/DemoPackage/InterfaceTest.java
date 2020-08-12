package DemoPackage;

interface A1 {
	int id=10; // by default ID will be static and final
	void activity();
}

interface C11 {
	int id=20;
	void activity();
	void test2();
}
class B1 implements C11, A1 {

	public void activity() {
		System.out.println("activity implementation");
	}
	public void test2() {
		System.out.println("Test 2 implementation of C11");
	}
	void test3() {
		System.out.println("Test 3 of class B1");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		// A1.id=20; //Error: Final variable can't be assigned
		B1 b1 = new B1();
		b1.activity();
		b1.test2();
		b1.test3();
		System.out.println(A1.id); // if the variable name is same in two differet intrface 
		System.out.println(C11.id);

	}
}
