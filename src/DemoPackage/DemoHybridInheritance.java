package DemoPackage;

class a{
	
	void pune() {
		System.out.println("This is bangalore");
	}
}
class b extends a
{
	void mumbai() {
		System.out.println("this is chennai");
	}
}
class c extends a{
	void chennai() {
		System.out.println("this is pune");
	}
}

public class DemoHybridInheritance {

	public static void main(String[] args) {
		b b1=new b();
		b1.pune();
		b1.mumbai();
		
		c c1=new c();
		c1.pune();
		c1.chennai();	
	}

}
