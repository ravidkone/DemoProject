package DemoPackage;

public class DemoStaticOverload {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Seven.add(10, 20);
		Seven.add(1, 2, 3);
		Seven.add(10, 20, "Ravi");
		
		// Object created to call Non static method
		Seven s1=new Seven();
		s1.bangalore();

	}



}

class Seven{
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("a="+a+":  B="+b+":  C="+c);
		System.out.println(d);

	}
	public static void add(int a, int b,String message)
	{
		int c=a+b;
		System.out.println(c+"message");
	}
	public void bangalore()
	{
		System.out.println("This is Bangalore");
	}
}