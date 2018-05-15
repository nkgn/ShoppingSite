package pageResources;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewExcelFile {
	public static void newExcel(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileName);
			//System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");

			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Date"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Product Name"));
			row1.createCell(2).setCellValue(createHelper.createRichTextString("First Retailer"));
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Price"));
			row1.createCell(4).setCellValue(createHelper.createRichTextString("Item Title"));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("Second Retailer"));
			row1.createCell(6).setCellValue(createHelper.createRichTextString("Price"));
			row1.createCell(7).setCellValue(createHelper.createRichTextString("Item Title"));
			row1.createCell(8).setCellValue(createHelper.createRichTextString("Third Retailer"));
			row1.createCell(9).setCellValue(createHelper.createRichTextString("Price"));
			row1.createCell(10).setCellValue(createHelper.createRichTextString("Item Title"));


			// Write the output to a file


			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void writeOrderDetailsInExcel(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		
		try {
			fileOut = new FileOutputStream(fileName);
			System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");

			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Email account"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Credit Card"));
			
			row1.createCell(2).setCellValue(createHelper.createRichTextString("Order Date"));
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Order No."));
			//row1.createCell(2).setCellValue(createHelper.createRichTextString("Product Name"));
			row1.createCell(4).setCellValue(createHelper.createRichTextString("Total Amount"));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("Status"));
			

			// Write the output to a file


			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void top10SuppliersExcel(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileName);
			System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");

			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Date"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Product Name"));
			row1.createCell(2).setCellValue(createHelper.createRichTextString("Position"));
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Retailer"));
			row1.createCell(4).setCellValue(createHelper.createRichTextString("Item Title"));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("Price"));
			
			
			// Write the output to a file
			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void walmartRankInExcel(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileName);
			System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");

			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Date"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Query"));
			row1.createCell(2).setCellValue(createHelper.createRichTextString("Walmart Rank"));
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Is Walmart Winner"));
			row1.createCell(4).setCellValue(createHelper.createRichTextString("Price Gap from Winner"));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("W position in 1st row"));
			row1.createCell(6).setCellValue(createHelper.createRichTextString("W position in 1st page"));
			row1.createCell(7).setCellValue(createHelper.createRichTextString("Winner"));
			row1.createCell(8).setCellValue(createHelper.createRichTextString("If Walmart is showing up"));
			
			
			// Write the output to a file
			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void GE_priceWinner(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileName);
			//System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");
			
			// set column width
			sheet.autoSizeColumn(6);// works. this will resize the column to the largest cell length.// We can set column width for each cell in the sheet        
			sheet.setColumnWidth(7, 9000);
			sheet.setColumnWidth(8, 7500);
			sheet.setColumnWidth(9, 7500);

			
			
			
			
			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Date"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Query"));
			row1.createCell(2).setCellValue(createHelper.createRichTextString("Results Found (Y/N)"));
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Walmart Present Y/N"));
			
			row1.createCell(4).setCellValue(createHelper.createRichTextString("Is Walmart Winner Y/N"));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("Winner"));
			row1.createCell(6).setCellValue(createHelper.createRichTextString("Price Gap from Winner"));
			
			
			row1.createCell(7).setCellValue(createHelper.createRichTextString("# of walmart in 1st row"));
			row1.createCell(8).setCellValue(createHelper.createRichTextString("# of walmart in 1st page"));
			
			// By applying style for cells we can see the total text in the cell for specified width
						//HSSFCellStyle cellStyle = wb.createCellStyle();
						//cell.setCellStyle(cellStyle );
						//cellStyle.setWrapText(true);
			
			// Write the output to a file
			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void GE_price_New_Winner(String fileName) {
		Workbook wb = new XSSFWorkbook();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileName);
			//System.out.println("File Created  " + fileOut.getClass());
			// Workbook wb = new XSSFWorkbook();

			CreationHelper createHelper = wb.getCreationHelper();
			org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");

			// Create the first Row

			Row row1 = sheet.createRow((short) 0);

			// inserting first row cell value
			//row1.createCell(1).setCellValue(createHelper.createRichTextString("No."));
			row1.createCell(0).setCellValue(createHelper.createRichTextString("Date"));
			row1.createCell(1).setCellValue(createHelper.createRichTextString("Query"));
			row1.createCell(2).setCellValue(createHelper.createRichTextString("Results Found (Y/N)"));
			
			row1.createCell(3).setCellValue(createHelper.createRichTextString("Walmart Present Y/N"));
			row1.createCell(4).setCellValue(createHelper.createRichTextString("First Position of Walmart if Present "));
			row1.createCell(5).setCellValue(createHelper.createRichTextString("# of walmart in 1st row"));
			row1.createCell(6).setCellValue(createHelper.createRichTextString("# of walmart in 1st page"));
			
			row1.createCell(7).setCellValue(createHelper.createRichTextString("Is Walmart 1st result  Y/N"));
			
			row1.createCell(8).setCellValue(createHelper.createRichTextString("1st result product Title"));
			row1.createCell(9).setCellValue(createHelper.createRichTextString("1st result supplier"));
			row1.createCell(10).setCellValue(createHelper.createRichTextString("1st result product price"));
			
			// to be repeated for each winner from walmart
			row1.createCell(11).setCellValue(createHelper.createRichTextString("Winner from Walmart"));
			row1.createCell(12).setCellValue(createHelper.createRichTextString("Winner for Item Name"));
			row1.createCell(13).setCellValue(createHelper.createRichTextString("Price Gap from Walmart"));
			
			
			
			// Write the output to a file
			wb.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
