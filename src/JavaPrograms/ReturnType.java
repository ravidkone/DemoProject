package JavaPrograms;

public class ReturnType {
	
	static void test()
	{
		System.out.println("Runnuing Test() Method");
		return; // compiler will write it
	}

	static int add(int a, int b) {
		int sum=a+b;
	
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		ReturnType.test();
		
		
		int Res=ReturnType.add(10, 10);
		
		
		System.out.println("The addition is:"+Res);
		System.out.println("Main Ended");
		return; // compiler will write it

	}

}
