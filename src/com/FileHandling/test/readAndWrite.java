package com.FileHandling.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class readAndWrite {

	public static void main(String[] args) {
		String sWritePath = "/Users/ravi.kone/Documents/Ravi Kone/Ravi 247 Docs/RAVI (2)/RAVI/Selenium/java progs/DemoProject/writeFile";
		String sReadPath = "/Users/ravi.kone/Documents/Ravi Kone/Ravi 247 Docs/RAVI (2)/RAVI/Selenium/java progs/DemoProject/textFile";

		readFile(sReadPath);
		//writeFile(sWritePath);
	}

	public static void writeFile(String sPath) {

		try {
			FileWriter fw = new FileWriter(sPath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("I am vinni");
			bw.write("\nI am vinni boyfriend");
			bw.newLine();
			bw.write("I am vinod");
			bw.close();
			System.out.println("File written");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void readFile(String sPath) {

		String sLine;
		try {
			FileReader fr = new FileReader(sPath);
			BufferedReader br = new BufferedReader(fr);
			// sLine=br.readLine();
			while ((sLine = br.readLine()) != null) {
				System.out.println(sLine);
				if(sLine.contains("ravi")) {
					System.out.println("Yes found");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
