package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writer {

	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\ELCOT-Lenovo\\Documents\\Maven1pm\\Excel Data\\Excel.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
 Workbook w = new XSSFWorkbook(fin);
 Sheet s = w.getSheet("Data");
 Row r = s.getRow(3);
 
 Cell c = r.getCell(0);
 String value = c.getStringCellValue();
 
 if (value.equals("Selvi")) {
c.setCellValue("Testing");
}
 
 FileOutputStream fOut = new FileOutputStream(f);
 w.write(fOut);
 System.out.println("Done");
	}
}

