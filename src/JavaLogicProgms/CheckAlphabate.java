package JavaLogicProgms;

import java.util.Scanner;

public class CheckAlphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entered a character");
		Scanner reader=new Scanner(System.in);
	//	char ch=reader.next().charAt(0);
		char ch=Character.toLowerCase(reader.next().charAt(0));

	//	char ch='p';
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Entered character is Ovewla");
		}else {
			System.out.println("Entered character is constant");

		}
		
		System.out.println("usering Switch");
		switch (Character.toLowerCase(ch)) { 
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered character is Ovewla");
			break;
		default:
			System.out.println("Entered character is constant");
			break;
			
		}

	}

}
