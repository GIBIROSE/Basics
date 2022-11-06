package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//		FileInputStream fsIP = new FileInputStream(new File("C:\\Users\\Binu\\Desktop\\folderlearn\\m.xlsx")); // Read
//		// the
//		XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
//
//		XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
//		System.out.println("hi");
		
		Workbook workbook = WorkbookFactory.create(new File("C:\\\\Users\\\\Binu\\\\Desktop\\\\folderlearn\\\\m.xlsx"));

        // Get Sheet at index 0
        Sheet sheet = workbook.getSheetAt(0);

        // Get Row at index 1
        Row row = sheet.getRow(1);

        // Get the Cell at index 2 from the above row
        Cell cell = row.getCell(2);

        // Create the cell if it doesn't exist
        if (cell == null)
            cell = row.createCell(2);

        // Update the cell's value
        cell.setCellType(CellType.STRING);
        cell.setCellValue("Updated Value");

	}

}
