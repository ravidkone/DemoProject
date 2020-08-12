package JavaLogicProgms;
import java.util.HashMap;

public class CountOfWordMap {

	 
	 
	    public static void main(String[] args) {

	    	//count of words
	    	String str = "This this is is done by Saket Saket";
	        String[] split = str.split(" ");
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        System.out.println("lenth is: "+split.length);
	        
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	        
	        
	        // count of character
	        String str1 = "This this";
	        char[] charArayy=str1.toCharArray();
	        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
	        
	        for (Character ch:charArayy) {
	        	
	            if (map1.containsKey(ch)) {
	                int count = map1.get(ch);
	                map1.put(ch, map1.get(ch)+1);
	            }
	            else {
	                map1.put(ch, 1);
	            }
	        }
	        System.out.println(map1);
	        
	    }
	 
	}

