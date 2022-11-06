package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Try1 {

	public static void main(String[] args) throws IOException {

		String path = "C:\\traininingAutomationprograms\\automationselenium\\testdata.XLSX";

		FileInputStream fs = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);

		for(Row r:sheet) {
		for(Cell c:r)
		{
			System.out.print(c);
		}
		System.out.println("     ");
		}
		
		
	}

}
