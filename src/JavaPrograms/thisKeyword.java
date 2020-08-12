package JavaPrograms;

public class thisKeyword {

	int a = 10;
    String s="ravi";
    
    int show(int a) {
    	return this.a;
    	//return this.a=a;

    }
    String display(String s) {
    	return this.s;
    	//return this.s=s;
    }
	public static void main(String[] args) {
		thisKeyword t=new thisKeyword();
		int a1=t.show(20);
		System.out.println("Value of a is: "+a1);
		String s1=t.display("vinita");
		System.out.println("Value of s is: "+s1);
	}

}
