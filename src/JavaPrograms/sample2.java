package JavaPrograms;

public class sample2 {
	
	
	static int i=10;
	public static void main(String[] args) {
		
		System.out.println(i); //global
		i=20;                  //global
		System.out.println(i); //global
		int i=30;			   //local
		System.out.println(i); //local
		i=40;				   //local
		System.out.println(sample2.i);
	}

}

 class abc {
	 
	 
	 
	
}