package excelExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	public static void main(String[] args) {

		File file = new File("C:\\Users\\Vinay\\eclipse-workspace\\NewProject\\Resources\\Test excel.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook = new XSSFWorkbook(excel);
			sheet = wkbook.getSheet("Sheet1");
			//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
			int start=sheet.getFirstRowNum();
			int end=sheet.getLastRowNum();
			for(int i=start+1;i<=end;i++) {
				System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
				System.out.println(sheet.getRow(i).getCell(1).getNumericCellValue());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}	

}
