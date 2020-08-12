package pack1;

public class Split {

	public static void main(String[] args) {

		String str="All(10)";

	//	System.out.println(str.substring(str.indexOf("(") + 1));
		
		System.out.println(str.substring(4, 6));
		
		System.out.println("********");
		System.out.println(str.substring(str.indexOf("(") + 1, str.indexOf(")")));
		
		String s = "Ravi raymond";
		System.out.println("gives string: "+s.toLowerCase());
		int count=0;
		char[] ch=s.toCharArray();
		
		
		
		int size=s.length();
		System.out.println("size: "+size);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
			
		//		if (Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))) { // to change to lower case
		//		if((Character.compare(ch[i], ch[j]))==0) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
		
		
	}

}
