package com.array.test;

public class arrExpample {

	public static void main(String[] args) {
		int[] intArr=new int[3];
		
		double[] d=new double[3];
		
		char[] c=new char[3];
		c[0]='A';
		c[1]='B';
		c[2]='C';
		
		boolean[] b=new boolean[3];
		float[] f=new float[3];
		long[] l=new long[3];
		byte[] bt=new byte[3];
		
		short[] s=new short[3];
				
		System.out.println(intArr);
		System.out.println(d);
		System.out.println(c);

		System.out.println(b);
		System.out.println(f);
		System.out.println(l);
		System.out.println(bt);
		System.out.println(s);
		
		arrExpample[] ref=new arrExpample[3];
		String[] ref1=new String[3];
		System.out.println(ref);
		System.out.println(ref1);			
	}
}
