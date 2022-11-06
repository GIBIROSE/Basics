package write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trial2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fsIP = new FileInputStream(new File("C:\\Users\\Binu\\Desktop\\folderlearn\\m.xlsx")); // Read
		// the
		XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook

		XSSFSheet sheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
		System.out.println("hi");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		if (cell == null)
			cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Updated Value");
		Cell cell1 = row.getCell(3);
		if (cell == null)
			cell = row.createCell(2);
		cell1.setCellType(CellType.STRING);
		cell1.setCellValue("Updated Value");
		Cell cell2 = row.getCell(2);
		if (cell == null)
			cell = row.createCell(4);
		cell2.setCellType(CellType.STRING);
		cell2.setCellValue("Updated Value");

		FileOutputStream fileOut = new FileOutputStream("C:\\\\Users\\\\Binu\\\\Desktop\\\\folderlearn\\\\m.xlsx");
		wb.write(fileOut);
		fileOut.close();
		System.out.println("success");

	}
}
