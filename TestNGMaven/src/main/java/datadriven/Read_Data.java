package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void readData() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestNGMaven\\Driver\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("java");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(3);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);	
		}else if(cellType.equals(cellType.NUMERIC)) {
			CellType numeric =cellType.NUMERIC;
			System.out.println(numeric);
			
		}

		
	}
public static void main(String[] args) throws Exception {
	readData();
	
}


}
