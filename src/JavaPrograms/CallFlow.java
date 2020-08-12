package JavaPrograms;

public class CallFlow {
	
	static void show(int a) {
		int num=a; // no need
		System.out.println("The entered number is: "+a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		CallFlow.show(5);
		CallFlow.show(6);
		CallFlow.show(7);
		System.out.println("Main Ended");

	}

}
