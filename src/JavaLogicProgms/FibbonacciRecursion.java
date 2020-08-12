package JavaLogicProgms;

public class FibbonacciRecursion {
	
	static int n1=0, n2=1,n3;
	static void fibbonaccirecurssion(int count){
		if(count>0) {
		//	for (j = 2; j < count; j++) {
				n3=n1+n2;
				
				n1=n2;
				n2=n3;
				System.out.print(" "+n3);
				fibbonaccirecurssion(count-1);
	}
	
	}
	
	
	public static void main(String[] args) {

		int count=10;
		
		System.out.print(n1+" "+n2);
			fibbonaccirecurssion(count-2);
		}
}