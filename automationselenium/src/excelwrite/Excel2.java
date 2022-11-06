//package excelwrite;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.google.common.collect.Table.Cell;
//
//public class Excel2 {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//
//		File excel = new File("C://temp/Employee.xlsx");
//		FileInputStream fis = new FileInputStream(excel);
//		XSSFWorkbook book = new XSSFWorkbook(fis);
//		XSSFSheet sheet = book.getSheetAt(0);
//		Iterator<Row> itr = sheet.iterator();
//
//		Map<String, Object[]> newData = new HashMap<String, Object[]>();
//		newData.put("7", new Object[] { 7d, "Sonya", "75K", "SALES", "Rupert" });
//		newData.put("8", new Object[] { 8d, "Kris", "85K", "SALES", "Rupert" });
//		newData.put("9", new Object[] { 9d, "Dave", "90K", "SALES", "Rupert" });
//		
//		Set<String> newRows = newData.keySet();
//		int rownum = sheet.getLastRowNum();
//		
//		for (String key : newRows)
//		{
//			Row row = sheet.createRow(rownum++);
//			Object[] objArr = newData.get(key);
//			int cellnum = 0;
//			for (Object obj : objArr) {
//				Cell cell = (Cell) row.createCell(cellnum++);
//				if (obj instanceof String) {
//					((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((String) obj);
//				} else if (obj instanceof Boolean) {
//					((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((Boolean) obj);
//				} else if (obj instanceof Date) {
//					((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((Date) obj);
//				} else if (obj instanceof Double) {
//					cell.setCellValue((Double) obj);
//				}
//			}
//
//			// open an OutputStream to save written data into Excel file FileOutputStream os
//			// = new FileOutputStream(excel); book.write(os); System.out.println("Writing on
//			// Excel file Finished ..."); // Close workbook, OutputStream and Excel file to
//			// prevent leak
//			os.close();
//			book.close();
//			fis.close();
//		}
//
//	}
//
//}
