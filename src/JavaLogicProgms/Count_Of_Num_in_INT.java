package JavaLogicProgms;

public class Count_Of_Num_in_INT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	long num=9686250595l;
	int num=87654;
		int count=0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		System.out.println("Count of digit in given integrer is "+count);
		
	}

}
