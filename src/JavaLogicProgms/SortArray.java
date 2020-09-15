package JavaLogicProgms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,5,7,3,4,1,9};
		int count=a.length;
		System.out.println("array length is: "+count);
		System.out.println(Arrays.toString(a));

		for(int i=0; i<count;i++) {
			
			for (int j=i+1;j<count;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];    
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("print using for loop");
		for(int i=0; i<count-1;i++) {
			System.out.print(a[i]+", ");
		}
		// to avoid comma symbole at the end.. using count-1
		System.out.print(a[count-1]+"\n");
		
		System.out.println("******reverse array****");
         for (int k=count-1;k>0;k--) {
			
           System.out.print(a[k]+",");			
		}
 		System.out.print(a[0]);


	}

}
