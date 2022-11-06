package excelwrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteCode {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		// create a sheet
		XSSFSheet sheet = workbook.createSheet("Data");

		// add data to sheet
		// object contains all kinds of data 2 dimensional row and columns
		Object data[][] = { { "Name", "place", "address" }, { "abc", "pqr", "lmn" } };
        // using loop

		int rows = data.length;
		int cols = data[0].length;
		System.out.println(rows);
		System.out.println(cols);
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);
			// writing in cells for inner loop
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.createCell(c);
				Object value = data[r][c];

				if (value instanceof String) {
					cell.setCellValue((String) value);
				}
				if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
			}

		}
		String filepath = "C:\\traininingAutomationprograms\\automationselenium\\5.XLSX";
		FileOutputStream out = new FileOutputStream(filepath);

		workbook.write(out);
		out.close();
		System.out.println("success");
	}
}
