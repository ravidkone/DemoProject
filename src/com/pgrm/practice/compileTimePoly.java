package com.pgrm.practice;

	
	interface ravi{
		void test1();
	}
	
	class vini implements ravi{
		public void test1() {
			System.out.println("test1 method from vini");

		}
	}
	class vinita implements ravi{
		public void test1() {
			System.out.println("test1 method from vinita");

		}
	}
	class myClass{
		public static void myMthod(ravi r) {
			r.test1();
		}
	}
	
	public class compileTimePoly {

	public static void main(String[] args) {
		
		myClass.myMthod(new vini());
		myClass.myMthod(new vinita());
	}

}
