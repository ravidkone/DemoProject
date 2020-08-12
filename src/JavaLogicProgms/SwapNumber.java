package JavaLogicProgms;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		System.out.println("before swap a="+a+" b="+b);
		
		System.out.println("After swap");
		
				int temp=a;
				a=b;
				b=temp;
				System.out.println("Uisng temp swap a="+a+" b="+b);
		
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("Uisng operation swap a="+a+" b="+b);

	}

}
