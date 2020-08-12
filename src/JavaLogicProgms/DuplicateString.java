package JavaLogicProgms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"java","javascript","c","python","java","c"};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate word is: "+a[i]);
				}
			}
		}
		
		Set<String> hashSet=new HashSet<String>();
		for(String names:a) {
			if(hashSet.add(names)==false) {
				System.out.println(names);
			}
		}

	}

}
