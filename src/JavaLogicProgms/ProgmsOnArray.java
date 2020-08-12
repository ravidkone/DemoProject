package JavaLogicProgms;

import java.util.Arrays;
import java.util.Collections;

public class ProgmsOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {9,6,8,6,2,5,0,5,9,5};
		
//		Scanner s=new Scanner(System.in);
//		int[] a=new int[3];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("Enter array number\n");
//			a[i]=s.nextInt();
//		}
		
		int size=a.length;
		System.out.println("Array size is: "+size);
		int b=a[2];
		System.out.println("index of 2 is: "+b);
		System.out.println("Array values are:"+Arrays.toString(a));

		for (int i=size-1; i>=0; i--) {
			int n=a[i];
			System.out.print(n);
		}
		System.out.println();
		reverse(a);
		
	}
	static void reverse(int c[]) {
		System.out.println("Reverse using collection");

	    Collections.reverse(Arrays.asList(c));
		System.out.print(Arrays.toString(c));
		
	}

}
