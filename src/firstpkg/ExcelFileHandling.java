package firstpkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelFileHandling
{

	public static void readexcel() throws Exception
	{
		File f = new File("C:\\Users\\Santosh\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Sheet2");
		
		int r = sh1.getPhysicalNumberOfRows();
		//System.out.println(r);  //3
		
		for(int i=0;i<r;i++)  //i=0
		{
			XSSFRow row = sh1.getRow(i);  //i=0
			
			int c = row.getPhysicalNumberOfCells();
			//System.out.println(c);
			
			for(int j=0;j<c;j++)  //j=0
			{
				XSSFCell col = row.getCell(j);  //j=0
				
				if(col.getCellType()==CellType.NUMERIC)
				{
					double val = col.getNumericCellValue();
					System.out.println(val + "   ");
				}
					
				else
				{
					String val = col.getStringCellValue();
					System.out.println(val + "   ");
				}
				
				
				
				
				
			
			}
			
			System.out.println();
			
		}
		
		/*
		//First row data
		XSSFRow row1 = sh1.getRow(0);
		XSSFCell col1 = row1.getCell(0);
		String val1 = col1.getStringCellValue();
		System.out.println(val1);
		
		//Second row data
		XSSFRow row2 = sh1.getRow(1);
		XSSFCell col21 = row2.getCell(0);
		String val21 = col21.getStringCellValue();
		System.out.print(val21 + "       ");
		
		XSSFCell col22 = row2.getCell(1);
		String val22 = col22.getStringCellValue();
		System.out.println(val22);
		
		//Third row data
		XSSFRow row3 = sh1.getRow(2);
				
		*/
	}
	
	public static void main(String[] args) throws Exception {
		
		readexcel();
		
		for(int a=1; a<=10 ; a++)
		{
			System.out.println(2*a);
		}
		
	}
	
}
