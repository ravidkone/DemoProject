package JavaPrograms;

interface father{
	 void smoking();
}
class son implements father
{
	public void smoking() {
		System.out.println("override smoking method");
	}
}
public class objectCastingMethodOverride {

	public static void main(String[] args) {
		father f=new son();
		f.smoking();
	}

}
