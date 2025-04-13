package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTotaldatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("data");
		
		for(int i=0; i <= sh.getLastRowNum();i++) {
			
			
			for(int j=0;j < sh.getRow(i).getLastCellNum();j++) {
				
				 String data = sh.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(data+" ");
			}
			System.out.println();
			
			
		}
		wb.close();
		}
		

	}


