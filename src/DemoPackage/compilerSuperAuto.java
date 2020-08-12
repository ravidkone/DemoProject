package DemoPackage;

	class ravi{
		ravi(){
			System.out.println("ths is RAVI constructor");
		}
	}
	class vinita extends ravi
	{
		vinita(){
			// super(); // this will be added by compiler
			System.out.println("this is VINIAT constructor");
		}
	}
	class viond extends vinita
	{
		viond()
		{
			// super(); // this will be added by compiler
			System.out.println("this is VINOD constructor");	
		}
	}

	public class compilerSuperAuto {
	public static void main(String[] args) {
		viond v=new viond();
		
	}

}
