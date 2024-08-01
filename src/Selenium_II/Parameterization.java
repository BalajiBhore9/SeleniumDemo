package Selenium_II;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\April21.xlsx");
        
        String stringvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        
        System.out.println(stringvalue);
	}

}
