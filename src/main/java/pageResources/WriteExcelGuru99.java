package pageResources;




import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelGuru99 {

    

    public void writeExcel(String fileName,String sheetName,String[] dataToWrite) throws IOException{
    	
    	//System.out.println("In write Excel");
        //Create an object of File class to open xlsx file

        File file =    new File(fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook guru99Workbook = null;

        //Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        guru99Workbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            guru99Workbook = new HSSFWorkbook(inputStream);

        }

        

    //Read excel sheet by sheet name    

    Sheet sheet = guru99Workbook.getSheet(sheetName);

    //Get the current count of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = sheet.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);
        System.out.println("Excel set cell data " + dataToWrite[j] );
        cell.setCellValue(dataToWrite[j]);
        //HSSFCellStyle style = (HSSFCellStyle) guru99Workbook.createCellStyle();
        //style.setDataFormat(HSSFDataFormat. .getBuiltinFormat("0.00"));
        //style.setDataFormat(cell.);
        //cell.setCellStyle(style);

        // fromat cell
        //if(j==13) {
        	//cell.setCellType(Cell.CELL_TYPE_NUMERIC); //setCellValue(dataToWrite[j]);
        //}

    }
    /*
     * HSSFRow row = sheet.createRow(sheet.getLastRowNum());
HSSFCell cell = row.createCell(0);
HSSFCellStyle style = workbook.createCellStyle();
style.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
cell.setCellStyle(style);
cell.setCellValue(Float.parseFloat("21.5"));
     * 
     * 
     */
    
    
    

    //Close input stream

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    guru99Workbook.write(outputStream);

    //close output stream

    outputStream.close();

    }

}