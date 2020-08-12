package JavaLogicProgms;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="ravi";
		String b="Kone";
		
		System.out.println("First name is: "+a);
		System.out.println("First name is: "+b);
		a=a+b;
		System.out.println(a); //ravikone
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After SWAP");
		System.out.println("First name is: "+a);
		System.out.println("First name is: "+b);

	}

}
