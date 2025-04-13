package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchdatafromExcelfile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Convert excel file into java object
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		
		//Fetch the Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the Sheet
		Sheet sh = wb.getSheet("data");
		
		//Fetch the row
		Row r = sh.getRow(1);
		 
	
		//Fetch the Cell
		Cell c = r.getCell(0);
		
		//Fetch the data
		String data = c.getStringCellValue();
		System.out.println(data);
		
		//close the excel file
		wb.close();
		
	}

}
