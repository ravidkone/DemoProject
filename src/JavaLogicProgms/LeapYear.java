package JavaLogicProgms;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2014;
		boolean res=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					res=true;
				}else {
					res=false;
				}
			} else{
				res=true;
			}
		}else {
			res=false;
		}
		
		if(res) {
			System.out.println("leap year");
		}else {
			System.out.println("Not leap year");
		}

	}

}
