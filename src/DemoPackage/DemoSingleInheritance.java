package DemoPackage;

class Ten{
	public void pune()
	{
		System.out.println("This is Pune");
	}
	public void mumbai()
	{
		System.out.println("This is Mumbai");
	}
}

class Nine extends  Ten
{
	public void bangalore()
	{
		System.out.println("This is Bangalore");
	}
	public void chennai()
	{
		System.out.println("This is Chennai");
	}
}

public class DemoSingleInheritance {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Nine n1=new Nine();
		n1.bangalore();
		n1.chennai();
		
		// we can call below methods after class Nine extends ten, if we do not extend then we will get error
		n1.pune();
		n1.mumbai();
		

	}

}