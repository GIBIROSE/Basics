package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trialyoutube {
	public static void main(String[] args) throws Exception {
		String path="C:\\\\Users\\\\Binu\\\\Desktop\\\\folderlearn\\\\m.xlsx";
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file); // Read
		// the
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet sheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
		System.out.println("hi");
		
		sheet.getRow(1).createCell(1).setCellValue("abcd");
		sheet.getRow(1).createCell(1).setCellValue("gibi");

		sheet.getRow(1).createCell(1).setCellValue("raji");
		sheet.getRow(1).createCell(1).setCellValue("danny");
		sheet.getRow(1).createCell(1).setCellValue("bibbin");

		
		FileOutputStream fos = new FileOutputStream(new File(path));

		wb.write(fos);	
		
	}

}
