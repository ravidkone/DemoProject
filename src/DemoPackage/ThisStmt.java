package DemoPackage;

public class ThisStmt {
	
	 ThisStmt(int a) {
		 System.out.println("ThisStmt(int a) constructor");
	}
	 ThisStmt(double d) {
		 this(10);
		 System.out.println("ThisStmt(double d) constructor");
	}
	 ThisStmt(int a, double d) {
		 this(10.5);
		 System.out.println("ThisStmt(int a, double d) constructor");
		 //this(10.5);// Error
	}
	 ThisStmt(double d, int b) {
		 this(10,10.5);
		 System.out.println("ThisStmt(double d, int b) constructor");
	}

	public static void main(String[] args) {
		ThisStmt ts=new ThisStmt(10.5,10);
	}

}
