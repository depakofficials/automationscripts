package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ShowFirstValueFromExcelSheet {
	public static void main(String[] args) throws IOException{
		String excelsheetpath = "C:\\Users\\Depak\\eclipse-workspace\\LMSproject\\outputfiles\\workbook.xlsx";
		FileInputStream fis = new FileInputStream(excelsheetpath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(1).getLastCellNum();
		
		for (int i=0;i <= lastrow;i++) {
			XSSFRow rows = sheet.getRow(i);
			for (int j=0; j < lastcell;j++) {
				XSSFCell cells = rows.getCell(j);
				switch (cells.getCellType()) {
				case STRING:
					System.out.print(cells.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cells.getNumericCellValue());
					break;
				case BOOLEAN: 
					System.err.println(cells.getBooleanCellValue());
					break;
				default :
					System.out.println("Default Method...");
				}
				System.out.print(" - ");
			}
			System.out.println();
		}
		
	}
}
