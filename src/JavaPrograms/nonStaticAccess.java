package JavaPrograms;

public class nonStaticAccess {

	
	void test()
	{
		System.out.println("Non statci");
	}
	void test1()
	{
		System.out.println("Non statci 1");
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		nonStaticAccess na=new nonStaticAccess(); //object creation
		na.test();
		na.test1();
		System.out.println("Main Ends");
	}

}
