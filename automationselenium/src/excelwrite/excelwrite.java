package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwrite {

	
	public void display() throws IOException {
		File src=new File("");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		
		sheet.getRow(1).getCell(1).setCellValue("abcd");
		FileOutputStream fos=new FileOutputStream(src);
		xsf.write(fos);
		xsf.close();
		
	}
}
