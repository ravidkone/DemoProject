package DemoPackage;

class Father{
	
	 void smoking() {
		System.out.println("Normal Smoker");
	}
}
 class Son extends Father{

	void smoking()  //Error: Final methods can't be overriden
	{
		System.out.println("proper overridinng");
	}
}
class child extends Son{ //Error: Final class can't be inheritted
	
}

public class Overriding {

	public static void main(String[] args) {
    Son s=new Son();
    s.smoking();
	}

}
