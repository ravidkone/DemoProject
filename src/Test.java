import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Acc*oLi@231Te";
		String s="Acc*oLi@231Te";

		
		StringBuffer alpha = new StringBuffer(),  
		        num = new StringBuffer(), spe = new StringBuffer(); 
		          
		        for (int i=0; i<str.length(); i++) 
		        { 
		            if (Character.isDigit(str.charAt(i))) 
		                num.append(str.charAt(i)); 
		            else if(Character.isAlphabetic(str.charAt(i))) 
		                alpha.append(str.charAt(i)); 
		            else
		                spe.append(str.charAt(i)); 
		        } 
		       
		        System.out.println(alpha); 
		        System.out.println(num); 
		        System.out.println(spe); 
		System.out.println("**************");
		System.out.println("give: "+s);
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		char caps, small, special, number;
		
		for(int i=0;i<s.length();i++) {			
			if(ch[i]>='A'&&ch[i]<='Z') {
				caps=ch[i];
				System.out.print(caps);
			}
		}
		
		System.out.println("\n");
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				small=ch[i];
				System.out.print(small);			}
		}
		System.out.println("\n");
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				number=ch[i];
				System.out.print(number);
			}
		}
		System.out.println("\n");
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))&&(!Character.isAlphabetic(s.charAt(i)))) {
				special=ch[i];
				System.out.print(special);
				//System.out.print(ch[i]);
			}
		}
		
		
	}

}
