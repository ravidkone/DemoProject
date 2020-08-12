package JavaPrograms;

public class PrintSOP {

	static int test() {
		return 90;
	}

	static boolean test1() {
		return true;
	}

	static int test2() {
		return 10;
	}

	static void test3() {
		// This will give error
	}

	public static void main(String[] args) {

		System.out.println("Main Started");
		System.out.println(PrintSOP.test());
		System.out.println(PrintSOP.test1());
		System.out.println(PrintSOP.test2() + PrintSOP.test2());
		// System.out.println(PrintSOP.test3()); -- Can't print
		System.out.println("Main Ends");
	}

}
