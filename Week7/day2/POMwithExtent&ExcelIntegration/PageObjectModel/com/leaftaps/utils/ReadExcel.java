package com.leaftaps.utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] extractDataFromExcel(String fileName) throws IOException {
		XSSFWorkbook excel;
		excel = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = excel.getSheet("Sheet1");
		int totalRowCount = sheet.getLastRowNum();
		short totalColumnCount = sheet.getRow(totalRowCount).getLastCellNum();
		String [][] testRecord = new String[totalRowCount][totalColumnCount];
		for (int i = 1; i <= totalRowCount; i++) { // represents Row in the sheet
			System.out.print("|");
			for (int j = 0; j < totalColumnCount; j++) { // represents column in the sheet
				String testData = sheet.getRow(i).getCell(j).getStringCellValue();
				testRecord[i-1][j]=testData;
				System.out.print(testData+"|");
			}
			System.out.println();
		}
		excel.close();
		return testRecord;
	}
}
