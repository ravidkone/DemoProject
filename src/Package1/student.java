package Package1;

public class student implements Comparable<student>{

	public String sName;
	public int sID;
	
	student(String sName, int sID){
		
	//	System.out.println("This is student constructor");
		this.sName=sName;
		this.sID=sID;
	//	System.out.println("Name: "+sName+" ID is:"+sID);
	}

	@Override
	public int compareTo(student s) {

		return this.sID-s.sID;
	}
}
