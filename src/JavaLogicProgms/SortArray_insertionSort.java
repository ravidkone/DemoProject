package JavaLogicProgms;

import java.util.Arrays;

public class SortArray_insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,9,7,13,2,6,14,20};
		System.out.println("before sort"+Arrays.toString(a));
		for(int k=1;k<a.length;k++) {
			int temp=a[k];
			int j=k-1;
			
			while(j>=0 && temp<=a[j]) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}

		
		System.out.println("After sort"+Arrays.toString(a));
		
		System.out.println("print uing for loop");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"");
		}
	}

}
