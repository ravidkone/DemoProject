package JavaPrograms;

public class VeriableIntialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; //Variable Declaration
		a=10; // variable Initialization 
		a++;
		System.out.println(a); // Utilization
		
		
		//declaration
		int stdid;
		double percent;
		char stdgrade;
		boolean passed;
		
		//Initialization
		stdid=10;
		percent=60.5;
		stdgrade='a';
		passed=true;
		
		//Utilization
		System.out.println("Student ID is: "+stdid);
		System.out.println("Student ID % is: "+percent);
		System.out.println("Student Grade is: "+stdgrade);
		System.out.println("Student Result is: "+passed);
		
		System.out.println();
		int b;
		System.out.println(b=100);

	}

}
