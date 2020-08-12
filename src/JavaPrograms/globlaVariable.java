package JavaPrograms;

public class globlaVariable {
	
	static int a;
	static double d;
	static char c;
	static boolean b;
	static String str;
	
	int m;
	int n=10;

	public static void main(String[] args) {
		System.out.println("The value of int is: "+a); //point 1
		System.out.println("The value of doible is: "+d);
		System.out.println("The value of char is: "+c);
		System.out.println("The value of boolean is: "+b);
		System.out.println("The value of String is: "+str);
		System.out.println("****************");
		globlaVariable gv=new globlaVariable();
		System.out.println("The value of int is: "+gv.m); //point 2
		gv.m++;
		System.out.println("The value of int is: "+gv.m); 
		System.out.println("The value of int is: "+gv.n); //point 3
	}

}
