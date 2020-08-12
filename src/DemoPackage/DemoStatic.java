package DemoPackage;

public class DemoStatic {

	public static void main(String[] args) {
		System.out.println("This is Bigining");
		Three.delhi();
		Three.mumbai();
		Three.pune();
		Three.delhi();
		
		// Even static methods can be called using object
		System.out.println("Below static method called using Object");
		Three t1=new Three();
		t1.delhi();
		t1.mumbai();
		t1.pune();

	}

}

class Three{
	public static void delhi()
	{
		System.out.println("This is Delhi");
	}
	public static void pune()
	{
		System.out.println("This is Pune");
	}
	public static void mumbai()
	{
		System.out.println("This is Mumbai");
	}
}

