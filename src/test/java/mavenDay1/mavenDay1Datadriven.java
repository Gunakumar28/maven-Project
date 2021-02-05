package mavenDay1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenDay1Datadriven {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*File file = new File("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\Mavenday1Execl.xlsx");
		FileInputStream stream = new FileInputStream(file);                                            */
	
		//To get the  value from excel sheet in one value
		/*	Workbook excelsheet= new XSSFWorkbook(stream);
		Sheet sheet = excelsheet.getSheet("MavenFirstDay");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);                                                                 */
		
		//To get all value from excel sheet
	/*	Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("MavenFirstDay");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
				}
		}
		driver.quit();                                                                                          */
		
		//To Get Value and Number In Excel       [DataDriven Framework]
		File file =new File("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\Mavenday1Execl.xlsx");
		FileInputStream fileInputStream=  new FileInputStream(file);
		Workbook workbook = new  XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("MavenFirstDay");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
				
				
			}
		}
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static Workbook XSSFWorkbook(FileInputStream fileInputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
