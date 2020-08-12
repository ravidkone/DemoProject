package DemoPackage;

public class DemoReturn {

	public static void main(String[] args) {
		System.out.println("This is begining");
     Four f1=new Four();
     f1.bangalore();
    int d= f1.add(10, 20);
    System.out.println(d);
    
    int f= f1.add(30, 20);
    int k=f+100;
    System.out.println(k);
	}

}

class Four{
	public void bangalore()
	{
		System.out.println("This is Bangalore");
	}
	public int add (int a, int b)
	{
		int c=a+b;
		return c;
	}
}