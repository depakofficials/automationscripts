package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSingleRowDataFromExcel {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File filepath = new File("C:\\Users\\Depak\\eclipse-workspace\\LMSproject\\outputfiles\\workbook.xlsx");
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);
		XSSFSheet sheets = workbook.getSheet("Sheet1");
		XSSFRow rows = sheets.getRow(5);
		XSSFCell cell = rows.getCell(0);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);
	}
}
