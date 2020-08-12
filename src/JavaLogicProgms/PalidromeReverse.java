package JavaLogicProgms;

import java.util.Scanner;

public class PalidromeReverse {

	public static void main(String[] args) {
		int n,m,r,a=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		m=n;
		
		while(n!=0) {
			r=n%10;
			a=a*10+r;
			n=n/10;
		}
		System.out.println("Reverse number:"+a);
		if(a==m) {
			System.out.println("Given number "+m+" is palindrome");
		}else {
			System.out.println("Given number "+m+" is NOT palindrome");
		}
	}

}
