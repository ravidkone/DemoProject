package DemoPackage;

interface abc{
	void test1();
}

class m implements abc{
	public void test1() {
		System.out.println("test 1 implementation in B class");
		
	}
}

class C1 implements abc{
	public void test1() {
		System.out.println("test 1 implementation in c class");
		
	}
}

class myClass{
	static void myMethod(abc a11) {
		a11.test1();
	}
}

class ploymorphismTest {

	public static void main(String[] args) 
	{
		System.out.println("start");
		myClass.myMethod(new m());
		myClass.myMethod(new C1());
	}

}
