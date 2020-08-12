package JavaLogicProgms;

public class DuplicateChars {

        
        public static void main(String[] args) {
                 // TODO Auto-generated method stub
                String str = new String("Sakkett");
                System.out.println("length is: "+str.length());
                int count = 0;
                char[] chars = str.toCharArray();
                System.out.println("Duplicate characters are:");
                for (int i=0; i<str.length();i++) {
                            for(int j=i+1; j<str.length();j++) {
                                       if (chars[i] == chars[j]) {
                                                  System.out.println(chars[j]);
                                                  count++;
                                                  break;
                                        }
                             }
                 }
                System.out.println("Total duplicates: "+count);

                
                System.out.println("***************");
        		String s="Ravi royal";
        		for (int i=0;i<s.length();i++) {
        			for(int j=i+1;j<s.length();j++) {
        				if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))) {
        					System.out.println(s.charAt(i));
        					
        			char c=s.charAt(i);
        			int a=c;
        			System.out.println("Assii value of "+s.charAt(i)+" is: "+a);
        				}
        			}
        			break;
        		}
                
         }


}
