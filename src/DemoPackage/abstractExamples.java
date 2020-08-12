package DemoPackage;

abstract class animal {
	animal(){
		
	}
	abstract void test();

	abstract void test1();

	void test2() {
		System.out.println("This is test2 method from abstract class");
	}

	abstract void test3();
}

abstract class dog extends animal {  // if the methods are not implemented [test3()] then class should be made as ABSTRACT
	void test() {
		System.out.println("Test implementation in class dog");
	}

	void test1() {
		System.out.println("Test1 implementation in class dog");
	}
}

class cat extends dog {
	void test3() {
		System.out.println("Test3 implementation in class cat");
	}
}

class abstractExamples {

	public static void main(String[] args) {

		cat c = new cat();
		c.test();
		c.test1();
		c.test2();
		c.test3();
	}

}
