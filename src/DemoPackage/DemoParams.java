package DemoPackage;

public class DemoParams {

	public static void main(String[] args){
	System.out.println("This is begining");
	Two t1=new Two();
	t1.bangalore();
	t1.add(10, 20);
	t1.city("Arjunagi");

	}

}

class Two{
	public void bangalore()
	{
		System.out.println("This is Bangalore");
		
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void city(String cityname)
	{
		System.out.println(cityname);
	}
	
}