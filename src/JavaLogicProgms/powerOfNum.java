package JavaLogicProgms;

public class powerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3, power=4; //2*2*2*2=16
//		int total=2;
//		for(int i=0;i<power-1;i++) {
//			 num*=total;
//		}
		
		long res=1;
		while(power!=0) {
			res  *=num;
			--power;
		}
		
		System.out.println(res);
		System.out.println(Math.pow(num, power));

//System.out.println(total);
	}

}
