package excelwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class UpdateExcelWrite {
public static void main(String[] args) throws Exception {
	

	//private static void modifyExistingWorkbook() throws InvalidFormatException, IOException {
        // Obtain a workbook from the excel file
		
		
		
        Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\Binu\\Desktop\\folderlearn\\recent.xlsx"));

        // Get Sheet at index 0
        Sheet sheet = (Sheet) workbook.getSheetAt(0);

        // Get Row at index 1
        Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(1);

        // Get the Cell at index 2 from the above row
        Cell cell = row.getCell(2);

        // Create the cell if it doesn't exist
        if (cell == null)
            cell = row.createCell(2);

        // Update the cell's value
        cell.setCellType(CellType.STRING);
        cell.setCellValue("Updated Value");

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Binu\\Desktop\\folderlearn\\recent.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }
}
