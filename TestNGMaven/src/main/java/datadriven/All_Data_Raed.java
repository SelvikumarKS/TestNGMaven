package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data_Raed {
	public static void allData() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestNGMaven\\Driver\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("java");
		int rowsize=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowsize;i++) {
			XSSFRow r=s.getRow(i);
			int cellsize=r.getPhysicalNumberOfCells();
			for(int j=0;j<cellsize;j++) {
				XSSFCell c=r.getCell(j);
				CellType ce=c.getCellType();
				if(ce.equals(CellType.STRING)) {
					String v = c.getStringCellValue();
					System.out.print(v);
				}else if(ce.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int n=(int)d;
					System.out.print(n);
					
				}
				System.out.print("|");
				
				
			}
			System.out.println();
		}
		
		

	}
	public static void main(String[] args) throws Exception {
		allData();
		
		
	}


}
