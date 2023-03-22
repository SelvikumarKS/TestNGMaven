package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void writeData() throws Exception {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestNGMaven\\Driver\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet ss = wb.getSheet("java");
		XSSFRow r = ss.createRow(0);
		XSSFCell c = r.createCell(0);
        c.setCellValue("Username");
        wb.getSheet("java").getRow(0).createCell(1).setCellValue("password");
        wb.getSheet("java").createRow(1).createCell(0).setCellValue("selvikumar");
        wb.getSheet("java").getRow(1).createCell(1).setCellValue("sel@123");
        wb.getSheet("java").createRow(2).createCell(0).setCellValue("madhu");
        wb.getSheet("java").getRow(2).createCell(1).setCellValue("madhu@13");
        wb.getSheet("java").getRow(0).createCell(2).setCellValue("Testcase");
        wb.getSheet("java").getRow(0).createCell(3).setCellValue("Testscenario");
        wb.getSheet("java").getRow(1).createCell(2).setCellValue("login");
        wb.getSheet("java").getRow(1).createCell(3).setCellValue("click login");
        wb.getSheet("java").getRow(2).createCell(2).setCellValue("search");
        wb.getSheet("java").getRow(2).createCell(3).setCellValue("clicksearch");
        wb.getSheet("java").createRow(3).createCell(0).setCellValue("tamil");
        wb.getSheet("java").getRow(3).createCell(1).setCellValue("tamilraj");
        wb.getSheet("java").getRow(3).createCell(2).setCellValue("bookhotel");
        wb.getSheet("java").getRow(3).createCell(3).setCellValue("clickhotel"); 
        FileOutputStream fos=new FileOutputStream(f);
        wb.write(fos);
	}

	public static void main(String[] args) throws Exception {
		writeData();
		
	}


}
