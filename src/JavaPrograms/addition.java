package JavaPrograms;

public class addition {
	
	static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		int a=10; int b=20;
		int sum=addition.add(a, b);
		System.out.println("The addition is: "+sum);

	}

}
