package write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excelread.Path;

public class TRIALwriteAthira {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(Path.TESTPATH);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);

		Object data[][] = { { "1", "2", "3" ,"4","5","6","7","8","9"} };
		int rowCount = 1;
		for (Object emp[] : data) {
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object value : emp) {
				XSSFCell cell = row.createCell(columnCount++);
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

		String filepath = Path.TESTPATH;
		FileOutputStream out = new FileOutputStream(filepath);

		workbook.write(out);
		out.close();
		System.out.println("success");

	}
}
