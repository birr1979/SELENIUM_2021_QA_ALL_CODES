package ABCDEFGHIJK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {

	public static void main(String[] args) throws IOException {
		List <String> testData = new ArrayList();
		//1st we need to setup dependencies for apatche POI
	
		//Import the file using the file input stream with  the location
		FileInputStream ExcelReader=new FileInputStream(System.getProperty("user.dir")+"\\testData\\ExcelReader.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(ExcelReader);
		XSSFSheet sheet=workbook.getSheet("B1");
		Iterator iterator= sheet.iterator();

		//read the cells and verify  to get the index
		
			while (iterator.hasNext()) {
				XSSFRow row=(XSSFRow) iterator.next();
				Iterator cellIterator= row.cellIterator();
				
				while (cellIterator.hasNext()) {
					XSSFCell cell= (XSSFCell) cellIterator.next();
					
					switch (cell.getCellType()) {
					case STRING: String string=(cell.getStringCellValue()); testData.add(string);break;
					case NUMERIC:String numeric=String.valueOf(cell.getNumericCellValue());	testData.add(numeric);break;
					case BOOLEAN:String Boolean=String.valueOf(cell.getBooleanCellValue());testData.add(Boolean);break;
					
					}
					
				}
			
			}
		
		
		
		System.out.print(testData);
		
		
		
	}

}
