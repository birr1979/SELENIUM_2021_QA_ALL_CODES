package SeleniumClass5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingExcel {

public static void main(String[] args) throws IOException {
List<String> testData=new ArrayList();
String excelFilePath=".\\testData\\apatche.xlsx";


FileInputStream input=new FileInputStream(excelFilePath);
		
XSSFWorkbook workbook= new XSSFWorkbook(input);
	XSSFSheet sheet =workbook.getSheetAt(0);
	
	//USING FOR LOOP
//	int rows=sheet.getLastRowNum();
//	int columns=sheet.getRow(1).getLastCellNum();
//	
//	for (int r=0;r<=rows;r++) {
//		XSSFRow row =sheet.getRow(r);
//		
//		for(int c=0;c<columns;c++) {
//			XSSFCell cell=row.getCell(c);
//			switch(cell.getCellType()) {
//			case STRING:  System.out.print(cell.getStringCellValue());break;
//			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
//			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
//			
//			}
//			System.out.print(" | ");
//		}
//		System.out.println(" ");
//	}
		
//USING ITERATOR
	
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	
	for (int i=0;i<rowCount;i++) {
		XSSFRow row=sheet.getRow(i);
		int cellCount=row.getPhysicalNumberOfCells();
		for(int j=0;j<cellCount;j++) {
			XSSFCell cell=row.getCell(j);
			
			switch (cell.getCellType()) {
			case STRING: 
			String string=(cell.getStringCellValue());
			testData.add(string);
			System.out.println(string);
			break;
			case NUMERIC:	
			String numeric=String.valueOf(cell.getNumericCellValue());
			testData.add(numeric);
			System.out.println(numeric);
			break;
			default:
				String str=(cell.getStringCellValue());
				testData.add(str);
				System.out.println(str);
		}
		}
	}
	workbook.close();
	input.close();
	
	System.out.print(testData);
	
	
		}

	
	}


