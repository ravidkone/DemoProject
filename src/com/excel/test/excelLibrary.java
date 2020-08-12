package com.excel.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelLibrary {

	public static void main(String[] args) {
		
		//readExcel();
		writeExcel();
		
		
	}

	private static void writeExcel() {
		String sPath="/Users/ravi.kone/Documents/Ravi Kone/Ravi 247 Docs/RAVI (2)/RAVI/Selenium/java progs/DemoProject/testdata.xlsx";

		try {
			
			FileInputStream fis=new FileInputStream(sPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet("Sheet1");
			Row r=s.createRow(3);
			Cell c=	r.createCell(0);
			c.setCellValue("vinodkk");
			
			FileOutputStream fw=new FileOutputStream(sPath);
			wb.write(fw);
			wb.close();
			System.out.println("written");
		//	Cell c=	r.getCell(1);
		//	String value=c.getStringCellValue();
		//	System.out.println(value);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void readExcel() {
String sPath="/Users/ravi.kone/Documents/Ravi Kone/Ravi 247 Docs/RAVI (2)/RAVI/Selenium/java progs/DemoProject/testdata.xlsx";
		
		try {
			FileInputStream fs=new FileInputStream(sPath);
			Workbook wb=WorkbookFactory.create(fs);
			Sheet s=wb.getSheet("Sheet1");
			Row r=s.getRow(1);
			Cell c=	r.getCell(1);
			String value=c.getStringCellValue();
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
