package com.mytime.pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ImportXl {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		//read the file from hard drive
		FileInputStream fis = new FileInputStream("/home/raman/Desktop/Mumbai Spreadsheet.xlsx");
		System.out.println("File input stream completed");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s= w.getSheet("Sheet");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		
		String v = c.getStringCellValue();	
		System.out.println(v);
	}

}
