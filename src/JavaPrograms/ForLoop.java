package JavaPrograms;

public class ForLoop {

	public static void main(String[] args) {
		
		//int i=0;
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" :Hi");
		}

		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
			//	System.out.print("*");
				System.out.print(j);

			}
			System.out.println();
		}
		
		for (int j1 = 5; j1 >=1; j1--) {
		for (int j2 = 1; j2 <= j1; j2++) {
			//	System.out.print("*");
				System.out.print(j2);

		}
		System.out.println();
	}
}
}