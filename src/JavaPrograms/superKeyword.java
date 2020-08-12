package JavaPrograms;

class sup{
	void test1() {
		System.out.println("Super class");
	}
}
class sonn extends sup{
	void test1() {
		super.test1();
		System.out.println("Sub class");
	}
}
public class superKeyword {

	public static void main(String[] args) {
		sonn s=new sonn();
		s.test1();
	}

}
