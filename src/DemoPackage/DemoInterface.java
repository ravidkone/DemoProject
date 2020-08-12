package DemoPackage;

public class DemoInterface {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println("This is begininng");
		
		// Normal way of calling methods by creating object
//		Demo d1=new Demo();
//		d1.bangalore();
	//	d1.display();
		System.out.println("Value is "+Demo.id);
		System.out.println("Value is "+a);

		// Creating object for interface
//				Itest i1=new Demo();
//				i1.display();
		//		i1.bangalore();
	}
	
}

	interface Itest{
		int empid=10;
	//	public void display();
	//	void bangalore();
	}
	
	class Demo implements Itest{
		 static int id;
		public void display()
		{
			int b;
			//System.out.println("This is Display"+b);
		}
		
		public void bangalore()
		{
			System.out.println("This is bangalore");
		}
	}


