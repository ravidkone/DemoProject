package com.pgrm.practice;

interface swicth1{
	void on();
	void off();
}

class fan implements swicth1{

	@Override
	public void on() {
		System.out.println("Turned on FAN");
	}

	@Override
	public void off() {
		System.out.println("Turned OFF FAN");

	}
	
}
class bulb implements swicth1{

	@Override
	public void on() {
		System.out.println("Turned ON BULB");
		
	}

	@Override
	public void off() {
		System.out.println("Turned OFF BULB");
		
	}
	
}

class useDevice{
	public static swicth1 useSwitch(char s) {
		if(s=='f') {
			return new fan();	
		}else {
			return new bulb();
		}	
	}
}


public class RunTimePoly {

	
	public static void main(String[] args) {
        swicth1 ss= useDevice.useSwitch('f');
          ss.on();
          ss.off();
       //   useDevice.useSwitch("b");

		
	}

}
