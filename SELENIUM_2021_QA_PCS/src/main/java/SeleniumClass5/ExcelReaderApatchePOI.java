package SeleniumClass5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderApatchePOI {

	public static void main(String[] args) throws IOException {
		/*
		 * reading data from Excel
		 * 1. add maven dependency for apatche POI-OOXML and POI
		 * 		XSSF / used for files end with .xlsx version 2007+ 
		 * 		and HSSF for files end with .xls versions up to 2003 classes are included 
		 * 
		 * 2. How we can access our data from excel
		 * 		Step 1: create a work book class
		 * 		Step 2 Axxess the desired worksheet
		 * 		Step 3: we need to access the row
		 * step 4: get access to the row cells
		 * which is locate first the test case column and find laptop search
		 * step 6: retrive the data for each cell and pass it in to our test. 
		 * 
		 * 
		 * 
		 */
//Excel Object Model
		
List <String> testData = new ArrayList();
		
		//import the file 
		FileInputStream file=new FileInputStream("C:\\Programming Related\\Eclipse\\Excel\\apachePOI.xlsx");
		
		//Access the workbook
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		//the workbook has access to file object allowing the workbook to access the excel file
		
		XSSFSheet worksheet=workbook.getSheet("Demo");
		
		//now the worksheet has access to all the rows in the worksheet(a collection of rows)
		//access the laptop search test case in the worksheet row
		//to do this we need to use Iterator to iterate in each rows to find the required data.
		
		Iterator<Row> rows =worksheet.iterator();
		
		// now we have all the rows using hasNext() and next() methods
		
		//New we need to focus on the test case column header row
		
		Row rowHeader=	rows.next(); // rowHeader has access to the 1st row(is a collection of cells)

		//now lets access each cell
		
		Iterator<Cell> cells=rowHeader.cellIterator();
			
		
		//read the cells and verify  to get the index
		
		int x=0; int colIndex=0; //default index is starting 0;
		
		
		while (cells.hasNext()) {
		Cell cellValue=cells.next();
			if (cellValue.getStringCellValue().equals("TestCase")) {
				colIndex=x;
			}
			x++;
		}
		System.out.println(" column index is : "+ colIndex);
		
		
		//Iterate all rows
		
		while(rows.hasNext()) {
			Row currentRow=rows.next();
			if(currentRow.getCell(colIndex).getStringCellValue().equalsIgnoreCase("Laptop Search")) {
				Iterator<Cell> testRowCell= currentRow.cellIterator();
				
				
				//Iterate in the cells
				while(testRowCell.hasNext()) {
					
					Cell testCell=testRowCell.next();
					
//					testData.add(testCell.getStringCellValue());
					
					//instead of the above retrival in the Array 
					switch (testCell.getCellType()) {
					case STRING: 
					String string=(testCell.getStringCellValue());
					testData.add(string);
					break;
					case NUMERIC:	
					String numeric=String.valueOf(testCell.getNumericCellValue());
					testData.add(numeric);
					break;
					case BOOLEAN:	
					String Boolean=String.valueOf(testCell.getBooleanCellValue());
					testData.add(Boolean);
					break;
					default:
						String str=(testCell.getStringCellValue());
						testData.add(str);
						
					}
					
				}
				
			}
		}
		
		
		// Create a Method
		
		System.out.println(testData);
		
		
		
		
		
	}

	}


