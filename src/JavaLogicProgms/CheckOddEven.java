package JavaLogicProgms;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=reader.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered even number");
		}else {
			System.out.println("Entered odd number");
		}
		

	}

}
