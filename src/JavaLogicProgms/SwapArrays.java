package JavaLogicProgms;

public class SwapArrays {

	public static void main(String[] args) {
		int[] arr= {2,3};
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("After Swap");
		swap1(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

	static void swap(int a[]) {
		//int i;
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}
	
	//without using temp
	static void swap1(int a[]) {
		//int i;
		a[0]=a[0]+a[1];
		a[1]=a[0]-a[1];
		a[0]=a[0]-a[1];
	}
	
	
	
	
}
