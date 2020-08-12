package com.oops.test;

// first class
class father{
	void smoke() {
		int rs=60;
		System.out.println("father is smoking");
		System.out.println("father spend 60 rs for smoking:"+rs);
	}
	
	// color method is not implemented in SON, so whenever color method is called, father class's color() method will be triggered
	void color() {
		System.out.println("father is black");
	}
}


// second class
class son extends father{
	// some method is implemeted in SON, so father method will removed and whenever we call smoke method, son smoke method will be trigged
	void smoke() {
		int rs=10;
		System.out.println("son is not smoking: "+rs);
	}
	
	// run() method is new method of son, it is not available in father. 
	void run() {
		System.out.println("son is running daily");
	}
}



// third class
public class entrynew {

	public static void main(String[] args) {
		System.out.println("this is entry class");
		son s=new son();
		s.smoke();
		s.color();
		s.run();	
	}
}
