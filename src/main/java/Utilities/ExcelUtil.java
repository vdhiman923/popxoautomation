package Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

public static XSSFSheet ExcelWSheet;
public static XSSFWorkbook ExcelWBook;
public static XSSFCell Cell;
public static XSSFRow Row;
	// This method is to set the File path and to open the Excel file, Pass Excel
	// Path and Sheet name as Arguments to this method

public static void setExcelFile() throws Exception 
{
try {
 // Open the Excel file
//FileInputStream ExcelFile = new FileInputStream(AllConstants.PathofExcelFile);//+AllConstants.excelTestDataFilename);
	FileInputStream ExcelFile = new FileInputStream("/Users/vandana/Desktop/TestData.xlsx");
	// Access the required test data sheet
ExcelWBook = new XSSFWorkbook(ExcelFile);
ExcelWSheet = ExcelWBook.getSheet(AllConstants.sheetname);
} 
catch (Exception e){

throw (e);
}

}

public static String getCellData(int RowNum, int ColNum) throws Exception{
	 
    try{
    	
    	Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

        String CellData = Cell.getStringCellValue();

        return CellData;

        }catch (Exception e){

return "";

        }

  }


public static String returncelldata(int rno, int cno) throws Exception
{
setExcelFile();
String str= getCellData(rno, cno);

return str;
}
}

