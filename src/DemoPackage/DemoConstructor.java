package DemoPackage;

public class DemoConstructor {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
      Five f1=new Five();
      Five f2=new Five(3,5);
	}
}
class Five{
	
	// Five () is constructor and not a method
	Five(){
	System.out.println("This is constructor");	
		
	}
	Five(int a, int b){
		int c=a+b;
		System.out.println("Sum is:"+c);
	}
	
}


// Constructor :

// Constructor name will be same as "Class name"
//Constructor will be called by default when an object is called.
//Constructor will not have any "return type"
