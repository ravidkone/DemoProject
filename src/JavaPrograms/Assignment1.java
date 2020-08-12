package JavaPrograms;

public class Assignment1 {
	static boolean trouble(boolean aSmile, boolean bSmile)
	{
		return (aSmile=bSmile);
	}

	public static void main(String[] args) {

		System.out.println("Main Started");
		boolean res=Assignment1.trouble(true, true);
		System.out.println("The result is:"+res);
		System.out.println("Main Ends");

	}

}
