package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FetchMultipleDataFromExcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//convert physical file into java object
		
		FileInputStream fis = new FileInputStream("D:\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
 
		//fetch the workbook
		
	    Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
	    
	     Sheet sh = wb.getSheet("data");
	     
	     //fetch the row
	     
	     Row r=sh.getRow(4);
	     
	     //fetch the cell
	     
	     Cell c=r.getCell(1);
	     
	     //convert the data  into Integer to string
	     
	     DataFormatter df = new DataFormatter();
	     
	     String data = df.formatCellValue(c);
	     
	     System.out.println(data);
	     
	     wb.close();
	     
	}

}
