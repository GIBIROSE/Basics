package write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SDETforeach {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		//Object data[][] = { { "Name", "place", "address" }, { "abc", "pqr", "lmn" } };
        
		ArrayList<Object[]> data=new ArrayList<Object[]>();
		data.add(new Object[] {"Name", "place", "address"});
		data.add(new Object[] {"Name1", "place1", "address1"});
		data.add(new Object[] {"Name2", "place2", "address2"});


		
		
		
		
		
		int rowCount=0;
		for(Object emp[]: data) {
			XSSFRow row=sheet.createRow(rowCount++);
				int columnCount=0;
				for(Object value:emp)
				{
					XSSFCell cell=row.createCell(columnCount++);
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
		
		
		
		String filepath = "C:\\\\traininingAutomationprograms\\\\automationselenium\\\\5.XLSX";
		FileOutputStream out = new FileOutputStream(filepath);

		workbook.write(out);
		out.close();
		System.out.println("success");
	}
}
