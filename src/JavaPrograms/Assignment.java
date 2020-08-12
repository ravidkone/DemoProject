package JavaPrograms;

public class Assignment {

	static boolean mymethod(int a, int b) {
		if (a == 30 || b == 30 || (a + b) == 30) {
			return true;
		} else {
			return false;
		}
	}

	static boolean method(int a, int b) {
		return (a == 30 || b == 30 || (a + b) == 30);

	}

	public static void main(String[] args) {

		System.out.println("Main started");
		boolean res = Assignment.mymethod(10, 20);
		System.out.println("The result is:" + res);
		System.out.println("***********");
		System.out.println("The result is:" + Assignment.method(10, 40));
		System.out.println("Main Ended");

	}

}
