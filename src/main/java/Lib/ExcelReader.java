package Lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {

	Sheet sh;
	public ExcelReader(String filename,String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		
		Workbook wb = new HSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
	}
	public Object[][]exceltoArray(){
		Object[][] table;
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
		
		table = new Object[totalRows-1][totalCols];
		
		for(int r =1; r<totalRows; r=r+1) {
			for(int c =0;c<totalCols; c=c+1) {
				table[r-1][c]= getCellValue(r,c); //sh.getRow(r).getCell(c).getStringCellValue();
				
			}
		}
		
		return table;
	}
	
	
	public String getCellValue(int row, int col)  {
		Cell c = sh.getRow(row).getCell(col);
		String result;
		
		
				if(c.getCellType()==Cell.CELL_TYPE_STRING) {
					result = c.getStringCellValue();
					
				}
				else {
					if(c.getNumericCellValue()%1==0) {
						double d =(int)c.getNumericCellValue();
						int v = (int)d;
						result = ""+v;
					}
					else {
						double d =c.getNumericCellValue();
						result = ""+d;
					}
				}
					return result;
				}
			}
	

