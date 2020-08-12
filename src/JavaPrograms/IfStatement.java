package JavaPrograms;

public class IfStatement {

	public static void main(String[] args) {

		int age = 19;

		if (age > 18) {
			System.out.println("Account created");
		} else {
			System.out.println("Sorry, can't create account");

		}
		System.out.println();

		if (age > 18)
			System.out.println("Eligible");
		else
			System.out.println("not eligible" + "");

		System.out.println();

		int a = 10, b = 10;
		// if (a=b)
		if (a == b) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");

		}

		char grade = 'A';

		if (grade == 'A') {
			System.out.println("FCD");
		} else if (grade == 'B') {

			System.out.println("FC");

		} else if (grade == 'C') {

			System.out.println("SC");

		} else {
			System.out.println("Fail");
		}

	}

}
