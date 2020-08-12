package JavaPrograms;

public class localVarAccess {
	int m=10;
	void test1() {
		System.out.println("From test1 :"+m);
	}
	
	
	static void test()
	{
		int a=90;
		System.out.println("Value of local variable is: "+a);
	}
	
	static void test1(int a) {  // a is local variable of test1() method
		System.out.println("Value of local variable is: "+a);

	}

	public static void main(String[] args) {
		System.out.println("Mains Starts");
	//	localVarAccess.test(); 
	//	System.out.println("Value of a is: "+a); // will give error
		
		int a=100; // a is local variable of Main() method
		localVarAccess.test1(a);

		//System.out.println("Value of a is: "+a);
		
		localVarAccess l=new localVarAccess();
		System.out.println("From main: " +l.m);
		
		System.out.println("Main Ends");

	}

}
