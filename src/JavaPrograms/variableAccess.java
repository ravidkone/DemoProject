package JavaPrograms;

public class variableAccess {
	static int stdid=90; //Global Static variable
	int a = 50; // Global Non-Static variable

	static void test() {
		System.out.println("This is static method");
	}

	void test1() {
		System.out.println("This is Non-static method");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Global static variable value accessed directly: " + stdid);
		System.out.println("Global static variable value access using class name: " + variableAccess.stdid);
		System.out.println("*************");

		// System.out.println("Global Non-static variable value is:"+a); // can't access directly
		// System.out.println("Global Non-static variable value is: "+variableAccess.a); can't access
		// Error: cannot make a static reference to the non-static field variableAccess

		variableAccess va = new variableAccess();
		System.out.println("Global Non-static variable value is:" + va.a); // can access with object reference
		System.out.println("Global static variable value using object referance:" + va.stdid);
		System.out.println("*************");

		variableAccess.test(); // static method can be called using class name
		va.test1(); // Non static method can be called using object reference 
		System.out.println("Main Ends");

	}

}
