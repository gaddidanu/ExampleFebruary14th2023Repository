package com.sgtesting.tests.ObjectMap;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class UsingExcelObjMap {

	Workbook wb=null;
	public UsingExcelObjMap(String Filepath)
	{
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(Filepath);
			wb=new XSSFWorkbook(fin);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public By GetLocator(String logicalname)
	{
		By by=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int i=1;i<rc;i++)
			{
				row=sh.getRow(i);
				cell=row.getCell(0);
				if(cell.getStringCellValue().toLowerCase().trim().equals(logicalname.toLowerCase().trim()))
				{
					cell=row.getCell(1);
					String locatorName=cell.getStringCellValue();
					cell=row.getCell(2);
					String locatorValue=cell.getStringCellValue();
					System.out.println(locatorName+" "+locatorValue);
					switch(locatorName.toLowerCase())
					{
					case "id":
						by=By.id(locatorValue);
						break;
					case "name":
						by=By.name(locatorValue);
						break;
					case "classname":
						by=By.className(locatorValue);
						break;
					case "xpath":
						by=By.xpath(locatorValue);
						break;
					case "linktext":
						by=By.linkText(locatorValue);
						break;
					case "cssselector":
						by=By.cssSelector(locatorValue);
						break;
					case "tagname":
						by=By.tagName(locatorValue);
						break;		
						
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return by;
	}
	
}
