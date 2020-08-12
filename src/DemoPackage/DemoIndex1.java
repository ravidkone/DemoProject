package DemoPackage;
import Package1.DemoIndex;

public class DemoIndex1 {

	public static void main(String[] args) {
		System.out.println("This is begining");
		
		Index i=new Index();
		i.delhi();

		DemoIndex d1=new DemoIndex();
		d1.kolkatta();
	}

}

class Index{
	public void delhi()
	{
		System.out.println("This is Delhi");
	}
}