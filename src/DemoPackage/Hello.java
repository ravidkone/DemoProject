package DemoPackage;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		One o1=new One();
		o1.bangalore();
		o1.chennai();

	}

}

class One{
	public void bangalore()
	{
		System.out.println("This is bangalore");
	}
	public void chennai()
	{
		System.out.println("This is chennai");
	}
}