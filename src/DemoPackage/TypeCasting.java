package DemoPackage;

public class TypeCasting {

	static int test2(int a)
	{
		double d=a*a;
		return (int)d;
	}
	
	static void test(double d) {
		System.out.println("In test(double d)");
	}
	
	static void test(int a) {
		System.out.println("In test1(int a)");
	}
	
	
	public static void main(String[] args) {
		System.out.println("start");

		//int res=(int)(double)test2((int)5.5);
		int res=test2((int)5.5);

		System.out.println(res);
		
		//test(90);
		//test((double)90);
		
	}

}
