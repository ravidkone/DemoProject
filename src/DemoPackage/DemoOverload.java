package DemoPackage;

class Six{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b, String message)
	{
		int c=a+b;
		System.out.println(message+c);
	}
	public void bangalore()
	{
		System.out.println("This is bangalore");
	}
	
}

public class DemoOverload {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Six s1=new Six();
		s1.add(10,20);
		s1.add(10, 20, 30);
		s1.add(1.5, 1.5);
		s1.add(5, 5, "Ravi");
		s1.bangalore();
		
	}
	
}

