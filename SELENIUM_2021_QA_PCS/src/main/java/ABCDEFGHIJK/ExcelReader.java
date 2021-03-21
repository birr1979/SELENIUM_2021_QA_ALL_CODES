package ABCDEFGHIJK;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void  main (String [] args) throws IOException {
		
			
		XSSFWorkbook workbook= new XSSFWorkbook("C:\\Users\\birr_\\Desktop\\pcs database.xlsx");
		XSSFSheet sheet=workbook.getSheet("PCSConsultants_Employees");
		Iterator <Row> rows=sheet.rowIterator();
	
		Row rowHeader=rows.next();
//		System.out.println(rows.next().getRowNum());
		Iterator<Cell> cells=rowHeader.cellIterator();
		 int x=0, colIndex=0;
		 while (cells.hasNext()) {
			 Cell cellValue=cells.next();
			  if (cellValue.getStringCellValue().equalsIgnoreCase("FirstName")) {
				  colIndex=x;
			  }x++;
		 }

		System.out.println("Column Index is: "+colIndex);
			
		List<String> myList=new ArrayList();
		while (rows.hasNext()) {
			Row TestRow=rows.next();

			if (TestRow.getCell(colIndex).getStringCellValue().equals("Rana")) {
				Iterator<Cell> TestCell=TestRow.cellIterator();
				while (TestCell.hasNext()) {
					Cell cell=TestCell.next();
//		myList.add(cell.getStringCellValue());
//			System.out.println(myList);
					
					switch (cell.getCellType()) {
					case STRING: 
					String string=(cell.getStringCellValue());
//				System.out.print(" "+string);
				myList.add(string);
					break;
					case NUMERIC:	
					String numeric=String.valueOf(cell.getNumericCellValue());
//				System.out.print(" "+numeric);
				myList.add(numeric);
					break;
					case BOOLEAN:	
					String Boolean=String.valueOf(cell.getBooleanCellValue());
//				System.out.print(" "+Boolean);
				myList.add(Boolean);
					break;
									
					}
							
					}
							
			}
		}
		System.out.print(myList);
	}
		
}
