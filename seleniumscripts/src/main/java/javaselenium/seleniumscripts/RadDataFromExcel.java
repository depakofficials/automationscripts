package javaselenium.seleniumscripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RadDataFromExcel {

	public static void main(String[] args) throws IOException {
		File filepath = new File("C:\\Users\\Depak\\eclipse-workspace\\seleniumscripts\\outputfiles\\datadriventesting.xlsx");
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheets = workbook.getSheet("Sheet1");
		int lastrow = sheets.getLastRowNum();
		int lastcell=sheets.getRow(1).getLastCellNum();
		
		for (int i=0;i<=lastrow; i++) {
			XSSFRow rows = sheets.getRow(i);
			for (int j=0;j<lastcell; j++) {
				XSSFCell cells = rows.getCell(j);
				switch(cells.getCellType()) {
					case STRING: 
						System.out.print(cells.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cells.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cells.getBooleanCellValue());
						break;
				}
				System.out.print(" -- ");
			}
			System.out.println();
		}
	}
}
