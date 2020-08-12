package JavaLogicProgms;

public class Fibbonacci {

	public static void main(String[] args) {

		int n1=0, n2=1,n3, j, count=10;
		
		System.out.print(n1+" "+n2);
		
		for (j = 2; j < count; j++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
					
		}
		System.out.println("\n******");
		int a=0, b=0,c=1;
		for (int i=0; i<count; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    //if you want to print on the same line, use print()
        }       
	}

}
