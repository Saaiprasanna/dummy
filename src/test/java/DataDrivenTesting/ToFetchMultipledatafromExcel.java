package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchMultipledatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");

	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheet("Data");
	
	for(int i=0;i<sh.getLastRowNum();i++) {
		String data = sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(data);
	}
	wb.close();
	}

}
