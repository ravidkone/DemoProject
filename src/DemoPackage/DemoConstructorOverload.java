package DemoPackage;

class Eight{
	Eight()
	{
		System.out.println("This is Constructor");
	}
	Eight(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	Eight(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public void bangalore()
	{
		System.out.println("This is Bangalore");
	}
}

public class DemoConstructorOverload {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Eight e1=new Eight();
		Eight e2=new Eight(2,3);
		Eight e3=new Eight(10,20,30);
		e1.bangalore();
	}
}