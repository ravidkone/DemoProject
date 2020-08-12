package JavaLogicProgms;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1234;
		int rev=0;
		
		while(n!=0) {
		int	a=n%10;
		rev=rev*10+a;
		n=n/10;
		}
		System.out.println(rev);
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
		long num=234;
	StringBuffer	s=new StringBuffer(String.valueOf(num));
	System.out.println(s.reverse());
	
	String ss="ravi";
	StringBuffer s1=new StringBuffer(ss);
    System.out.println(s1.reverse());
	

	}

}
