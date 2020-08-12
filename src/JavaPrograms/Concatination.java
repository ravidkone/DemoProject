package JavaPrograms;

public class Concatination {

	public static void main(String[] args) {
		// + is used to concatenate
		System.out.println("I love India" + " and You");
		System.out.println();

		// When it starts with String then first it will print it and whichever literal
		// comes after that it will consider as String and will print it
		System.out.println("Hi" + 10 + 10);
		System.out.println();

		System.out.println("Hi" + (10 + 10));
		System.out.println();

		System.out.println(10 + 10 + "Hi");
		System.out.println();

		System.out.println("Hi" + 10);
		System.out.println("Hi" + 'a');
		System.out.println("Hi" + 10.06);
		System.out.println("Hi" + true);
		System.out.println("Hi" + null);
		System.out.println();

		// Whenever only "PRINT" is used then it will not go to new line and it will
		// print in same line
		System.out.print("I love India");
		System.out.print("I love you");
		System.out.println();

		// we can not just write as "print()" option some parameter needs be to passed
		// otherwise it will give error
		// System.out.print();

	}

}
