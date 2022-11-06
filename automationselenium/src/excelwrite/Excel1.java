package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	
	public static void main(String[] args) throws IOException {
		
		
		File src=new File("C:\\Users\\Binu\\Desktop\\esg.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		
		sheet.getRow(2).getCell(1).setCellValue("Test");
		sheet.getRow(2).getCell(2).setCellValue("test123");
		sheet.getRow(2).getCell(3).setCellValue("50000000");
		sheet.getRow(2).getCell(4).setCellValue("100");
		sheet.getRow(2).getCell(5).setCellValue("Retail");
		sheet.getRow(2).getCell(6).setCellValue("12TH street");
		sheet.getRow(2).getCell(7).setCellValue("156789");
		sheet.getRow(2).getCell(7).setCellValue("Frankfurt");
		sheet.getRow(2).getCell(7).setCellValue("Germany");
		sheet.getRow(2).getCell(7).setCellValue("42.333");
		sheet.getRow(2).getCell(7).setCellValue("61.2222");
		
		FileOutputStream fos=new FileOutputStream(src);
		xsf.write(fos);
		xsf.close();
		
		
		
	}


}
