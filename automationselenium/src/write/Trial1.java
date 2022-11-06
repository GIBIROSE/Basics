package write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trial1 {

	
	public static void main(String[] args) throws Exception {

		FileInputStream fsIP = new FileInputStream(new File("C:\\Users\\Binu\\Desktop\\folderlearn\\m.xlsx")); // Read
																													// the
		XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook

		XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
		System.out.println("hi");

		worksheet.createRow(1).createCell(0).setCellValue("Age");
		worksheet.createRow(1).createCell(1).setCellValue("value");

		worksheet.createRow(1).createCell(2).setCellValue("set");
		worksheet.createRow(1).createCell(3).setCellValue("India");
		worksheet.createRow(1).createCell(4).setCellValue("RAK");
		worksheet.createRow(1).createCell(5).setCellValue("Kerala");
		//Cell cell;
		 

		try {

			FileOutputStream output_file = new FileOutputStream(
					new File("C:\\Users\\Binu\\Desktop\\folderlearn\\m.xlsx"));

			wb.write(output_file);
		} // write changes
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}