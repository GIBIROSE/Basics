package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trial1 {
	public static void main(String[] args) throws Exception {

		FileInputStream fsIP = new FileInputStream(new File("C:\\\\Users\\\\Binu\\\\Desktop\\\\folderlearn\\\\2.xlsx")); // Read
		XSSFWorkbook wb = new XSSFWorkbook(); // Access the workbook
		XSSFSheet sheet = wb.getSheetAt(0);
		Object data[][] = { { "Gibi", "Danny", "Bibbin" }, { "Raji", "Manna", "Ponni" } };

		int rows = data.length;
		int cols = data[0].length;
		System.out.println(rows);
		System.out.println(cols);

		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);
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
		String path="C:\\\\Users\\\\Binu\\\\Desktop\\\\folderlearn\\\\2.xlsx";
		FileOutputStream out=new FileOutputStream(path);
		wb.write(out);
		out.close();
		System.out.println("success");
	}
}
