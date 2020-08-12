package Package1;

 class grandpa {

	 void test() {
		 
		System.out.println("test method of grandpa class");
	}
	
	 void test(int a,int b)
	 {
		 int sum=a+b;
		 System.out.println(sum);
	 }
	 void test(int a,int b, int c)
	 {
		 int sum=a+b;
		 System.out.println(sum);
	 }
	 
}

 class parent extends grandpa{

	 void test() {
	//	 super.test();
		System.out.println("test method of Parent class");
		
	}
	
}

class child extends parent{
	
	
	   void test() {
	//	   super.test();
		System.out.println("test method of Child class");
		
	}

}
class son extends child{
	
	
	   void test() {
	//	   super.test();
		System.out.println("test method of son class");
		
	}

}

//class mynewclass {
//	
//public static void mymethod(grandpa g) {
//		
//		g.test();
//		
//	}
//
//}



//8139928184 - maharudra duddgangi