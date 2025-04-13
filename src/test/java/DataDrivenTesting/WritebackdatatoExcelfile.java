package DataDrivenTesting;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WritebackdatatoExcelfile {
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	  FileInputStream fis = new FileInputStream("D:\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	  
	  
	   Workbook wb = WorkbookFactory.create(fis);
	   
	  Sheet sh = wb.getSheet("data");
	  
	  Row r =sh.createRow(5);
	   
	    Cell c = r.createCell(1);
	    
	    c.setCellValue("20000");
	    
	    FileOutputStream fos = new FileOutputStream("D:\\\\OneDrive\\\\Desktop\\\\New Microsoft Excel Worksheet.xlsx");
	    wb.write(fos);
	    
	    wb.close();
}
}
