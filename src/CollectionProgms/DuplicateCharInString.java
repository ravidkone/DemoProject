package CollectionProgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//import java.util.HashMap;  
//import java.util.Map;  
//import java.util.Set; 

public class DuplicateCharInString {
	
	public void findIt(String str) {
		Map<Character, Integer> basemap=new HashMap<>();
		
		char[] charArray=str.toCharArray();
		for(Character ch:charArray)
		{
			if(basemap.containsKey(ch))
			{
				basemap.put(ch, basemap.get(ch)+1);
			}else {
				basemap.put(ch, 1);
			}
		}
		
		Set<Character> keys=basemap.keySet();
		for(Character ch:keys)
		{
			if(basemap.get(ch)>1)
			{
				System.out.println(ch+" is "+basemap.get(ch)+" times");
			}
		}
	}
	public static void main(String Args[]) {
		DuplicateCharInString dcf=new DuplicateCharInString();
		dcf.findIt("inida is my country");
	}
  

	}


