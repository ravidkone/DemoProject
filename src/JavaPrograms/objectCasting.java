package JavaPrograms;

class A{
	void test1() {
		System.out.println("In test1 of A");
	}
}
class B extends A
{
	void test2() {
		System.out.println("In test2 of B");
	}
}

public class objectCasting {

	public static void main(String[] args) {
		System.out.println("Starts");
		A a1=(A)new B();
		a1.test1();
	//	a1.test2(); // Error, can't access

	}

}
