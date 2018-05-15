package pageResources;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelGuru99 {

	public Object[][] readExcel(String fileName, String sheetName) throws IOException {

		try {

			// Create an object of File class to open xlsx file

			// File file = new File(filePath+"\\"+fileName);

			File file = new File(fileName);
			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			Workbook guru99Workbook = null;

			// Find the file extension by splitting file name in substring and
			// getting only extension name

			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			// Check condition if the file is xlsx file

			if (fileExtensionName.equals(".xlsx")) {

				// If it is xlsx file then create object of XSSFWorkbook class

				guru99Workbook = new XSSFWorkbook(inputStream);

			}

			// Check condition if the file is xls file

			else if (fileExtensionName.equals(".xls")) {

				// If it is xls file then create object of XSSFWorkbook class

				guru99Workbook = new HSSFWorkbook(inputStream);

			}

			// Read sheet inside the workbook by its name

			Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

			// Find number of rows in excel file

			int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
			String[][] tabArray = new String[rowCount + 1][17];

			// Create a loop over all the rows of excel file to read it
			String value;
			for (int i = 0; i < rowCount + 1; i++) {

				Row row = guru99Sheet.getRow(i);

				// Create a loop to print cell values in a row

				for (int j = 0; j < row.getLastCellNum(); j++) {

					DataFormatter df = new DataFormatter();
					value = df.formatCellValue(row.getCell(j));
					//System.out.println(" cell1 = " + value);
					tabArray[i][j] = value;
				}

			}

			return tabArray;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
