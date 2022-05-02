package other;

import java.util.ArrayList;

//import java.util.ArrayList;

import com.payroll.utilities.ExcelLibrary;

public class SampleExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ExcelLibrary lib = new ExcelLibrary();
		ArrayList excel=lib.getData("clientdetails");
		System.out.println(excel.get(0));
		System.out.println(excel.get(1));
		System.out.println(excel.get(2));
		System.out.println(excel.get(3));
		System.out.println(excel.get(4));
		System.out.println(excel.get(5));
		
		
		

	}

}
