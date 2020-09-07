package seleniumTest.Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		

		FileInputStream fis = new FileInputStream("/Users/farrukhka/Documents/ExcellSheet.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++) 
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify Testcases coloumn by scanning the entire first row

				Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> cel = firstrow.cellIterator(); // row is collection of cells
				int k = 0;
				int coloumn = 0;
				while (cel.hasNext()) 
				{
					Cell value = cel.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases"));
					{
						coloumn = k;
					}
					k++;

				}

				System.out.println(coloumn);
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase"))
					{
						
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext()) 
						{
							a.add(cv.next().getStringCellValue()); 
							
						}
							
				}

			}
		}
	}
	}
}

