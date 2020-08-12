package Package1;

public class myclass {

	public static void main(String[] args) {
		
	mynewclass.mymethod1(new son()); //son s=new son(); or grandpa g=new son(); mymethod(new son());
	mymethod(new child()); //child s=new child();
	mymethod(new parent());
	mymethod(new grandpa());
	//mymethod(new grandpa());	

		
		// change in the beviour of method/object in different 
		//level as its object is creating during runtime  
	}

	public static void mymethod(grandpa g) {
		
		g.test();
		g.test(2,4);
		g.test(2,4,5);

	}
	
//	child c=new child();
////	c.test();
//	
////	mymethod(c);
//	
//   parent p=new parent();
////	p.test();
//   mymethod(p);
//   
//	grandpa g=new parent();
////	g.test();
//	mymethod(g);
//	
//	grandpa g1=new child();
	
	
}
