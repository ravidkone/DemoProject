package DemoPackage;

class Thirteen
{
	public void delhi()
	{
		System.out.println("This is Delhi");
	}
}
class Twelve extends Thirteen
{
	public void Pune()
	{
		System.out.println("This is Pune");
	}
	public void Mumbai()
	{
		System.out.println("This is Mumbai");
	}
	
}
class Eleven extends Twelve
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
public class DemoMultilevelInheritance {

	public static void main(String[] args) {
		System.out.println("This is begining");
		Eleven e1=new Eleven();
		e1.bangalore();
		e1.chennai();
		
		// we can call below methods after class Eleven extends Twelve, if we do not extend then we will get error
		System.out.println("Below methods are called after class Eleven extends Twelve ");
		e1.Pune();
		e1.Mumbai();
		// we can call below method after class Twelve extends Thirteen, if we do not extend then we will get error
		e1.delhi();
		Twelve t1=new Twelve();
		System.out.println("Below methods are called after class Twelve extends Thirteen ");
		t1.Pune();
		t1.Mumbai();
		t1.delhi();
	}
}




