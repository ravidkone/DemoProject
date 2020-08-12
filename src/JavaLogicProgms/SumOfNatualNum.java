package JavaLogicProgms;

public class SumOfNatualNum {

	public static void main(String[] args) {
		int num=100;
		int sum=0;
		for(int i=0; i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Natual num sun is "+sum);
		
		System.out.println("**********");
		int sum1=0;
		int k=0 ;
		while(k<=num) {
			sum1=sum1+k;
			k++;
		}
		System.out.println("Natual num sun is "+sum1);
	}

}
