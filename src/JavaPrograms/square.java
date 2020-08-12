package JavaPrograms;

public class square {
	
	static void squ(int a) {
		int sq=a*a;
		System.out.println("The square is:"+sq);
		//return sq;
		
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		square.squ(9);
		System.out.println("Main Ended");

		
	}

}
