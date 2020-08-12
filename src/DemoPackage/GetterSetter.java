package DemoPackage;

class Employee
{
	private int empid;
	private double empsal;
	
	Employee(int empid, double empsal)
	{
		this.empid=empid;
		this.empsal=empsal;
	}
	
	public int getempid()
	{
		return empid;
	}
	public void setempid(int empid)
	{
		this.empid=empid;
		
	}
	public double getempsal()
	{
		return empsal;
	}
	public void setempsal(double empsal)
	{
		this.empsal=empsal;
		
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		Employee e=new Employee(10, 500.5);
		System.out.println(e.getempid());
		e.setempid(100);
		System.out.println(e.getempid());
		System.out.println("get method executed");
		
		System.out.println(e.getempsal());
		e.setempsal(24000.5);
		System.out.println(e.getempsal());
	}

}
