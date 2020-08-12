package com.array.test;

public class derivedArr {

	int i;
	public derivedArr(int i) {
		this.i=i;
	}
	public String toString() {
		return "i="+i;
	}

	public static void main(String[] args) {
		
		derivedArr[] ref=new derivedArr[4];
		
		ref[0]=new derivedArr(10);
		ref[1]=new derivedArr(20);
		ref[2]=new derivedArr(30);
		ref[3]=new derivedArr(40);
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

}
