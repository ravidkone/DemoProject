package JavaLogicProgms;

public class ReverseString {

	public static void main(String[] args) {
		String original="Dad";
		String reverse="";
		 
		int i, length;
//		Scanner str=new Scanner(System.in);
//		System.out.println("Enter a String");
//		
//		original=str.nextLine();
		System.out.println("original string is: "+original);
		length=original.length();
		
		for (i=length-1;i>=0;i--) {
			
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println("Reversed String is:"+reverse);
//		System.out.println(original.equals(reverse));
		
		if(original.equals(reverse)) {
			System.out.println("its palidrome");
		}else {
			System.out.println("its NOT a palidrome");
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("its palidrome");
		}else {
			System.out.println("its NOT a palidrome");
		}
		
	}

}
