package excelwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RecentlyModifiedFile {

	
	private File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
		
	
	public static void main(String[] args) throws IOException {
		RecentlyModifiedFile rm=new RecentlyModifiedFile();
		File f=rm.getLatestFilefromDir("C:\\Users\\Binu\\Desktop\\folderlearn");
		System.out.println(f);
		
		//File src=new File(f);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		
		sheet.getRow(1).getCell(1).setCellValue("abcd");
		FileOutputStream fos=new FileOutputStream(f);
		xsf.write(fos);
		xsf.close();
	
		
		

	}

}
